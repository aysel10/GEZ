package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightMultiCityAdapter
import crocusoft.com.gez.adapters.FlightRoundtripTicketsAdapter
import crocusoft.com.gez.view_model.TicketDataViewModel

class FlightMultiCityActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    var combs: List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> = ArrayList()
    var combId = ""
    val afch = FlightMultiCityAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_multi_city)

        recyclerView = findViewById(R.id.recyclerView)
        //   val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val bundle = intent.extras

        val viewModel =  bundle.getParcelable<TicketDataViewModel>("tickets")

        afch.addViewModel(viewModel)
        recyclerView.adapter = afch

        val pricedItinerary = afch.getTicketViewModel().pricedItineraryItemList

        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                val intent = Intent(baseContext,FlightTicketsInfo::class.java)

                val combId = afch.getTickets()[position].combId
                val segment = afch.getTickets()[position].segment


                val tickets = afch.getTickets()[position].originDestinations
                bundle.putParcelableArrayList("tickets",tickets)
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
