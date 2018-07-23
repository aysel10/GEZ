package crocusoft.com.gez.activities

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.View
import android.widget.AdapterView
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Spinner
import com.google.gson.Gson
import com.google.gson.JsonArray
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightOneWaySortAdapter
import crocusoft.com.gez.adapters.FlightRoundTripInfoAdapter
import crocusoft.com.gez.adapters.ReturnTicketsAdapter
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.flight_view_model.PricedItineraryItemViewModel
import crocusoft.com.gez.flight_view_model.TicketDataViewModel
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages
import crocusoft.com.gez.util.AppSharedPreferences
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class FlightRoundTripSorted : AppCompatActivity() {
    private val tickets = ArrayList<OriginDestinationOptionItemViewModel>()
    private lateinit var recyclerView : RecyclerView
    private lateinit var filterSpinner: Spinner
    private lateinit var pricedItinerary:ArrayList<PricedItineraryItemViewModel>
    private lateinit var filterButton: ImageButton
    var combs: List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> = ArrayList()
    var combId = ""
    val adapter = ReturnTicketsAdapter()
    private lateinit var ticketModel: TicketDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_round_trip_sorted)
        val bundle = intent.extras
        val gson = Gson()

        val myPreferences = AppSharedPreferences(this)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        val dialog: AlertDialog = initBuilder().create()
        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
        dialog.setCancelable(false)
        doAsync {
            val ticketJSON = myPreferences.getString("roundSort")
            val baggageJSONString = myPreferences.getString("roundBaggage")
            val baggageModel: FreeBaggages = gson.fromJson(baggageJSONString.toString(),
                    FreeBaggages::class.java)
            val ticketsList : JsonArray = gson.fromJson(ticketJSON.toString(), JsonArray::class.java)

            for(j in 0 until ticketsList.size()) {
                val jsonObject = ticketsList.get(j)
                tickets.add(Gson().fromJson(jsonObject.toString(), OriginDestinationOptionItemViewModel::class.java))
            }
            adapter.addList(tickets)
            adapter.addBaggage(baggageModel)
            uiThread {
                adapter.notifyDataSetChanged()
                recyclerView.adapter = adapter
                filterIsChecked()
                dialog.dismiss()
            }

        }



        filterSpinner = findViewById(R.id.spinner)
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
                    adapter.getTickets().sortBy { it.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
                    adapter.notifyDataSetChanged()
                }else if(filterSpinner.selectedItem.toString().equals("Price(Highest)")){
                    adapter.getTickets().sortByDescending { it.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat() }
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

    inner class GridSpacingItemDecoration(private val spanCount: Int, private val spacing: Int, private val includeEdge: Boolean) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State?) {
            val position = parent.getChildAdapterPosition(view) // item position
            val column = position % spanCount // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing
                }
                outRect.bottom = spacing // item bottom
            } else {
                outRect.left = column * spacing / spanCount
                outRect.right = spacing - (column + 1) * spacing / spanCount // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private fun dpToPx(dp: Int): Int {
        val r = resources
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics))
    }
}
