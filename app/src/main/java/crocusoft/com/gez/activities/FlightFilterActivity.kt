package crocusoft.com.gez.activities

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import com.google.gson.Gson
import com.google.gson.JsonArray
import crocusoft.com.gez.R
import crocusoft.com.gez.database.AppDatabase
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel
import crocusoft.com.gez.flight_view_model.TicketDataViewModel
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse
import crocusoft.com.gez.util.AppSharedPreferences
import crocusoft.com.gez.util.Utils
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread
import org.json.JSONArray

class FlightFilterActivity : AppCompatActivity() {
    private lateinit var checkBox: CheckBox
    private lateinit var oneStopCheckBox: CheckBox
    private lateinit var onePlusStopCheckBox: CheckBox
    private lateinit var stopCheckBoxLinearLayout: LinearLayout
    private lateinit var arrivalAirportCheckBoxLinearLayout: LinearLayout
    private var ticketModel = TicketDataViewModel()
    private lateinit var db: AppDatabase
    private lateinit var sendButton : Button
    private lateinit var airlinesCheckBoxLinearLayout: LinearLayout
    private var ticketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var newTicketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var roundtripTicketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var roundtripReturnTicketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var newRoundtripTicketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()
    private var newRoundtripReturnTicketsListDepart: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList()

    private var airlineNames : ArrayList<String> = ArrayList()
    private var arrivalAirportNames : ArrayList<String> = ArrayList()
    private var checkedAirlineList : ArrayList<String> = ArrayList()
    private var checkedArrivalAirportList : ArrayList<String> = ArrayList()
    var airlineList = ArrayList<String>()
    val gson = Gson()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_filter)
        val myPreferences = AppSharedPreferences(this)
        val bundle = intent.extras
        db = AppDatabase.getInstance(this)!!
        airlinesCheckBoxLinearLayout = findViewById(R.id.airlinesCheckBoxLinearLayout)
        arrivalAirportCheckBoxLinearLayout = findViewById(R.id.arrivalAirportCheckBoxLinearLayout)
        stopCheckBoxLinearLayout = findViewById(R.id.stopCheckBoxLinearLayout)
        sendButton = findViewById(R.id.sendButton)
        addStopCheckBoxView()

        if(intent.getStringExtra("key").equals("roundtrip")){
            val roundViewModelJSON = myPreferences.getString("roundtripModel")
            ticketModel = gson.fromJson(roundViewModelJSON,TicketDataViewModel::class.java)
            departTicketsListFill()
//            val ticketsList : JsonArray = gson.fromJson(roundViewModelJSON,JsonArray::class.java)
//            for(j in 0 until ticketsList.size()) {
//                val jsonObject = ticketsList.get(j)
//                roundtripTicketsListDepart.add(Gson().fromJson(jsonObject.toString(), OriginDestinationOptionItemViewModel::class.java))
//            }
            checkBoxRoundtrip()
        }else if(intent.getStringExtra("key").equals("one")){
           val viewModelJSON = myPreferences.getString("oneWayTicketModel")
            ticketModel = gson.fromJson(viewModelJSON, TicketDataViewModel::class.java)
            departTicketsList()
            checkBoxOneWay()

        }


        sendButton.setOnClickListener(View.OnClickListener {
            newTicketsListDepart.clear()
            newRoundtripTicketsListDepart.clear()
            checkedAirlineList.clear()
            listOfCheckedBox()
            val intent = Intent(this,FlightOneWaySorted::class.java)
            val roundtripIntent = Intent(this,FlightRoundTripSorted::class.java)
            val bundleSend = Bundle()
//            val dialog: AlertDialog = initBuilder().create()
//            dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//            dialog.show()
//            dialog.setCancelable(false)
            doAsync {
              //  dialog.show()
                val newTickets = oneWayAirlineFilter(checkedAirlineList)
                val rountTickets = roundtripAirlineFilter(checkedAirlineList)
                if(newTicketsListDepart.isNotEmpty()) {
                    myPreferences.putString("sortedTickets", gson.toJson(newTickets))
                    uiThread {
                        startActivity(intent)
                    }
                }else if(newRoundtripTicketsListDepart.isNotEmpty()){
                    myPreferences.putString("roundSort", gson.toJson(rountTickets))
                    uiThread {
                        startActivity(roundtripIntent)
                    }
                }
                else{
                    uiThread {
                        Utils.toast(this@FlightFilterActivity, "Tickets not found!")
                    }
                }
            }
        })

    }
    private fun listOfCheckedBox(){
        val count = airlinesCheckBoxLinearLayout.getChildCount()
        val arrivalCount = arrivalAirportCheckBoxLinearLayout.childCount
        for (i in 0 until count) {
            val v = airlinesCheckBoxLinearLayout.getChildAt(i)
            if (v is CheckBox) {
                if(v.isChecked) {
                    checkedAirlineList.add(v.text.toString())
                }
            }
        }
        for(j in 0..arrivalCount){
            val v = arrivalAirportCheckBoxLinearLayout.getChildAt(j)
            if (v is CheckBox) {
                if(v.isChecked) {
                    checkedArrivalAirportList.add(v.text.toString())
                }
            }
        }
    }
    private fun addStopCheckBoxView(){
        onePlusStopCheckBox = CheckBox(this@FlightFilterActivity)
        oneStopCheckBox = CheckBox(this@FlightFilterActivity)
        oneStopCheckBox.text = getString(R.string.oneStop)
        onePlusStopCheckBox.text = getString(R.string.onePlusStop)
        stopCheckBoxLinearLayout.addView(oneStopCheckBox)
        stopCheckBoxLinearLayout.addView(onePlusStopCheckBox)
    }
    private fun checkBoxOneWay(){
        for(i in 0..ticketsListDepart.size-1){
            //    for (j in 0..ticketsListDepart[i].flighTSegmentList.size-1){
            val flightSegment = ticketsListDepart[i].flighTSegmentList[0]
            val operatingAirLineCode = flightSegment.operatingAirline.code.toString()
            val codeLine = "%$operatingAirLineCode%"
            doAsync {
                //val image: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
                val image: AirportImageResponse? = db.imagesDataDAO().getImage(codeLine)
                val airName = image!!.airlineName.substring(image.airlineName.lastIndexOf("_")+1).substringBefore(".")
                airlineNames.add(airName)
                arrivalAirportNames.add(flightSegment.arrivalAirport.locationCode)
                if(i==ticketsListDepart.size-1) {
                    uiThread {
                        airlineList = airlineNames.distinct() as ArrayList<String>
                        arrivalAirportNames = arrivalAirportNames.distinct() as ArrayList<String>
                        for(k in 0..airlineList.size-1){
                            checkBox = CheckBox(this@FlightFilterActivity)
                            checkBox.text = airlineList.get(k).toString()
                            airlinesCheckBoxLinearLayout.addView(checkBox)

                        }
                        for(m in 0..arrivalAirportNames.size-1){
                            checkBox = CheckBox(this@FlightFilterActivity)
                            checkBox.text = arrivalAirportNames.get(m)
                            arrivalAirportCheckBoxLinearLayout.addView(checkBox)
                        }
                    }
                }
            }
        }
    }
    private fun checkBoxRoundtrip(){

        airlineNames.clear()
        for(i in 0..roundtripTicketsListDepart.size-1){
            //    for (j in 0..ticketsListDepart[i].flighTSegmentList.size-1){
            val flightSegment = roundtripTicketsListDepart[i].flightSegmentList[0]
            val operatingAirLineCode = flightSegment.operatingAirline.code.toString()
            val codeLine = "%$operatingAirLineCode%"
            doAsync {
                //val image: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
                val image: AirportImageResponse? = db.imagesDataDAO().getImage(codeLine)
                val airName = image!!.airlineName.substring(image.airlineName.lastIndexOf("_")+1).substringBefore(".")
                airlineNames.add(airName)
                arrivalAirportNames.add(flightSegment.arrivalAirport.locationCode)

                if(i==roundtripTicketsListDepart.size-1) {
                    uiThread {
                        airlineList = airlineNames.distinct() as ArrayList<String>
                        arrivalAirportNames = arrivalAirportNames.distinct() as ArrayList<String>
                        for(k in 0..airlineList.size-1){
                            checkBox = CheckBox(this@FlightFilterActivity)
                            checkBox.text = airlineList.get(k).toString()
                            airlinesCheckBoxLinearLayout.addView(checkBox)

                        }
                        for(m in 0..arrivalAirportNames.size-1){
                            checkBox = CheckBox(this@FlightFilterActivity)
                            checkBox.text = arrivalAirportNames.get(m)
                            arrivalAirportCheckBoxLinearLayout.addView(checkBox)
                        }
                    }
                }
            }
        }
    }
    private fun oneWayAirlineFilter(checkedList:ArrayList<String>):ArrayList<OriginDestinationOptionItemViewModel>{
        //doAsync {
        checkedList.clear()
        for(i in 0..ticketsListDepart.size-1){
            val flightSegment = ticketsListDepart[i].flighTSegmentList.size
            Log.e("size",flightSegment.toString())
            val operatingAirLineCode = ticketsListDepart[i].flighTSegmentList[0].operatingAirline.code.toString()
            val codeLine = "%$operatingAirLineCode%"
                //val image: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
            val image: AirportImageResponse? = db.imagesDataDAO().getImage(codeLine)
            val airName = image!!.airlineName.substring(image.airlineName.lastIndexOf("_") + 1).substringBefore(".")
            if (checkedList.isNotEmpty()) {
                for (l in 0..checkedList.size - 1) {
                    if (checkedList[l].equals(airName)) {
                        if (oneStopCheckBox.isChecked && flightSegment == 1) {
                            newTicketsListDepart.add(ticketsListDepart[i])
                        } else if (onePlusStopCheckBox.isChecked && flightSegment > 1) {
                            newTicketsListDepart.add(ticketsListDepart[i])
                        } else if (!oneStopCheckBox.isChecked && !onePlusStopCheckBox.isChecked) {
                            newTicketsListDepart.add(ticketsListDepart[i])
                        }
                    }
                    else{
                        Utils.toast(this@FlightFilterActivity, "Tickets not found ")

                    }
                }
            }
                else {
                if (oneStopCheckBox.isChecked && flightSegment == 1) {
                    newTicketsListDepart.add(ticketsListDepart[i])
                } else if (onePlusStopCheckBox.isChecked && flightSegment == 2) {
                    newTicketsListDepart.add(ticketsListDepart[i])
                } else if (!oneStopCheckBox.isChecked && !onePlusStopCheckBox.isChecked) {
                    Utils.toast(this@FlightFilterActivity, "Please select at least one filter ")
                }else{
                    Utils.toast(this@FlightFilterActivity, "Tickets not found ")

                }

            }}

        return newTicketsListDepart
    }

    private fun roundtripAirlineFilter(checkedList:ArrayList<String>):ArrayList<OriginDestinationOptionItemViewModel> {
        //doAsync {
        checkedList.clear()

        for (i in 0..roundtripTicketsListDepart.size - 1) {
            val flightSegment = roundtripTicketsListDepart[i].flightSegmentList.size
            val operatingAirLineCode = roundtripTicketsListDepart[i].flightSegmentList[0].operatingAirline.code.toString()
            val codeLine = "%$operatingAirLineCode%"
            //val image: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
            val image: AirportImageResponse? = db.imagesDataDAO().getImage(codeLine)
            val airName = image!!.airlineName.substring(image.airlineName.lastIndexOf("_") + 1).substringBefore(".")
            if (checkedList.isNotEmpty()) {

                for (l in 0..checkedList.size - 1) {
                    Log.e("tic", operatingAirLineCode)
                    if (checkedList[l].equals(airName)) {
                        //   Log.e("size",checkedList.toString())
                        if (oneStopCheckBox.isChecked && flightSegment == 1) {
                            newRoundtripTicketsListDepart.add(roundtripTicketsListDepart[i])
                        } else if (onePlusStopCheckBox.isChecked && flightSegment > 1) {
                            newRoundtripTicketsListDepart.add(roundtripTicketsListDepart[i])
                        } else if (!oneStopCheckBox.isChecked && !onePlusStopCheckBox.isChecked) {
                            newRoundtripTicketsListDepart.add(roundtripTicketsListDepart[i])
                        }
                    }else{
                        Utils.toast(this@FlightFilterActivity, "Tickets not found ")

                    }
                }
            } else {
                if (oneStopCheckBox.isChecked && flightSegment == 1) {
                    newRoundtripTicketsListDepart.add(roundtripTicketsListDepart[i])
                } else if (onePlusStopCheckBox.isChecked && flightSegment == 2) {
                    newRoundtripTicketsListDepart.add(roundtripTicketsListDepart[i])
                } else if (!oneStopCheckBox.isChecked && !onePlusStopCheckBox.isChecked) {
                    Utils.toast(this@FlightFilterActivity, "Please select at least one filter ")
                }else{
                    Utils.toast(this@FlightFilterActivity, "Tickets not found ")
                }
            }


        }
        return newRoundtripTicketsListDepart
    }

    private fun departTicketsList():ArrayList<OriginDestinationOptionItemViewModel> {

        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginDestinationOptionItemListSize) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                originDestinationOptionItem.sequenceNumber =  ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j].sequenceNumber
                ticketsListDepart.add(originDestinationOptionItem)
            }
        }
        return ticketsListDepart
    }
    private fun initBuilder():AlertDialog.Builder {
        val builder = AlertDialog.Builder(this)
        val view:View = getLayoutInflater().inflate(R.layout.progress,null);
        builder.setView(view)
        //val dialog = builder.create()
        return builder
    }
    private fun departTicketsListFill():ArrayList<OriginDestinationOptionItemViewModel> {
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginDestinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginDestinationOptionItemListSize) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                if (originDestinationOptionItem.directionId == "0") {
                    originDestinationOptionItem.sequenceNumber =  ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j].sequenceNumber
                    roundtripTicketsListDepart.add(originDestinationOptionItem)
                }
            }
        }
        return roundtripTicketsListDepart
    }
    private fun arriveTicketsListFill() {
        for(k in 0 until ticketModel.pricedItineraryItemList.size) {
            val customOriginCombinationOptionItemListSize = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList.size
            for (j in 0 until customOriginCombinationOptionItemListSize) {
                val originDestinationOptionItem: OriginDestinationOptionItemViewModel = ticketModel.pricedItineraryItemList[k].customOriginDestinationOptionItemList[j]
                if (originDestinationOptionItem.directionId == "1") {
                    roundtripReturnTicketsListDepart.add(originDestinationOptionItem)
                }
            }
        }
    }
}
