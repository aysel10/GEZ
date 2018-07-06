package crocusoft.com.gez.activities

import android.content.Intent
import android.graphics.Rect
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.adapters.ReturnTicketsAdapter
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel

class FlightContinueBooking : AppCompatActivity() {
    var tickets: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private lateinit var recyclerView: RecyclerView
    private lateinit var continueBookingButton: Button
    val adapter = ReturnTicketsAdapter()

    private var mLayoutManager: LinearLayoutManager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_continue_booking)
        recyclerView = findViewById(R.id.recyclerView)
        continueBookingButton = findViewById(R.id.continueBookingButton)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val bundle = intent.extras
//        recyclerView.addItemDecoration(GridSpacingItemDecoration(1, dpToPx(10), true))
//        recyclerView.itemAnimator = DefaultItemAnimator()
//        mLayoutManager = GridLayoutManager(this, 1)
//        recyclerView.layoutManager = mLayoutManager

        val combId = bundle.getString("combId")
        val recId = bundle.getString("recId")
//        val firstTicket = bundle.getParcelable<OriginDestinationOptionItemViewModel>("firstTicket")
//        val secondTicket = bundle.getParcelable<OriginDestinationOptionItemViewModel>("secondTicket")
        val firstTicket = bundle.getString("firstTicket")
        val secondTicket = bundle.getString("secondTicket")
        val gs = Gson()
        tickets.add(gs.fromJson(firstTicket.toString(),OriginDestinationOptionItemViewModel::class.java))
        tickets.add(gs.fromJson(secondTicket.toString(),OriginDestinationOptionItemViewModel::class.java))
        adapter.addList(tickets)

        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(VerticalSpaceItemDecoration(25))
        val bundleSend = Bundle()

        continueBookingButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(baseContext,FlightBookTicketOneWay::class.java)
            bundleSend.putString("firstTicket",firstTicket)
            bundleSend.putString("secondTicket",secondTicket)
            bundleSend.putString("combId",combId)
            bundleSend.putString("recId",recId)
            intent.putExtras(bundleSend)
            startActivity(intent)
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
