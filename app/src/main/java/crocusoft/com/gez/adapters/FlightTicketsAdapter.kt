package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.view_model.TicketDataViewModel

class FlightTicketsAdapter() : RecyclerView.Adapter<FlightTicketsAdapter.ViewHolder>() {

    private var ticketModel:TicketDataViewModel = TicketDataViewModel()

    public fun addViewModel(ticketDataViewModel: TicketDataViewModel){
        ticketModel =ticketDataViewModel
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var size = ticketModel.pricedItineraryItemList.size
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[position].customOriginDestinationOptionItemList.size
            for(j in 0..(customOriginDestinationOptionItemListSize-1)) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[position].customOriginDestinationOptionItemList[j]
                val flightSegmentListSize = originDestinationOptionItem.flightSegmentList.size

                if(originDestinationOptionItem.directionId=="0") {

                    for (z in 0..(flightSegmentListSize - 1)) {
                        var flightSegmentItem = originDestinationOptionItem.flightSegmentList[z]
                        holder.flightTime.text = flightSegmentItem.flightDuration
                        holder.flightDate.text = flightSegmentItem.departureDateTime
                        holder.arrivalAirport.text = flightSegmentItem.arrivalAirport.locationCode
                        holder.arrivalTime.text = flightSegmentItem.arrivalDateTime
                        holder.departAirport.text = flightSegmentItem.departureAirport.locationCode
                        holder.departTime.text = flightSegmentItem.departureDateTime
                    }
                }
            }







    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightTicketsAdapter.ViewHolder{
        val layoutInflater: LayoutInflater= LayoutInflater.from(parent.context)
        var view : View = layoutInflater.inflate(R.layout.item_flight_ticket,parent,false) as View

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        if(ticketModel.pricedItineraryItemList == null){
            return 0
        }
            return ticketModel.pricedItineraryItemList.size

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
    }
}