package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Spinner
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightOneWayAdapter
import crocusoft.com.gez.util.AppSharedPreferences
import crocusoft.com.gez.flight_view_model.TicketDataViewModel
import crocusoft.com.gez.flight_view_model.TicketModelManager
import crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation
import crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService
import crocusoft.com.gez.services.RetrofitManager
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import retrofit2.Call
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.gson.Gson
import crocusoft.com.gez.flight_view_model.PricedItineraryItemViewModel
import kotlinx.android.synthetic.main.flight_search_error.view.*
import retrofit2.Callback
import kotlin.collections.ArrayList

class FlightOneWayActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    var combs: List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> = ArrayList()
    var combId = ""
    val afch = FlightOneWayAdapter()
    private lateinit var filterSpinner: Spinner
    private lateinit var filterButton: ImageButton
    private lateinit var listOfPrices:ArrayList<String>
    private lateinit var filterLayout: LinearLayout
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var searchErrorLinearLayout: View
    var oneWayOriginLocation = OriginLocation()
    var oneWayDestination = DestinationLocation()
    private lateinit var mainLinearLayout: LinearLayout
    var departTime: String = ""
   private lateinit var pricedItinerary:ArrayList<PricedItineraryItemViewModel>
    val fd: Gson = Gson()


    var ticketModel: TicketDataViewModel = TicketDataViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_one_way)
        var mShimmerViewContainer: ShimmerFrameLayout = ShimmerFrameLayout(this)
        val myPreferences = AppSharedPreferences(this)
        mShimmerViewContainer = findViewById(R.id.shimmer_view_container)
        recyclerView = findViewById(R.id.recyclerView2)

        //   val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java)
        listOfPrices = ArrayList()
        mainLinearLayout = findViewById(R.id.mailLinearLayout)
        filterLayout = findViewById(R.id.filterLinear)

        linearLayoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.layoutManager = linearLayoutManager
        val bundle = intent.extras
        searchErrorLinearLayout = layoutInflater.inflate(R.layout.flight_search_error,null)
