package crocusoft.com.gez.activities

import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import crocusoft.com.gez.R
import crocusoft.com.gez.util.Utils
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService

class FlightTicketsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_tickets)

        recyclerView = findViewById(R.id.recyclerView)
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        Log.e("Adapter counter", Integer.toString(Utils.roundTripFlightSearch(service).itemCount))
        recyclerView.adapter = Utils.roundTripFlightSearch(service)
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))

    }

    inner class VerticalSpaceItemDecoration(private val verticalSpaceHeight: Int) : RecyclerView.ItemDecoration() {
        override
        fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView,
                           state: RecyclerView.State) {
            outRect.bottom = verticalSpaceHeight
        }
    }
}
