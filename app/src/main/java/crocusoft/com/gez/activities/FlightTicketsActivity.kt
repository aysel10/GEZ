package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Spinner
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightRoundtripTicketsAdapter
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem
import crocusoft.com.gez.util.Utility
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.view_model.TicketDataViewModel
import kotlinx.android.synthetic.main.activity_flight_one_way.*
import java.util.*

class FlightTicketsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var filterSpinner: Spinner
    private lateinit var filterButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_tickets)



        recyclerView = findViewById(R.id.recyclerView)
     //   val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val bundle = intent.extras

        //val viewModel =  bundle.getParcelable<TicketDataViewModel>("tickets")
        val viewModelJSON = bundle.getString("flightTickets")
        val fd: Gson = Gson()
        val ticketsJSON = fd.fromJson(viewModelJSON.toString(), TicketDataViewModel::class.java)
        val viewModel = ticketsJSON
        filterSpinner = findViewById(R.id.spinner)
        filterButton = findViewById(R.id.filterButton)

      //  val response = bundle.getParcelable<RoundtripResponse>("res")
//        val t = Gson()
        val afch = FlightRoundtripTicketsAdapter()
       // var y = Utility.getTicketList(response)
        afch.addViewModel(viewModel)
        recyclerView.adapter = afch
        filterButton.setOnClickListener(View.OnClickListener {
            if(spinner.selectedItem.toString().equals("Price(Lowest)")){
                if(afch.getDepartTicketsList()[0].roundtripAirItineraryPricingInfo.itinTotalFare.baseFare.amount.toFloat()>
                        afch.getDepartTicketsList()[afch.getDepartTicketsList().size-1].roundtripAirItineraryPricingInfo.itinTotalFare.baseFare.amount.toFloat()) {
                    Collections.reverse(afch.getDepartTicketsList())
                    afch.notifyDataSetChanged()
                }
            }else if(spinner.selectedItem.toString().equals("Price(Highest)")){
                if(afch.getDepartTicketsList()[0].roundtripAirItineraryPricingInfo.itinTotalFare.baseFare.amount.toFloat()<
                        afch.getDepartTicketsList()[afch.getDepartTicketsList().size-1].roundtripAirItineraryPricingInfo.itinTotalFare.baseFare.amount.toFloat()) {
                    Collections.reverse(afch.getDepartTicketsList())
                    afch.notifyDataSetChanged()
                }
            }
        })
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                val intent = Intent(baseContext,FlightReturnTicketsActivity::class.java)
                val departIndexList: ArrayList<String> = ArrayList()
                val arriveIndexList: ArrayList<String> = ArrayList()
                val arriveTickets: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
                var combs: List<OriginDestinationCombinationItem> = ArrayList()
                val refNumber = afch.getDepartTicketsList()[position].refNumber
                val currentSegment = afch.getDepartTicketsList()[position].sequenceNumber.toString()
                val firstTicketDataViewModel = afch.getDepartTicketsList()[position]
                val pricedItinerary = afch.getTicketViewModel().pricedItineraryItemList
                for(i in 0 until pricedItinerary.size){
                    if(pricedItinerary[i].sequenceNumber == currentSegment){
                        combs =   pricedItinerary[i].customOriginCombinationOptionItemList
                        for (k in 0 until combs.size) {
                            var id = combs[k].combinationID
                            if(combs[k].indexList.split(";")[0]==refNumber) {
                                departIndexList.add(combs[k].indexList)
                                arriveIndexList.add(combs[k].indexList.split(";")[1])
                            }
                        }
                    }
                }

                for(i in 0 until afch.getArriveTicketsList().size) {
                    if(afch.getArriveTicketsList()[i].sequenceNumber==currentSegment) {
                        for (k in 0 until arriveIndexList.size) {
                            if (afch.getArriveTicketsList()[i].refNumber.equals(arriveIndexList.get(k))) {
                                arriveTickets.add(afch.getArriveTicketsList()[i])
                            }
                        }
                    }
                }
              //  bundle.putParcelable("firstTicket",firstTicketDataViewModel)
                bundle.putString("segment",currentSegment)
                bundle.putString("ref1",refNumber)
                bundle.putParcelableArrayList("combs",combs as ArrayList)
              //  bundle.putParcelableArrayList("as",arriveTickets)
                val gs: Gson = Gson()
                val combsJSON = gs.toJson(combs)
                bundle.putString("firstTicket",gs.toJson(firstTicketDataViewModel))
                val arriveTicketsJSON = gs.toJson(arriveTickets)
                bundle.putString("combsJSON", combsJSON)
                bundle.putString("arriveTicketsJSON", arriveTicketsJSON)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        })

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
}

class RecyclerItemClickListener(private val mRecycler: RecyclerView, private val clickListener: OnClickListener? = null, private val longClickListener: OnLongClickListener? = null) : RecyclerView.OnChildAttachStateChangeListener {

    override fun onChildViewDetachedFromWindow(view: View?) {
        view?.setOnClickListener(null)
        view?.setOnLongClickListener(null)
    }

    override fun onChildViewAttachedToWindow(view: View?) {
        view?.setOnClickListener { v -> setOnChildAttachedToWindow(v) }
    }

    private fun setOnChildAttachedToWindow(v: View?) {
        if (v != null) {
            val position = mRecycler.getChildLayoutPosition(v)
            if (position >= 0) {
                clickListener?.onItemClick(position, v)
                longClickListener?.onLongItemClick(position, v)
            }
        }
    }

    interface OnClickListener {
        fun onItemClick(position: Int, view: View)

    }

    interface OnLongClickListener {
        fun onLongItemClick(position: Int, view: View)
    }
}