//        var params: FrameLayout.LayoutParams =  FrameLayout.LayoutParams(
//        FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
//        params.gravity = Gravity.CENTER_VERTICAL;
//        params.gravity = Gravity.CENTER_HORIZONTAL
//        mainLinearLayout.setLayoutParams(params);
        searchErrorLinearLayout.newSearchButton.setOnClickListener(View.OnClickListener {
            super.onBackPressed()
        })
        oneWayOriginLocation = bundle.getParcelable<OriginLocation>("locatoon")
        oneWayDestination = bundle.getParcelable<DestinationLocation>("destination")
        departTime = bundle.getString("departTime")
        val bundleSend=Bundle()
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        mShimmerViewContainer.startShimmerAnimation()
        oneWayFlightSearch(service, object : RetrofitManager.Companion.OneWayApiCallback {
            override fun onSuccess(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, response: retrofit2.Response<Response>?) {
                doAsync {
                    ticketModel = TicketModelManager.getTicketList(response!!.body())
                    val objectDest = fd.toJson(ticketModel)
                    myPreferences.putString("oneWayTicketModel",objectDest)
                    uiThread {
                        mShimmerViewContainer.stopShimmerAnimation()
                        mShimmerViewContainer.setVisibility(View.GONE)
                        afch.addViewModel(ticketModel)
                        afch.getDepartTicketsList().sortBy { it.airItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                        afch.notifyDataSetChanged()
                        filterIsChecked()
                        val baggageJSON = fd.toJson(ticketModel.pricedItineraryItemList[0].freeBaggagesOneWay)
                        myPreferences.putString("oneWayBaggage",baggageJSON)
                        pricedItinerary = ticketModel.pricedItineraryItemList as ArrayList<PricedItineraryItemViewModel>
                        filterButton.isEnabled = true
                        filterSpinner.isEnabled = true
                        recyclerView.adapter = afch
                    }
                }
                //   bundle.putString("jsonTicket", objectDest)

            }}, object: RetrofitManager.Companion.OneWayApiCallbackFailure{
            override fun onFailure(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, t: Throwable?) {
                mShimmerViewContainer.visibility = View.GONE
                RetrofitManager.toast(this@FlightOneWayActivity, "Can't find available tickets")
                recyclerView.visibility = View.GONE
                filterLayout.visibility = View.GONE
                mainLinearLayout.addView(searchErrorLinearLayout)
               // pricedItinerary = afch.getTicketViewModel().pricedItineraryItemList as ArrayList<PricedItineraryItemViewModel>
            }
        })
        filterSpinner = findViewById(R.id.spinner)
        filterButton = findViewById(R.id.filterButton)
        filterSpinner.isEnabled = false
        filterButton.isEnabled = false
        filterButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(baseContext,FlightFilterActivity::class.java)
            intent.putExtra("key","one")
            startActivity(intent)
        })

        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                val intent = Intent(baseContext,FlightBookTicketActivity::class.java)

                val refNumber = afch.getDepartTicketsList()[position].refNumber
                val currentSegment = afch.getDepartTicketsList()[position].sequenceNumber.toString()
                for(i in 0 until pricedItinerary.size){
                    if(pricedItinerary[i].sequenceNumber == currentSegment){
                        combs =   pricedItinerary[i].originOneWayCombinationOptionItemList
                        for (k in 0 until combs.size) {
                            var id = combs[k].combinationID
                            if(combs[k].indexList==refNumber) {
                                combId = combs[k].combinationID
                                Log.e("sd",combId.toString())

                            }
                        }
                    }
                }
                bundle.putStringArrayList("airlineList",afch.getAirlineList())
                bundle.putString("oneWayRecId",currentSegment)
                bundle.putString("oneWayCombId",combId)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        })
    }
    fun filterIsChecked() {
        filterSpinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(filterSpinner.selectedItem.toString().equals("Price(Lowest)")){
                    afch.getDepartTicketsList().sortBy { it.airItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    afch.notifyDataSetChanged()
                }else if(filterSpinner.selectedItem.toString().equals("Price(Highest)")){
                    afch.getDepartTicketsList().sortByDescending { it.airItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    afch.notifyDataSetChanged()
                }
            }
        }
    }
    inner class VerticalSpaceItemDecoration(private val verticalSpaceHeight: Int) : RecyclerView.ItemDecoration() {
        override
        fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                           state: RecyclerView.State) {
            outRect.bottom = verticalSpaceHeight
        }
    }
    fun RecyclerView.affectOnItemClick(listener: RecyclerItemClickListener.OnClickListener) {
        this.addOnChildAttachStateChangeListener(RecyclerItemClickListener(this, listener, null))
    }

    fun RecyclerView.affectOnLongItemClick(listener: RecyclerItemClickListener.OnLongClickListener) {
        this.addOnChildAttachStateChangeListener(RecyclerItemClickListener(this, null, listener))
    }

    fun RecyclerView.affectOnItemClicks(onClick: RecyclerItemClickListener.OnClickListener, onLongClick: RecyclerItemClickListener.OnLongClickListener) {
        this.addOnChildAttachStateChangeListener(RecyclerItemClickListener(this, onClick, onLongClick))
    }

    private fun oneWayFlightSearch(service: RetrofitService, apiCallback: RetrofitManager.Companion.OneWayApiCallback, apiOneWayCallbackFailure: RetrofitManager.Companion.OneWayApiCallbackFailure){
        val myPreferences = AppSharedPreferences(this)
        val originLocation = oneWayOriginLocation
        val destinationLocation = oneWayDestination
        val originLocationInformation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginDestinationInformation(originLocation,
                departTime+"T12:00:00", destinationLocation)
        val passengerTypeQuantity = crocusoft.com.gez.pojo.request.searchOnewayFlight.PassengerTypeQuantity("ADT")
        val airTravelerAvail = crocusoft.com.gez.pojo.request.searchOnewayFlight.AirTravelerAvail(passengerTypeQuantity)
        val travelerInfoSummary = crocusoft.com.gez.pojo.request.searchOnewayFlight.TravelerInfoSummary(airTravelerAvail)
        val otaAirLowFareSearchRQ = crocusoft.com.gez.pojo.request.searchOnewayFlight.OTAAirLowFareSearchRQ(originLocationInformation, travelerInfoSummary)
        val searchFlight = crocusoft.com.gez.pojo.request.searchOnewayFlight.SearchFlight(otaAirLowFareSearchRQ)
        val soapBody = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapBody(searchFlight)
        val authenticationSoapHeader = crocusoft.com.gez.pojo.request.searchOnewayFlight.AuthenticationSoapHeader()
        val soapHeader = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapHeader(authenticationSoapHeader)
        val soapEnvelope = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapEnvelope(soapHeader,soapBody)
        val searchOneWay = crocusoft.com.gez.pojo.request.searchOnewayFlight.Request(soapEnvelope)

        val call : Call<Response> =
                service.oneWayFlightSearch(searchOneWay, RetrofitManager.getHeader(myPreferences))

        call.enqueue(object : Callback<Response> {
            override fun onFailure(call: Call<Response>?, t: Throwable?) {
                apiOneWayCallbackFailure.onFailure(call,t)
            }
            override fun onResponse(call: Call<Response>?, response: retrofit2.Response<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?) {
                apiCallback.onSuccess(call,response)
            }
        })
    }
}


