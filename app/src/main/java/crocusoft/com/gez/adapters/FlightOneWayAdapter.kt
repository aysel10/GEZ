package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.view_model.TicketDataViewModel
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class FlightOneWayAdapter(): RecyclerView.Adapter<FlightOneWayAdapter.ViewHolder>()  {

    private var ticketModel:TicketDataViewModel = TicketDataViewModel()

    private var ticketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var ticketListArrive: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var combinationsList: ArrayList<OriginDestinationCombinationItem> = ArrayList()
    var ticketsIndexList : List<String> = ArrayList()

    public fun addViewModel(ticketDataViewModel: TicketDataViewModel){
        ticketModel = ticketDataViewModel
        notifyDataSetChanged()
        departTicketsListFill()
        combinationListFill()
    }

    private fun departTicketsListFill() {
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginDestinationOptionItemListSize) {
                Log.e("sdf",ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[0].sequenceNumber)
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                    originDestinationOptionItem.sequenceNumber =  ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j].sequenceNumber
                    ticketsListDepart.add(originDestinationOptionItem)
              }

        }
    }


    private fun combinationListFill(){
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].originOneWayCombinationOptionItemList.size
                for (j in 0..(customOriginDestinationOptionItemListSize - 1)) {
                     val originCombinationOptionItem: OriginDestinationCombinationItem = ticketModel.pricedItineraryItemList[k].originOneWayCombinationOptionItemList[j]
                      combinationsList.add(originCombinationOptionItem)
              }
        }
    }


    fun getCombinationsList(): ArrayList<OriginDestinationCombinationItem> {
        return combinationsList
    }

    private fun formatDate(dateString: String): String {
        val dateFromString = dateString.split("T")[0]
        val datePatternForParse = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val date: Date = datePatternForParse.parse(dateFromString)
        val datePatternForReturn = SimpleDateFormat("EEE, dd MMMM", Locale.US)
        return datePatternForReturn.format(date)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val flightSegmentItem = ticketsListDepart[position]
        val flightSegmentListSize = flightSegmentItem.flighTSegmentList.size
        val time = ticketsListDepart[position].elapsedTime.substring(0,2)+":"+ticketsListDepart[position].elapsedTime.substring(2,4)
        if(flightSegmentListSize>1){
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flighTSegmentList[0].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize>2) {
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flighTSegmentList[0].arrivalAirport.locationCode+ ", " + flightSegmentItem.flighTSegmentList[1].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize==1){
            holder.flightTime.text = time
        }
        holder.departAirport.text = flightSegmentItem.flighTSegmentList[0].departureAirport.locationCode
        holder.price.text = holder.view.context.resources.getString(R.string.pricePlaceHolder, flightSegmentItem.airItineraryPricingInfo.itinTotalFare.baseFare.amount)

        for(i in 0 until flightSegmentListSize) {
            val currentTicket = flightSegmentItem.flighTSegmentList[i]
            val r = formatDate(currentTicket.flightDuration)
            holder.flightDate.text = r
            holder.arrivalAirport.text = currentTicket.arrivalAirport.locationCode
            holder.arrivalTime.text= currentTicket.arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T")+1).substring(0,5)
            //holder.departAirport.text = currentTicket.departureAirport.locationCode
            holder.departTime.text = currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T")+1).subSequence(0,5)
        }
    }
    fun getTicketViewModel():TicketDataViewModel{
        return ticketModel
    }
    fun getArriveTicketsList(): ArrayList<OriginDestinationOptionItemViewModel> {
        return ticketListArrive;
    }
    fun getDepartTicketsList(): ArrayList<OriginDestinationOptionItemViewModel> {
        return ticketsListDepart
    }

    fun getIndexList(): List<String>{
        return ticketsIndexList;
    }
    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightOneWayAdapter.ViewHolder{
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = layoutInflater.inflate(R.layout.item_flight_ticket,parent,false) as View

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        if(ticketModel.pricedItineraryItemList == null){
            return 0
        }
        var counter: Int = 0
        for(i in 0 until ticketModel.pricedItineraryItemList.size) {
            val tNumber = ticketModel.pricedItineraryItemList[i].customOriginDestinationOptionItemList.size
            for(j in 0 until tNumber) {
                counter++
            }
        }
        return counter
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