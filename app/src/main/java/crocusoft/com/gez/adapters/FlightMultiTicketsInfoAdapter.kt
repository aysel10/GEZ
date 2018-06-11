package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel
import java.text.SimpleDateFormat
import java.util.*


class FlightMultiTicketsInfoAdapter(): RecyclerView.Adapter<FlightMultiTicketsInfoAdapter.ViewHolder>() {

    var ticketsList: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()

    public fun addList(ticketList: ArrayList<OriginDestinationOptionItemViewModel>){
        ticketsList = ticketList
        notifyDataSetChanged()
    }
    private fun formatDate(dateString: String): String {
        val dateFromString = dateString.split("T")[0]
        val datePatternForParse = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val date: Date = datePatternForParse.parse(dateFromString)
        val datePatternForReturn = SimpleDateFormat("EEE, dd MMMM", Locale.US)
        return datePatternForReturn.format(date)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val flightSegmentItem = ticketsList[position]
        val flightSegmentListSize = flightSegmentItem.multiCityFlightSegment.size
        val time = ticketsList[position].elapsedTime.substring(0,2)+":"+ticketsList[position].elapsedTime.substring(2,4)
        if(flightSegmentListSize>1){
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize>2) {
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode+ ", " + flightSegmentItem.flightSegmentList[1].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize==1){
            holder.flightTime.text = time
        }
        holder.price.text =  holder.view.context.resources.getString(R.string.pricePlaceHolder, flightSegmentItem.roundtripAirItineraryPricingInfo.itinTotalFare.baseFare.amount)
        holder.departAirport.text = flightSegmentItem.flightSegmentList[0].departureAirport.locationCode

        for(i in 0 until flightSegmentListSize) {

            val currentTicket = flightSegmentItem.multiCityFlightSegment[i]
            var r = formatDate(currentTicket.flightDuration)
            holder.flightDate.text = r
            holder.arrivalAirport.text = currentTicket.arrivalAirport.locationCode
            holder.arrivalTime.text= currentTicket.arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T")+1).substring(0,5)
            holder.departAirport.text = currentTicket.departureAirport.locationCode
            holder.departTime.text = currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T")+1).subSequence(0,5)
        }
    }


    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightMultiTicketsInfoAdapter.ViewHolder{
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = layoutInflater.inflate(R.layout.item_flight_ticket,parent,false) as View

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return ticketsList.size

    }



    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //find views
        var airportName : TextView = view.findViewById(R.id.airportName)
        var flightTime : TextView = view. findViewById(R.id.flightTime)
        var flightDate : TextView = view.findViewById(R.id.flightDate)
        var departTime : TextView = view.findViewById(R.id.departTime)
        var arrivalTime : TextView = view.findViewById(R.id.arrivalTime)
        var arrivalAirport : TextView = view.findViewById(R.id.arrivalAirport)
        var departAirport : TextView = view.findViewById(R.id.departAirport)
        var price : TextView = view.findViewById(R.id.priceTextView)
    }
}