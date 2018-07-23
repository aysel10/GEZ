package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import crocusoft.com.gez.R
import crocusoft.com.gez.database.AppDatabase
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.text.SimpleDateFormat
import java.util.*

class ReturnTicketsAdapter(): RecyclerView.Adapter<ReturnTicketsAdapter.ViewHolder>() {

    var ticketsList: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private lateinit var db: AppDatabase
    private var freeBaggages: FreeBaggages = FreeBaggages()

    fun addBaggage(baggages: FreeBaggages) {
        this.freeBaggages = baggages
    }
    public fun addList(ticketList: ArrayList<OriginDestinationOptionItemViewModel>){
        ticketsList = ticketList
        notifyDataSetChanged()
    }
    fun getTickets(): ArrayList<OriginDestinationOptionItemViewModel> {
        return ticketsList;
    }
    public fun addBaggage(ticketList: ArrayList<OriginDestinationOptionItemViewModel>){
        ticketsList = ticketList
        notifyDataSetChanged()
    }
    private fun formatDate(dateString: String): String {
        val dateFromString = dateString.split("T")[0]
        val datePatternForParse = SimpleDateFormat("yyyy-MM-dd",Locale.US)
        val date: Date = datePatternForParse.parse(dateFromString)
        val datePatternForReturn = SimpleDateFormat("EEE, dd MMMM",Locale.US)
        return datePatternForReturn.format(date)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val flightSegmentItem = ticketsList[position]
        val flightSegmentListSize = flightSegmentItem.flightSegmentList.size
        val time = ticketsList[position].elapsedTime.substring(0,2)+":"+ticketsList[position].elapsedTime.substring(2,4)
      //  holder.flightTime.text = time
        if(flightSegmentListSize>1){
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize>2) {
            Log.e("more than two","/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode+ "/via " + flightSegmentItem.flightSegmentList[1].departureAirport.locationCode)
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode+ ", " + flightSegmentItem.flightSegmentList[1].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize==1){
            holder.flightTime.text = time
        }

        holder.price.text =  holder.view.context.resources.getString(R.string.pricePlaceHolder, flightSegmentItem.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount)
        holder.departAirport.text = flightSegmentItem.flightSegmentList[0].departureAirport.locationCode
        val t = freeBaggages.baggage

       // for(i in 0 until flightSegmentListSize) {
            val currentTicket = flightSegmentItem.flightSegmentList[0]
            val r = formatDate(currentTicket.flightDuration)
            val index = currentTicket.baggages.baggage.index
            for(j in 0..t.size-1){
                if(index.equals(t[j].index)){
                    holder.baggageIndex.text = holder.view.context.resources.getString(R.string.firstBag, t[j].quantity+(t[j].unit))
                }
            }
            holder.flightNumber.text = holder.view.context.resources.getString(R.string.flightNumber, currentTicket.flightNumber)
            holder.marketingAirline.text = holder.view.context.resources.getString(R.string.marketingAirline, currentTicket.marketingAirline.code)
            val operatingAirLineCode = flightSegmentItem.flightSegmentList[0].operatingAirline.code.toString() // 0---------
            val codeLine = "%$operatingAirLineCode%"
            doAsync {
                //val image: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
                val image: AirportImageResponse = db!!.imagesDataDAO().getImage(codeLine)
                val t = image.airlineName.substring(image.airlineName.lastIndexOf("_")+1).substringBefore(".")
                uiThread {
                    holder.airportName.text = t
                    Picasso.get().load("http://88.99.186.108:8888/Content/images/airline_logo/${image!!.airlineName}").into(holder.airportImage)
                }
            }
            holder.arrivalAirport.text = flightSegmentItem.flightSegmentList[flightSegmentListSize-1].arrivalAirport.locationCode
            holder.arrivalTime.text= currentTicket.arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T")+1).substring(0,5)
            holder.departAirport.text = currentTicket.departureAirport.locationCode
            holder.departTime.text = currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T")+1).subSequence(0,5)
       // }
    }


    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReturnTicketsAdapter.ViewHolder{
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = layoutInflater.inflate(R.layout.item_flight_ticket,parent,false) as View
        db = AppDatabase.getInstance(parent.context)!!

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return ticketsList.size

    }



    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //find views
        var airportName : TextView = view.findViewById(R.id.airportName)
        var flightTime : TextView = view. findViewById(R.id.flightTime)
        var departTime : TextView = view.findViewById(R.id.departTime)
        var arrivalTime : TextView = view.findViewById(R.id.arrivalTime)
        var arrivalAirport : TextView = view.findViewById(R.id.arrivalAirport)
        var departAirport : TextView = view.findViewById(R.id.departAirport)
        var price : TextView = view.findViewById(R.id.priceTextView)
        var selectButton : Button = view.findViewById(R.id.selectButton)
        var airportImage : ImageView = view.findViewById(R.id.airportImage)
        var baggageIndex: TextView = view.findViewById(R.id.firstBag)
        var flightNumber : TextView = view.findViewById(R.id.flightNumber)
        var marketingAirline : TextView = view.findViewById(R.id.marketingAirline)
    }
}