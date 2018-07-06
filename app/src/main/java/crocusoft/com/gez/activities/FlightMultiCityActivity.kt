package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Spinner
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightMultiCityAdapter
import crocusoft.com.gez.view_model.TicketDataViewModel

class FlightMultiCityActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var filterSpinner: Spinner
    private lateinit var firstLinear:LinearLayout
    private lateinit var filterButton: ImageButton
    val afch = FlightMultiCityAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_multi_city)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val bundle = intent.extras
        val gs = Gson()

        val viewModelJson = bundle.getString("tickets")
        filterSpinner = findViewById(R.id.spinner)
        filterButton = findViewById(R.id.filterButton)
        //  Log.e("JSON VIEW MODEL:", viewModelJson)
        val fd = Gson()
        val viewModel = fd.fromJson(viewModelJson.toString(), TicketDataViewModel::class.java)
        //val viewModel =  bundle.getParcelable<TicketDataViewModel>("tickets")
        afch.addViewModel(viewModel)
        filterButton.setOnClickListener(View.OnClickListener {
            if(filterSpinner.selectedItem.toString().equals("Price(Lowest)")){
                if(afch.getTickets()[0].originDestinations[0].multiAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat()>
                        afch.getTickets()[afch.getTickets().size-1].originDestinations[0].multiAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat()) {
                    afch.getTickets().reverse()
                    afch.notifyDataSetChanged()
                }
            }else if(filterSpinner.selectedItem.toString().equals("Price(Highest)")){
                if(afch.getTickets()[0].originDestinations[0].multiAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat()<
                        afch.getTickets()[afch.getTickets().size-1].originDestinations[0].multiAirItineraryPricingInfo.itinTotalFare.totalFare.amount.toFloat()) {
                    afch.getTickets().reverse()
                    afch.notifyDataSetChanged()
                }
            }
        })
        recyclerView.adapter = afch
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                val intent = Intent(baseContext,FlightMultiCityInfo::class.java)
                val combId = afch.getTickets()[position].combId
                val segment = afch.getTickets()[position].segment
                val tickets = afch.getTickets()[position].originDestinations

                bundle.putParcelableArrayList("tickets",tickets)
                bundle.putString("ticket",gs.toJson(tickets))
                bundle.putString("combId",combId)
                bundle.putString("recId",segment)
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
