package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.FlightOneWayAdapter
import crocusoft.com.gez.view_model.TicketDataViewModel

class FlightOneWayActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    var combs: List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> = ArrayList()
    var combId = ""
    val afch = FlightOneWayAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_one_way)

        recyclerView = findViewById(R.id.recyclerView2)
        //   val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val bundle = intent.extras

        val viewModelJson = bundle.getString("jsonTicket")
      //  Log.e("JSON VIEW MODEL:", viewModelJson)
        val fd = Gson()
        val viewModel = fd.fromJson(viewModelJson.toString(), TicketDataViewModel::class.java)
        //val viewModel =  bundle.getParcelable<TicketDataViewModel>("tick")
        afch.addViewModel(viewModel)
        recyclerView.adapter = afch
        val pricedItinerary = afch.getTicketViewModel().pricedItineraryItemList

        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        recyclerView.affectOnItemClick(object : RecyclerItemClickListener.OnClickListener {
            override fun onItemClick(position: Int, view: View) {
                val intent = Intent(baseContext,FlightBookTicket::class.java)
                val refNumber = afch.getDepartTicketsList()[position].refNumber
                val currentSegment = afch.getDepartTicketsList()[position].sequenceNumber.toString()
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
                bundle.putString("recId",currentSegment)
                bundle.putString("combId",combId)
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


