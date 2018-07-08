package crocusoft.com.gez.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.squareup.picasso.Picasso
import crocusoft.com.gez.R
import crocusoft.com.gez.database.AppDatabase
import crocusoft.com.gez.models.TicketCombination
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.view_model.TicketDataViewModel
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class FlightMultiCityAdapter() : RecyclerView.Adapter<FlightMultiCityAdapter.ViewHolder>() {

    private var ticketModel: TicketDataViewModel = TicketDataViewModel()

    private var ticketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    val ticketComninationList: List<TicketCombination> = ArrayList()
    private var combinationsList: ArrayList<OriginDestinationCombinationItem> = ArrayList()
    var ticketsIndexList: List<String> = ArrayList()
    var t: OriginDestinationOptionItemViewModel = OriginDestinationOptionItemViewModel()
    private lateinit var db: AppDatabase


    public fun addViewModel(ticketDataViewModel: TicketDataViewModel) {
        ticketModel = ticketDataViewModel
        notifyDataSetChanged()
        departTicketsListFill()
        // arriveTicketsListFill()
        combinationListFill()
        //  indexListFill()
        //getTickets()
    }

    private fun departTicketsListFill() {
        for (k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginDestinationOptionItemListSize) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                if (originDestinationOptionItem.directionId == "0") {
                    originDestinationOptionItem.sequenceNumber = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j].sequenceNumber
                    ticketsListDepart.add(originDestinationOptionItem)
                }
            }
        }
    }

    private fun combinationListFill() {
        for (k in 0 until ticketModel.pricedItineraryItemList.size) {

            val customOriginCombinationOptionItem = ticketModel.pricedItineraryItemList[k].originMultiCityCombinationOptionList
            for (j in 0..(customOriginCombinationOptionItem.size - 1)) {
                val ticketCombination: TicketCombination = TicketCombination()
//                val originCombinationOptionItem: OriginDestinationCombinationItem = ticketModel.pricedItineraryItemList[k].originMultiCityCombinationOptionList[j]
//                combinationsList.add(originCombinationOptionItem)
                ticketsIndexList = ticketModel.pricedItineraryItemList[k].originMultiCityCombinationOptionList[j].indexList.split(";")
                ticketCombination.indexList = ticketsIndexList as ArrayList
                val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
                val allTicketsList: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
                for (l in 0..ticketCombination.indexList.size - 1) {
                    for (i in 0..customOriginDestinationOptionItemListSize - 1) {
                        val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[i]
                        ticketCombination.segment = originDestinationOptionItem.sequenceNumber
                        if (originDestinationOptionItem.refNumber == ticketsIndexList[l] && originDestinationOptionItem.directionId.toInt() == l) {
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

    fun getTickets(): ArrayList<TicketCombination> {
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
        var arrivalAirport = ""
        var departAirport = ""
        var arrivalTime = ""
        var departTime = ""
        var flightDuration = ""
        var firstFlightDuration = ""
        var firstDepartAirport = ""
        var firstArrivalAirport = ""
        var firstItem: OriginDestinationOptionItemViewModel = OriginDestinationOptionItemViewModel()
        var secondItem: OriginDestinationOptionItemViewModel = OriginDestinationOptionItemViewModel()
        holder.baggageLayout.visibility = View.GONE
        val flightSegmentItem = ticketComninationList[position]
        val size = flightSegmentItem.originDestinations.size - 1
        if (size < 2) {
            holder.thirdLinear.visibility = View.GONE
            holder.forthLinear.visibility = View.GONE
        } else if (size < 3) {
            holder.forthLinear.visibility = View.GONE
        }
        for (j in 0..size) {
            firstItem = flightSegmentItem.originDestinations[j]
            //  val flightSegmentListSize = firstItem.multiCityFlightSegment.size
            val time = firstItem.elapsedTime.substring(0, 2) + ":" + firstItem.elapsedTime.substring(2, 4)
            //   secondItem = flightSegmentItem.originDestinations[1]
//        val secondFlightSegmentListSize = secondItem.multiCityFlightSegment.size
//        val secondTime = secondItem.elapsedTime.substring(0, 2) + ":" + secondItem.elapsedTime.substring(2, 4)
            val ticket = firstItem.multiCityFlightSegment[0]
            flightDuration = formatDate(ticket.flightDuration)
            val operatingAirLineCode = ticket.operatingAirline.code.toString()

            departAirport = ticket.departureAirport.locationCode
            arrivalAirport = ticket.arrivalAirport.locationCode
            arrivalTime = ticket.arrivalDateTime.substring(ticket.arrivalDateTime.lastIndexOf("T") + 1).substring(0, 5)
            departTime = ticket.departureDateTime.substring(ticket.departureDateTime.lastIndexOf("T") + 1).substring(0, 5)
            if (j == 0) {
                val codeLine = "%$operatingAirLineCode%"
                doAsync {
                    val image: AirportImageResponse? = db!!.imagesDataDAO().getImage(codeLine)
                    val t = image!!.airlineName.substring(image!!.airlineName.lastIndexOf("_") + 1).substringBefore(".")
                    holder.firstAirportName.text = t
                    uiThread {
                        Picasso.get().load("http://88.99.186.108:8888/Content/images/airline_logo/${image!!.airlineName}").into(holder.firstAirportImage)
                    }
                }
                holder.firstArrivalAirport.text = arrivalAirport
                holder.firstDepartAirport.text = departAirport
                holder.firstArrivalTime.text = arrivalTime
                holder.firstDepartTime.text = departTime
                holder.firstFlightTime.text = time
                holder.price.text = holder.view.context.resources.getString(R.string.pricePlaceHolder, firstItem.multiAirItineraryPricingInfo.itinTotalFare.totalFare.amount)

            }
            if (j == 1) {
                val codeLine = "%$operatingAirLineCode%"
                doAsync {
                    val image: AirportImageResponse? = db!!.imagesDataDAO().getImage(codeLine)
                    val t = image!!.airlineName.substring(image!!.airlineName.lastIndexOf("_") + 1).substringBefore(".")
                    holder.airportName.text = t
                    uiThread {
                        Picasso.get().load("http://88.99.186.108:8888/Content/images/airline_logo/${image!!.airlineName}").into(holder.airportImage)
                    }
                }
                holder.arrivalAirport.text = arrivalAirport
                holder.arrivalTime.text = arrivalTime
                holder.departAirport.text = departAirport
                holder.departTime.text = departTime
                holder.flightTime.text = time
            }

            if (j == 2) {
                val codeLine = "%$operatingAirLineCode%"
                doAsync {
                    val image: AirportImageResponse? = db!!.imagesDataDAO().getImage(codeLine)
                    val t = image!!.airlineName.substring(image!!.airlineName.lastIndexOf("_") + 1).substringBefore(".")
                    holder.thirdAirportName.text = t
                    uiThread {
                        Picasso.get().load("http://88.99.186.108:8888/Content/images/airline_logo/${image!!.airlineName}").into(holder.thirdAirportImage)
                    }
                }
                holder.thirdArrivalAirport.text = arrivalAirport
                holder.thirdArrivalTime.text = arrivalTime
                holder.thirdDepartAirport.text = departAirport
                holder.thirdDepartTime.text = departTime
                holder.thirdFlightTime.text = time
            }
            if (j == 3) {
                val codeLine = "%$operatingAirLineCode%"
                doAsync {
                    val image: AirportImageResponse? = db!!.imagesDataDAO().getImage(codeLine)
                    val t = image!!.airlineName.substring(image!!.airlineName.lastIndexOf("_") + 1).substringBefore(".")
                    holder.forthAirportName.text = t
                    uiThread {
                        Picasso.get().load("http://88.99.186.108:8888/Content/images/airline_logo/${image!!.airlineName}").into(holder.forthAirportImage)
                    }
                }
                holder.forthArrivalAirport.text = arrivalAirport
                holder.forthArrivalTime.text = arrivalTime
                holder.forthDepartAirport.text = departAirport
                holder.forthDepartTime.text = departTime
                holder.forthFlightTime.text = time
            }
        }
        }
        fun getTicketViewModel(): TicketDataViewModel {
            return ticketModel
        }

        fun getDepartTicketsList(): ArrayList<OriginDestinationOptionItemViewModel> {
            return ticketsListDepart
        }

        fun getIndexList(): List<String> {
            return ticketsIndexList;
        }

        override fun getItemId(position: Int): Long {
            return super.getItemId(position)
        }

        override fun getItemViewType(position: Int): Int {
            return super.getItemViewType(position)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlightMultiCityAdapter.ViewHolder {
            val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
            val view: View = layoutInflater.inflate(R.layout.item_flight_multicity, parent, false) as View
            // view.firstLinear.visibility = View.GONE
            db = AppDatabase.getInstance(parent.context)!!

            return ViewHolder(view)
        }


        override fun getItemCount(): Int {
            return ticketComninationList.size
        }


        class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
            //find views
            var airportName: TextView = view.findViewById(R.id.airportName)
            var flightTime: TextView = view.findViewById(R.id.flightTime)
            var departTime: TextView = view.findViewById(R.id.departTime)
            var arrivalTime: TextView = view.findViewById(R.id.arrivalTime)
            var arrivalAirport: TextView = view.findViewById(R.id.arrivalAirport)
            var departAirport: TextView = view.findViewById(R.id.departAirport)
            var price: TextView = view.findViewById(R.id.priceTextView)
            var airportImage: ImageView = view.findViewById(R.id.airportImage)
            var thirdLinear: LinearLayout = view.findViewById(R.id.thirdLinear)
            var forthLinear: LinearLayout = view.findViewById(R.id.forthLinear)
            val firstAirportName: TextView = view.findViewById(R.id.firstAirportName)
            val firstFlightTime: TextView = view.findViewById(R.id.firstFlightTime)
            var firstFlightDate: TextView = view.findViewById(R.id.firstFlightDate)
            var firstDepartTime: TextView = view.findViewById(R.id.firstDepartTime)
            var firstArrivalTime: TextView = view.findViewById(R.id.firstArrivalTime)
            var firstArrivalAirport: TextView = view.findViewById(R.id.firstArrivalAirport)
            var firstDepartAirport: TextView = view.findViewById(R.id.firstDepartAirport)
            var firstAirportImage: ImageView = view.findViewById(R.id.firstAirportImage)
            val thirdAirportName: TextView = view.findViewById(R.id.thirdAirportName)
            val thirdFlightTime: TextView = view.findViewById(R.id.thirdFlightTime)
            var thirdFlightDate: TextView = view.findViewById(R.id.thirdFlightDate)
            var thirdDepartTime: TextView = view.findViewById(R.id.thirdDepartTime)
            var thirdArrivalTime: TextView = view.findViewById(R.id.thirdArrivalTime)
            var thirdArrivalAirport: TextView = view.findViewById(R.id.thirdArrivalAirport)
            var thirdDepartAirport: TextView = view.findViewById(R.id.thirdDepartAirport)
            var thirdAirportImage: ImageView = view.findViewById(R.id.thirdAirportImage)
            val forthAirportName: TextView = view.findViewById(R.id.forthAirportName)
            val forthFlightTime: TextView = view.findViewById(R.id.forthFlightTime)
            var forthFlightDate: TextView = view.findViewById(R.id.forthFlightDate)
            var forthDepartTime: TextView = view.findViewById(R.id.forthDepartTime)
            var forthArrivalTime: TextView = view.findViewById(R.id.forthArrivalTime)
            var forthArrivalAirport: TextView = view.findViewById(R.id.forthArrivalAirport)
            var forthDepartAirport: TextView = view.findViewById(R.id.forthDepartAirport)
            var forthAirportImage: ImageView = view.findViewById(R.id.forthAirportImage)
            var baggageLayout:LinearLayout = view.findViewById(R.id.baggageLayout)
        }
    }


