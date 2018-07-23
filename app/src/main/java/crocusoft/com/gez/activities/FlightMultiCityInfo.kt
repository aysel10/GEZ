package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.google.gson.Gson
import com.google.gson.JsonArray
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightMultiTicketsInfoAdapter
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel

class FlightMultiCityInfo : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bookButton: Button
    var combId = ""
    var recId = ""
    val afch = FlightMultiTicketsInfoAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_tickets_info)
        recyclerView = findViewById(R.id.recyclerView)
        val list = ArrayList<OriginDestinationOptionItemViewModel>()
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val bundle = intent.extras
        val gs = Gson()

        combId = bundle.getString("combId")
        recId = bundle.getString("recId")
        val baggageJSONString = bundle.getString("baggageJSON")
        val baggageModel: FreeBaggages = gs.fromJson(baggageJSONString.toString(),
                FreeBaggages::class.java)
        val ticketsList: JsonArray =
                gs.fromJson(bundle.getString("ticket"), JsonArray::class.java)
        for(j in 0 until ticketsList.size()) {
            val jsonObject = ticketsList.get(j)
            list.add(Gson().fromJson(jsonObject.toString(), OriginDestinationOptionItemViewModel::class.java))
        }
       // val model = gs.fromJson(ticket.toString(), OriginDestinationOptionItemViewModel::class.java)

        afch.addList(list)
        afch.addBaggage(baggageModel)
        recyclerView.adapter = afch

        bookButton = findViewById(R.id.continueBooking)
        bookButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(baseContext,FlightBookTicketActivity::class.java)
            val bundlee = Bundle()
            bundlee.putString("combId",combId)
            bundlee.putString("recId",recId)
            intent.putExtras(bundlee)
            startActivity(intent)
        })

        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {

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
