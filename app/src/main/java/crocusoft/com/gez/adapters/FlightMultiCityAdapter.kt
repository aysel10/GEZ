package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.models.TicketCombination
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.view_model.TicketDataViewModel
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class FlightMultiCityAdapter() : RecyclerView.Adapter<FlightMultiCityAdapter.ViewHolder>() {

    private var ticketModel: TicketDataViewModel = TicketDataViewModel()

    private var ticketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    val ticketComninationList: List<TicketCombination> = ArrayList()
    private var combinationsList: ArrayList<OriginDestinationCombinationItem> = ArrayList()
    var ticketsIndexList : List<String> = ArrayList()
    var t:OriginDestinationOptionItemViewModel = OriginDestinationOptionItemViewModel()



    public fun addViewModel(ticketDataViewModel: TicketDataViewModel){
        ticketModel = ticketDataViewModel
        notifyDataSetChanged()
        departTicketsListFill()
       // arriveTicketsListFill()
        combinationListFill()
        //  indexListFill()
        //getTickets()
    }

    private fun departTicketsListFill() {
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginDestinationOptionItemListSize) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                if (originDestinationOptionItem.directionId == "0") {
                    originDestinationOptionItem.sequenceNumber =  ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j].sequenceNumber
                    ticketsListDepart.add(originDestinationOptionItem)
                }
            }
        }
    }

    private fun combinationListFill(){
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {

            val customOriginCombinationOptionItem = ticketModel.pricedItineraryItemList[k].originMultiCityCombinationOptionList
            for (j in 0..(customOriginCombinationOptionItem.size - 1)) {
                val ticketCombination: TicketCombination = TicketCombination()
//                val originCombinationOptionItem: OriginDestinationCombinationItem = ticketModel.pricedItineraryItemList[k].originMultiCityCombinationOptionList[j]
//                combinationsList.add(originCombinationOptionItem)
                ticketsIndexList = ticketModel.pricedItineraryItemList[k].originMultiCityCombinationOptionList[j].indexList.split(";")
                ticketCombination.indexList =  ticketsIndexList as ArrayList
                val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
                val allTicketsList: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
                for(l in 0..ticketCombination.indexList.size-1) {
                    for (i in 0..customOriginDestinationOptionItemListSize - 1) {
                        val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[i]
                        ticketCombination.segment = originDestinationOptionItem.sequenceNumber
                        if(originDestinationOptionItem.refNumber==ticketsIndexList[l]&& originDestinationOptionItem.directionId.toInt() == l){
                            ticketCombination.originDestinations.add(originDestinationOptionItem)
                            ticketCombination.combId = customOriginCombinationOptionItem[j].combinationID
                        }
                    }
                }
                (ticketComninationList as ArrayList).add(ticketCombination)
            }
        }
    }

    fun getCombinationsList(): ArrayList<OriginDestinationCombinationItem> {
        return combinationsList
    }
    fun getTickets():ArrayList<TicketCombination>{
        return ticketComninationList as ArrayList<TicketCombination>
    }

//    fun getTickets():ArrayList<OriginDestinationOptionItemViewModel>{
//        val t:ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
//          for(i in 0..tickets.size-1) {
//              t.add(tickets.get(i).)
////              for(j in 0..tickets[i].size-1) {
////              }
//          }
//        return t
//    }

    private fun formatDate(dateString: String): String {
        val dateFromString = dateString.split("T")[0]
        val datePatternForParse = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val date: Date = datePatternForParse.parse(dateFromString)
        val datePatternForReturn = SimpleDateFormat("EEE, dd MMMM", Locale.US)
        return datePatternForReturn.format(date)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var arrivalAirport =""
        var departAirport =""
        var arrivalTime =""
        var departTime =""


        var flightDuration =""
        val flightSegmentItem = ticketComninationList[position]
        for(j in 0..flightSegmentItem.originDestinations.size-1) {
                val item = flightSegmentItem.originDestinations[j]
                val flightSegmentListSize = item.multiCityFlightSegment.size
                val time = item.elapsedTime.substring(0, 2) + ":" + item.elapsedTime.substring(2, 4)
                holder.flightTime.text = time
             //   holder.price.text =  holder.view.context.resources.getString(R.string.pricePlaceHolder, flightSegmentItem.airItineraryPricingInfo.itinTotalFare.baseFare.amount)
                for (i in 0 until flightSegmentListSize) {
                  val currentTicket = item.multiCityFlightSegment[i]
                  flightDuration += formatDate(currentTicket.flightDuration) + "\n"
                  departAirport += currentTicket.departureAirport.locationCode+ "\n" + currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T") + 1).substring(0, 5) + "\n"
                    arrivalAirport +=  currentTicket.arrivalAirport.locationCode + "\n" + currentTicket.arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T") + 1).substring(0, 5) + "\n"
                    // departTime += currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T") + 1).substring(0, 5) + "\n"
                //  arrivalTime += currentTicket.arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T") + 1).substring(0, 5) + "\n"
                  holder.arrivalAirport.text = arrivalAirport
                  holder.arrivalTime.text = arrivalTime
                  holder.departAirport.text = departAirport
                  holder.departTime.text = departTime
                  holder.flightDate.text = flightDuration

              }
        }

    }
    fun getTicketViewModel(): TicketDataViewModel {
        return ticketModel
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightMultiCityAdapter.ViewHolder{
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view : View = layoutInflater.inflate(R.layout.item_flight_ticket,parent,false) as View

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return ticketComninationList.size
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

