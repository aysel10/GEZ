package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Spinner
import com.google.gson.Gson
import com.google.gson.JsonArray
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.ReturnTicketsAdapter
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import java.util.*

class FlightRDReturnActivity : AppCompatActivity() {
    var returnTicketsList: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private lateinit var recyclerView: RecyclerView
    private lateinit var filterSpinner: Spinner
    private lateinit var filterButton: ImageButton
    val returnTicketsAdapter: ReturnTicketsAdapter = ReturnTicketsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_return_tickets)
        val bundle = intent.extras
        val combs = bundle.getParcelableArrayList<OriginDestinationCombinationItem>("combs")
        val firstTicket = bundle.getString("firstTicket")
        val ref1 = bundle.getString("ref1")
        val segment = bundle.getString("segment")
        var ref2 = ""
        var combId = ""
        val bundleSend = Bundle()
        val gs = Gson()

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        filterSpinner = findViewById(R.id.spinner)
       // filterButton = findViewById(R.id.filterButton)
        val baggageJSONString = bundle.getString("baggageJSON")
        val baggageModel: FreeBaggages = gs.fromJson(baggageJSONString.toString(),
                FreeBaggages::class.java)

       // returnTicketsList = bundle.getParcelableArrayList<OriginDestinationOptionItemViewModel>("as")
        val returnTicketsListJSON: JsonArray =
                gs.fromJson(bundle.getString("arriveTicketsJSON"), JsonArray::class.java)
        for(j in 0 until returnTicketsListJSON.size()) {
            val jsonObject = returnTicketsListJSON.get(j)
            returnTicketsList.add(Gson().fromJson(jsonObject.toString(), OriginDestinationOptionItemViewModel::class.java))
        }
        returnTicketsAdapter.addList(returnTicketsList)
        returnTicketsAdapter.addBaggage(baggageModel)
        returnTicketsAdapter.getTickets().sortBy { it.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
        returnTicketsAdapter.notifyDataSetChanged()

       filterIsChecked()
        recyclerView.adapter = returnTicketsAdapter

        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                ref2 = returnTicketsAdapter.ticketsList[position].refNumber
                for(i in 0 until combs.size){
                    if(combs[i].indexList.split(";")[0]==ref1 &&
                           combs[i].indexList.split(";")[1] == ref2){
                        combId = combs[i].combinationID
                   }
                }
                val intent = Intent(baseContext,FlightRoundTripInfo::class.java)
              //  bundleSend.putParcelable("secondTicket",returnTicketsAdapter.ticketsList[position])
                bundleSend.putString("secondTicket",gs.toJson(returnTicketsAdapter.ticketsList[position]))
                bundleSend.putString("combId", combId)
                bundleSend.putString("firstTicket",firstTicket)
                bundleSend.putString("recId",segment)
                bundleSend.putString("baggageJSON", baggageJSONString)

                intent.putExtras(bundleSend)
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

    fun filterIsChecked() {
        filterSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(filterSpinner.selectedItem.toString().equals("Price(Lowest)")){
                    returnTicketsAdapter.getTickets().sortBy { it.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    returnTicketsAdapter.notifyDataSetChanged()
                }else if(filterSpinner.selectedItem.toString().equals("Price(Highest)")){
                    returnTicketsAdapter.getTickets().sortByDescending { it.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    returnTicketsAdapter.notifyDataSetChanged()
                }
            }
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
