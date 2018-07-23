package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import crocusoft.com.gez.R
import crocusoft.com.gez.database.AppDatabase
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.flight_view_model.TicketDataViewModel
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class FlightOneWaySortAdapter(): RecyclerView.Adapter<FlightOneWaySortAdapter.ViewHolder>()  {
    private var ticketModel:TicketDataViewModel = TicketDataViewModel()
    private lateinit var db:AppDatabase
    private var ticketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var ticketListArrive: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var combinationsList: ArrayList<OriginDestinationCombinationItem> = ArrayList()
    private var airlineSortedList:ArrayList<String> = ArrayList()
    var ticketsIndexList : List<String> = ArrayList()
    private var airlineNames:ArrayList<String> = ArrayList()
    private var freeBaggages = FreeBaggages()
//    fun addViewModel(ticketDataViewModel: TicketDataViewModel){
//        ticketModel = ticketDataViewModel
//        notifyDataSetChanged()
//        departTicketsListFill()
//        combinationListFill()
//    }
//    fun addSortedAirlineList(list:ArrayList<String>){
//        this.airlineSortedList = list
//    }

    fun addBaggage(baggages: FreeBaggages) {
        this.freeBaggages = baggages
    }
    fun addList(ticketList: java.util.ArrayList<OriginDestinationOptionItemViewModel>){
        ticketsListDepart = ticketList
        notifyDataSetChanged()
    }
    private fun departTicketsListFill() {
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginDestinationOptionItemListSize) {
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
        val t = freeBaggages.baggage

        holder.departAirport.text = flightSegmentItem.flighTSegmentList[0].departureAirport.locationCode
        holder.price.text = holder.view.context.resources.getString(R.string.pricePlaceHolder, flightSegmentItem.airItineraryPricingInfo.itinTotalFare.totalFare.amount)
        //  holder.baggageIndex.text= flightSegmentItem.flighTSegmentList[0].baggages.baggage.index[1].toString()
     //   for(i in 0 until flightSegmentListSize) {
            val currentTicket = flightSegmentItem.flighTSegmentList[0]
        val lastSegment = flightSegmentItem.flighTSegmentList.size

             val r = formatDate(currentTicket.flightDuration)
            val index = currentTicket.baggages.baggage.index
            for(j in 0..t.size-1){
                if(index.equals(t[j].index)){
                    holder.baggageIndex.text = holder.view.context.resources.getString(R.string.firstBag, t[j].quantity+(t[j].unit))
                }
            }

            holder.flightNumber.text = holder.view.context.resources.getString(R.string.flightNumber, currentTicket.flightNumber)
            holder.marketingAirline.text = holder.view.context.resources.getString(R.string.marketingAirline, currentTicket.marketingAirline.code)
            val operatingAirLineCode = flightSegmentItem.flighTSegmentList[0].operatingAirline.code.toString() // 0---------
            val codeLine = "%$operatingAirLineCode%"
            doAsync {
                //val image: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
                val image: AirportImageResponse? = db!!.imagesDataDAO().getImage(codeLine)
                val airName = image!!.airlineName.substring(image!!.airlineName.lastIndexOf("_")+1).substringBefore(".")
                airlineNames.add(airName)
                uiThread {
                    holder.airportName.text = airName
                    Picasso.get().load("http://88.99.186.108:8888/Content/images/airline_logo/${image!!.airlineName}").into(holder.airportImage)
                }
           }

            holder.arrivalAirport.text = flightSegmentItem.flighTSegmentList[lastSegment-1].arrivalAirport.locationCode
            holder.arrivalTime.text= currentTicket.arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T")+1).substring(0,5)
            //holder.departAirport.text = currentTicket.departureAirport.locationCode
            holder.departTime.text = currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T")+1).subSequence(0,5)
       // }
    }
    fun getTicketViewModel():TicketDataViewModel{
        return ticketModel
    }
    fun getAirlineList():ArrayList<String>{
        return airlineNames
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
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightOneWaySortAdapter.ViewHolder{
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        db = AppDatabase.getInstance(parent.context)!!

        val view : View = layoutInflater.inflate(R.layout.item_flight_ticket,parent,false) as View

        return ViewHolder(view)
    }


    override fun getItemCount(): Int {

        return ticketsListDepart.size
    }



    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //find views
        var airportName : TextView = view.findViewById(R.id.airportName)
        var airportImage : ImageView = view.findViewById(R.id.airportImage)
        var flightTime : TextView = view. findViewById(R.id.flightTime)
        var departTime : TextView = view.findViewById(R.id.departTime)
        var arrivalTime : TextView = view.findViewById(R.id.arrivalTime)
        var arrivalAirport : TextView = view.findViewById(R.id.arrivalAirport)
        var departAirport : TextView = view.findViewById(R.id.departAirport)
        var price : TextView = view.findViewById(R.id.priceTextView)
        var baggageIndex: TextView = view.findViewById(R.id.firstBag)
        var flightNumber : TextView = view.findViewById(R.id.flightNumber)
        var marketingAirline : TextView = view.findViewById(R.id.marketingAirline)
    }



}