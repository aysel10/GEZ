package crocusoft.com.gez.activities

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ColorDrawable
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
import com.google.gson.Gson
import com.google.gson.JsonArray
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightOneWaySortAdapter
import crocusoft.com.gez.adapters.ReturnTicketsAdapter
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.flight_view_model.PricedItineraryItemViewModel
import crocusoft.com.gez.flight_view_model.TicketDataViewModel
import crocusoft.com.gez.flight_view_model.TicketModelManager
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages
import crocusoft.com.gez.util.AppSharedPreferences
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class FlightOneWaySorted : AppCompatActivity() {
    private val tickets = ArrayList<OriginDestinationOptionItemViewModel>()
    private lateinit var recyclerView :RecyclerView
    private lateinit var filterSpinner: Spinner
    private val adapter  = FlightOneWaySortAdapter()
    private lateinit var pricedItinerary:ArrayList<PricedItineraryItemViewModel>
    var combs: List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> = ArrayList()
    var combId = ""
  //  private lateinit var ticketModel:TicketDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_one_way_sorted)
        Log.e("start","new")
        val gson = Gson()
        val bundle = intent.extras
        val myPreferences = AppSharedPreferences(this)
        val dialog: AlertDialog = initBuilder().create()
        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
        dialog.setCancelable(false)
        doAsync {
            val ticketJSON = myPreferences.getString("sortedTickets")
            val baggageJson = myPreferences.getString("oneWayBaggage")
            val ticketsList : JsonArray = gson.fromJson(ticketJSON.toString(), JsonArray::class.java)
            val baggage = gson.fromJson(baggageJson.toString(), FreeBaggages::class.java)
            for(j in 0 until ticketsList.size()) {
                val jsonObject = ticketsList.get(j)
                tickets.add(Gson().fromJson(jsonObject.toString(), OriginDestinationOptionItemViewModel::class.java))
            }
            adapter.addList(tickets)
            adapter.addBaggage(baggage)
            uiThread {
                adapter.notifyDataSetChanged()
                recyclerView.adapter = adapter
                filterIsChecked()
                dialog.dismiss()
            }

        }


        filterSpinner = findViewById(R.id.spinner)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))

      //  val ticketJSON = bundle.getString("onewaySorted")


        val viewModelJSON = myPreferences.getString("oneWayTicketModel")
        val ticketModel = gson.fromJson(viewModelJSON.toString(), TicketDataViewModel::class.java)



        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                val intent = Intent(baseContext,FlightBookTicketActivity::class.java)
                val bundleSend = Bundle()
                val refNumber = adapter.getDepartTicketsList()[position].refNumber
                val currentSegment = adapter.getDepartTicketsList()[position].sequenceNumber.toString()

                pricedItinerary = ticketModel.pricedItineraryItemList as ArrayList<PricedItineraryItemViewModel>
                for(i in 0 until pricedItinerary.size){
                    if(pricedItinerary[i].sequenceNumber == currentSegment){
                        combs =   pricedItinerary[i].originOneWayCombinationOptionItemList
                        for (k in 0 until combs.size) {
                            var id = combs[k].combinationID
                            if(combs[k].indexList==refNumber) {
                                combId = combs[k].combinationID
                            }
                        }
                    }
                }
               // Log.e(currentSegment,combId)
              //  bundle.putStringArrayList("airlineList",afch.getAirlineList())
                bundleSend.putString("recId",currentSegment)
                bundleSend.putString("combId",combId)
                intent.putExtras(bundleSend)
                startActivity(intent)
            }
        })
    }
    private fun initBuilder():AlertDialog.Builder {
        val builder = AlertDialog.Builder(this)
        val view:View = getLayoutInflater().inflate(R.layout.progress,null);
        builder.setView(view)
        //val dialog = builder.create()
        return builder
    }
    fun filterIsChecked() {
        filterSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(filterSpinner.selectedItem.toString().equals("Price(Lowest)")){
                    adapter.getDepartTicketsList().sortBy { it.airItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    adapter.notifyDataSetChanged()
                }else if(filterSpinner.selectedItem.toString().equals("Price(Highest)")){
                    adapter.getDepartTicketsList().sortByDescending { it.airItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    adapter.notifyDataSetChanged()
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
}
