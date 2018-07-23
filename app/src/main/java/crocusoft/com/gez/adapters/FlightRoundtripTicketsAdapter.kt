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
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.flight_view_model.TicketDataViewModel
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.text.SimpleDateFormat
import java.util.*

class FlightRoundtripTicketsAdapter() : RecyclerView.Adapter<FlightRoundtripTicketsAdapter.ViewHolder>() {

    private var ticketModel:TicketDataViewModel = TicketDataViewModel()

    private var ticketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var ticketListArrive: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var combinationsList: ArrayList<OriginDestinationCombinationItem> = ArrayList()
    var ticketsIndexList : List<String> = ArrayList()
    private lateinit var db:AppDatabase

    private var allTicketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()


    public fun addViewModel(ticketDataViewModel: TicketDataViewModel){
        ticketModel = ticketDataViewModel
        notifyDataSetChanged()
        departTicketsListFill()
        arriveTicketsListFill()
        combinationListFill()
        indexListFill()
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
//    private fun allDepartTicketsListFill() {
//        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
//            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
//            for (j in 0 until customOriginDestinationOptionItemListSize) {
//                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
//
//                    ticketsListDepart.add(originDestinationOptionItem)
//
//            }
//        }
//    }

    private fun arriveTicketsListFill() {
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginCombinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginCombinationOptionItemListSize) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                if (originDestinationOptionItem.directionId == "1") {
                    ticketListArrive.add(originDestinationOptionItem)
                }
            }
        }
    }
   private fun combinationListFill(){
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginCombinationOptionItemList.size
            for (j in 0..(customOriginDestinationOptionItemListSize - 1)) {
                val originCombinationOptionItem: OriginDestinationCombinationItem = ticketModel.pricedItineraryItemList[k].customOriginCombinationOptionItemList[j]
                combinationsList.add(originCombinationOptionItem)
            }
        }
    }
    private  fun indexListFill(){
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginCombinationOptionItemList.size
            for (j in 0..(customOriginDestinationOptionItemListSize - 1)) {
                ticketsIndexList = ticketModel.pricedItineraryItemList[k].customOriginCombinationOptionItemList[j].indexList.split(";")
            }
        }
    }

    fun getCombinationsList():ArrayList<OriginDestinationCombinationItem>{
        return combinationsList
    }

    private fun formatDate(dateString: String): String {
        val dateFromString = dateString.split("T")[0]
        val datePatternForParse = SimpleDateFormat("yyyy-MM-dd",Locale.US)
        val date: Date = datePatternForParse.parse(dateFromString)
        val datePatternForReturn = SimpleDateFormat("EEE, dd MMMM",Locale.US)
        return datePatternForReturn.format(date)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val flightSegmentItem = ticketsListDepart[position]
        val flightSegmentListSize = flightSegmentItem.flightSegmentList.size
        val time = ticketsListDepart[position].elapsedTime.substring(0,2)+":"+ticketsListDepart[position].elapsedTime.substring(2,4)
        if(flightSegmentListSize>1){
            println("flight segmnent array")
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode)
        }
        if(flightSegmentListSize>2) {
            println("more than twooo")
            holder.flightTime.text = (time + "/via " + flightSegmentItem.flightSegmentList[0].arrivalAirport.locationCode+ "/via " + flightSegmentItem.flightSegmentList[1].departureAirport.locationCode)
        }
        if(flightSegmentListSize==1){
            holder.flightTime.text = time
        }
        holder.price.text =  holder.view.context.resources.getString(R.string.pricePlaceHolder, flightSegmentItem.roundtripAirItineraryPricingInfo.itinTotalFare.totalFare.amount)
        holder.departAirport.text = flightSegmentItem.flightSegmentList[0].departureAirport.locationCode
        val t = ticketModel.pricedItineraryItemList[0].freeBaggages.baggage

        for(i in 0 until flightSegmentListSize) {
            val currentTicket = flightSegmentItem.flightSegmentList[i]
            val r = formatDate(currentTicket.flightDuration)
            val index = currentTicket.baggages.baggage.index
            for(j in 0..t.size-1){
                if(index.equals(t[j].index)){
                    holder.baggageIndex.text = holder.view.context.resources.getString(R.string.firstBag, t[j].quantity+(t[j].unit))
                }
            }
            holder.flightNumber.text = holder.view.context.resources.getString(R.string.flightNumber, currentTicket.flightNumber)
            holder.marketingAirline.text = holder.view.context.resources.getString(R.string.marketingAirline, currentTicket.marketingAirline.code)
            val operatingAirLineCode = flightSegmentItem.flightSegmentList[i].operatingAirline.code.toString() // 0---------
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
            holder.arrivalTime.text= flightSegmentItem.flightSegmentList[flightSegmentListSize-1].arrivalDateTime.substring(currentTicket.arrivalDateTime.lastIndexOf("T")+1).substring(0,5)
            holder.departTime.text = currentTicket.departureDateTime.substring(currentTicket.departureDateTime.lastIndexOf("T")+1).subSequence(0,5)
        }
    }
    fun getTicketViewModel():TicketDataViewModel{
        return ticketModel
    }
    fun getArriveTicketsList():ArrayList<OriginDestinationOptionItemViewModel>{
        return ticketListArrive;
    }
    fun getDepartTicketsList():ArrayList<OriginDestinationOptionItemViewModel>{
        return ticketsListDepart
    }
    fun getAllDepartTicketsList():ArrayList<OriginDestinationOptionItemViewModel>{
        return allTicketsListDepart
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightRoundtripTicketsAdapter.ViewHolder{
        val layoutInflater: LayoutInflater= LayoutInflater.from(parent.context)
        db = AppDatabase.getInstance(parent.context)!!

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
            for(j in 0 until tNumber){
                if(ticketModel.pricedItineraryItemList[i].customOriginDestinationOptionItemList[j].directionId=="0")
                counter ++
            }
        }
        return counter
    }



    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //find views
        var airportName : TextView = view.findViewById(R.id.airportName)
        var airportImage: ImageView = view.findViewById(R.id.airportImage)
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

