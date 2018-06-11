package crocusoft.com.gez.fragments

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.NestedScrollView
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.activities.FlightMultiCityActivity
import crocusoft.com.gez.activities.FlightOneWayActivity
import crocusoft.com.gez.util.Utils
import crocusoft.com.gez.activities.FlightTicketsActivity
import crocusoft.com.gez.models.AirportModel
import crocusoft.com.gez.models.AirportSearchModel
import crocusoft.com.gez.pojo.request.searchRoundtripFlight.*
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService
import crocusoft.com.gez.util.Utility
import kotlinx.android.synthetic.main.flight_multy_city.view.*
import kotlinx.android.synthetic.main.fragment_flight.view.*
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class FlightFragment : Fragment(){
    private lateinit var radioMultyCity : RadioButton
    private lateinit var multyCityLinearLayout : LinearLayout
    private lateinit var buttonLinearLayout : LinearLayout
    private lateinit var elementsLinearLayout: LinearLayout
    private lateinit var scrollView : NestedScrollView
    private lateinit var secondFlightMultiCity : View
    private lateinit var thirdFlightMultiCity : View
    private lateinit var forthFlightMultiCity : View
    private lateinit var fifthFlightMultiCity : View
    private lateinit var radioRoundTrip : RadioButton
    private lateinit var radioOneWay : RadioButton
    private lateinit var mainSearchButton : Button
    private lateinit var firstLabel : TextView
    private lateinit var searchMultiButton:Button
    private lateinit var returnTextView : TextView
    private lateinit var returnDatePicker : TextView
    private lateinit var fromEditText: EditText
    private lateinit var toEditText: EditText
    private lateinit var adultCountPicker :Spinner
    private lateinit var childCountPicker: Spinner
    private lateinit var departDatePicker : TextView
    private lateinit var fromAutoComplete: AutoCompleteTextView
    private lateinit var toAutoComplete: AutoCompleteTextView
    private val  multiDestinationList : ArrayList<OriginDestinationInformation_> = ArrayList()
    private var clickCounter : Int = 0
    var isCity = false
    var code = ""
    private lateinit var mainLinearLayout : LinearLayout
    private lateinit var addRemoveView : View
    private lateinit var addButton: Button
    private lateinit var removeButton: Button
    var originLocation : OriginLocation = OriginLocation()
    var destinationLocation : DestinationLocation= DestinationLocation()

    var secondOriginLocation : OriginLocation = OriginLocation()
    var secondDestinationLocation : DestinationLocation= DestinationLocation()

    var thirdOriginLocation : OriginLocation = OriginLocation()
    var thirdDestinationLocation : DestinationLocation= DestinationLocation()


    var oneWayOriginLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation()
    var oneWayDestination = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation()
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_flight, container, false)
        initMainView(inflater,container,view)
        return  view
    }

    private fun initMainView(inflater: LayoutInflater, container: ViewGroup?,view : View){
        firstLabel = TextView(context)
        multyCityLinearLayout = LinearLayout(context)
        buttonLinearLayout = LinearLayout(context)
        radioMultyCity = view.findViewById(R.id.radioMultyCity)
        scrollView = view.findViewById(R.id.scrollView)
        mainSearchButton = view.findViewById(R.id.searchButton)
        elementsLinearLayout = view.findViewById(R.id.elementsLinearLayout)
        mainLinearLayout = view.findViewById(R.id.mainLinearLayout)
        radioRoundTrip = view.findViewById(R.id.radioRoundTrip)
        radioOneWay = view.findViewById(R.id.radioOneWay)
        adultCountPicker = view.findViewById(R.id.adultCountPicker)
        childCountPicker = view.findViewById(R.id.childrenCountPicker)
        returnTextView = view.findViewById(R.id.returnTextView)
        returnDatePicker = view.findViewById(R.id.returnDate)
        departDatePicker = view.findViewById(R.id.departDate)
        radioRoundTrip.isChecked = true
        fromAutoComplete = view.findViewById(R.id.fromAutoComplete)
        toAutoComplete = view.findViewById(R.id.toAutoComplete)


        val dialog:AlertDialog = initBuilder().create()
        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        Utils.datePicker(returnDatePicker, context!!)
        Utils.datePicker(departDatePicker, context!!)

        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        // Utils.getAirportsList(service,)
        val airportNames: ArrayList<AirportModel> = ArrayList()
        val airportCodes: ArrayList<String> = ArrayList()
        setClickListeners(inflater,container)
        fromAutoComplete.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Utils.getAirportsList(service,fromAutoComplete.text.toString(),object: Utils.Companion.AirportListApiCallback{
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for(i in 0..response!!.body()!!.size-1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).airportname)
                        }
                        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(context,android.R.layout.simple_dropdown_item_1line,airportCodes)
                        fromAutoComplete.setAdapter(adapter)

                        fromAutoComplete.onItemClickListener = AdapterView.OnItemClickListener{
                            parent, view, position, id ->
                            for(i in 0..airportNames.size-1) {
                                if(airportNames[i].airportname.equals(airportCodes[position])){
                                    isCity = airportNames[i].isCity
                                    code = airportCodes[position]
                                    if(isCity) {
                                        originLocation = OriginLocation(airportCodes[position],"true")
                                        oneWayOriginLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation(airportCodes[position],"true")
                                    }else{
                                        originLocation = OriginLocation(airportCodes[position])
                                        oneWayOriginLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation(airportCodes[position])
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                })
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
       toAutoComplete.addTextChangedListener(object: TextWatcher{
           override fun afterTextChanged(s: Editable?) {
               Utils.getAirportsList(service,toAutoComplete.text.toString(),object: Utils.Companion.AirportListApiCallback{
                   override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                       airportNames.clear()
                       airportCodes.clear()
                       for(i in 0..response!!.body()!!.size-1) {
                           val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].isIsCity)
                           airportNames.add(airportModel)
                           airportCodes.add(airportNames.get(i).airportname)
                       }

                       val adapter: ArrayAdapter<String> = ArrayAdapter<String>(context,android.R.layout.simple_dropdown_item_1line,airportCodes)
                       toAutoComplete.setAdapter(adapter)

                       toAutoComplete.onItemClickListener = AdapterView.OnItemClickListener{
                           parent, view, position, id ->
                           for(i in 0..airportNames.size-1) {
                               if(airportNames[i].airportname.equals(airportCodes[position])){
                                    isCity = airportNames[i].isCity
                                   if(isCity) {
                                        destinationLocation = DestinationLocation(airportCodes[position],"true")
                                        oneWayDestination = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation(airportCodes[position],"true")
                                   }else{
                                        destinationLocation = DestinationLocation(airportCodes[position])
                                        oneWayDestination = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation(airportCodes[position])
                                   }
                               }
                           }
                       }
                       adapter.notifyDataSetChanged()
                   }
               })
           }
           override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
           }
           override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
           }
       })

        mainSearchButton.setOnClickListener(View.OnClickListener {
            if(radioRoundTrip.isChecked) {
                if(validateFieldsRoundTrip()) {
                    dialog.show()
                    dialog.setCancelable(false)
                    roundTripFlightSearch(service, object : Utils.Companion.ApiCallback {
                        override fun onSuccess(call: Call<RoundtripResponse>?, response: Response<RoundtripResponse>?) {
                            val bundle = Bundle()
                            val intent = Intent(context, FlightTicketsActivity::class.java)
                            val fd: Gson = Gson()
                            val ticketsJSON = fd.toJson(Utility.getTicketList(response!!.body()))
                            var y =Utility.getTicketList(response!!.body())
                          //  Log.e("sdf",y.toString())
                            Log.e("session",response.headers().get("Set-Cookie").toString())

                            bundle.putString("flightTickets", ticketsJSON)
                            intent.putExtras(bundle)
                            dialog.hide()
                            startActivity(intent)
                        }} , object: Utils.Companion.ApiCallbackFailure {
                        override fun onFailre(call: Call<RoundtripResponse>?, t: Throwable?) {
                            dialog.hide()
                            Log.e("ef",t!!.message.toString())
                            Utils.toast(context!!, "Can't find available tickets")
                        }
                    })

                }
            }else if(radioOneWay.isChecked){
                if(validateFieldsOneWay()){
                    oneWayFlightSearch(service, object : Utils.Companion.OneWayApiCallback {
                        override fun onSuccess(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, response: Response<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?) {
                            val bundle = Bundle()
                            val intent = Intent(context, FlightOneWayActivity::class.java)
                            val fd: Gson = Gson()
                            val objectDest = fd.toJson(Utility.getTicketList(response!!.body()))
                            bundle.putString("jsonTicket", objectDest)
                            intent.putExtras(bundle)
                            dialog.hide()
                            startActivity(intent)
                        }}, object: Utils.Companion.OneWayApiCallbackFailure{
                        override fun onFailure(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, t: Throwable?) {
                            dialog.hide()
                            Log.e("ef",t!!.message.toString())
                            Utils.toast(context!!, "Can't find available tickets")
                        }
                    })
                    dialog.show()
                    dialog.setCancelable(false)
                }
            }else if(radioMultyCity.isChecked){
                secondMultiCityContent()
            }
        })
    }
    private fun dateForm(dateString: String):String{
        val datePatternForParse = SimpleDateFormat("dd.MM.yyyy",Locale.US)
        val date: Date = datePatternForParse.parse(dateString)
        val newPattern = SimpleDateFormat("yyyy-MM-dd",Locale.US)
        return newPattern.format(date)
    }
    private fun initBuilder():AlertDialog.Builder {
        val builder = AlertDialog.Builder(context)
        val view:View = getLayoutInflater().inflate(R.layout.progress,null);
        builder.setView(view)
        val dialog = builder.create()
        return builder
    }
    private fun validateFieldsOneWay():Boolean{
        if(fromAutoComplete.text.isEmpty()){
            Utils.toast(this!!.context!!,"Choose your location")
            return false
        }
        if(toAutoComplete.text.trim().isEmpty()){
            Utils.toast(this.context!!,"Choose destination location")
            return false
        }
        if(departDatePicker.text.trim().isEmpty()){
            Utils.toast(this.context!!,"Choose depart time")
            return false
        }
        if(adultCountPicker.count==0){
            Utils.toast(this.context!!,"Choose adult count")
            return false
        }
        return true
    }
    private fun isCorrectDates(depart: String, arrive: String): Boolean {
        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.US)
        val departDate: Date = dateFormat.parse(depart)
        val arriveDate: Date = dateFormat.parse(arrive)
        if(departDate.after(arriveDate)) {
            Utils.toast(context!!,"Return date must be after depart")
            return true
        }
        return false
    }
    private fun validateFieldsRoundTrip():Boolean{
        if(fromAutoComplete.text.isEmpty()){
            Utils.toast(this.context!!,"Choose your location")
            return false
        }
        if(toAutoComplete.text.isEmpty()){
            Utils.toast(this.context!!,"Choose destination location")
            return false
        }
        if(departDatePicker.text.isEmpty()){
            Utils.toast(this.context!!,"Choose depart time")
            return false
        }
        if(returnDatePicker.text.isEmpty()){
            Utils.toast(this.context!!,"Choose return time")
            return false
        }
        if(adultCountPicker.count==0){
            Utils.toast(this.context!!,"Choose adult count")
            return false
        }
        if(isCorrectDates(departDatePicker.text.toString(),returnDatePicker.text.toString())){
            return false
        }

        return true
    }
    private fun validateFieldsMultiCity():Boolean{
        if(fromAutoComplete.text.isEmpty()){
            Utils.toast(this.context!!,"Choose your location")
            return false
        }
        if(toAutoComplete.text.isEmpty()){
            Utils.toast(this.context!!,"Choose destination location")
            return false
        }
        if(departDatePicker.text.isEmpty()){
            Utils.toast(this.context!!,"Choose depart time")
            return false
        }
        if(adultCountPicker.count==0){
            Utils.toast(this.context!!,"Choose adult count")
            return false
        }

        if(secondFlightMultiCity.multiFromEditText.text.isEmpty()){
            Utils.toast(this.context!!,"Choose second location")
            return false
        }
        if(secondFlightMultiCity.multiToEditText.text.isEmpty()){
            Utils.toast(this.context!!,"Choose second destination")
            return false
        }
        if(secondFlightMultiCity.multiDepartTime.text.isEmpty()){
            Utils.toast(this.context!!,"Choose second time")
            return false
        }

        return true
    }
    private fun roundTripFlightSearch(service:RetrofitService, apiCallback: Utils.Companion.ApiCallback,apiCallbackFailure: Utils.Companion.ApiCallbackFailure){
        val originLocation = originLocation
        val destinationLocation = destinationLocation
        val newOriginLocation = originLocation
        val newDestinationLocation = destinationLocation
        val originLocationInformation = OriginDestinationInformation_(originLocation,
                destinationLocation,dateForm(departDatePicker.text.toString())+"T12:00:00")
        val originDestinationInformation = OriginDestinationInformation_(newOriginLocation,
                newDestinationLocation, dateForm(returnDatePicker.text.toString())+"T12:00:00")
        val  originDestinationList : ArrayList<OriginDestinationInformation_> = ArrayList()
        originDestinationList.add(originLocationInformation)
        originDestinationList.add(originDestinationInformation)
        val passengerTypeQuantity = PassengerTypeQuantity("ADT")
        val airTravelerAvail = AirTravelerAvail(passengerTypeQuantity)
        val cabinPref = CabinPref()
        val travelPreferences = TravelPreferences(cabinPref)
        val travelerInfoSummary = TravelerInfoSummary(airTravelerAvail)
        val otaAirLowFareSearchRQ = OTAAirLowFareSearchRQ(originDestinationList, travelPreferences, travelerInfoSummary)
        val searchFlight = SearchFlight(otaAirLowFareSearchRQ)
        val soapBody = SoapBody(searchFlight)
        val authenticationSoapHeader = AuthenticationSoapHeader()
        val soapHeader = SoapHeader(authenticationSoapHeader)
        val soapEnvelope = SoapEnvelope(soapHeader, soapBody)
        val searchRoundtripFlight = FlightRequest(soapEnvelope)
        val call : Call<RoundtripResponse> = service.roundTripFlightSearch(searchRoundtripFlight)
        call.enqueue(object : Callback<RoundtripResponse> {
            override fun onFailure(call: Call<RoundtripResponse>?, t: Throwable?) {
                apiCallbackFailure.onFailre(call,t)

            }
            override fun onResponse(call: Call<RoundtripResponse>?, response: retrofit2.Response<RoundtripResponse>?) {

                apiCallback.onSuccess(call, response)
            }
        })
    }

    private fun oneWayFlightSearch(service: RetrofitService, apiCallback: Utils.Companion.OneWayApiCallback, apiOneWayCallbackFailure: Utils.Companion.OneWayApiCallbackFailure){
        val originLocation = oneWayOriginLocation
        val destinationLocation = oneWayDestination
        val originLocationInformation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginDestinationInformation(originLocation,
                dateForm(departDatePicker.text.toString())+"T12:00:00", destinationLocation)
        val passengerTypeQuantity = crocusoft.com.gez.pojo.request.searchOnewayFlight.PassengerTypeQuantity("ADT")
        val airTravelerAvail = crocusoft.com.gez.pojo.request.searchOnewayFlight.AirTravelerAvail(passengerTypeQuantity)
        val travelerInfoSummary = crocusoft.com.gez.pojo.request.searchOnewayFlight.TravelerInfoSummary(airTravelerAvail)
        val otaAirLowFareSearchRQ = crocusoft.com.gez.pojo.request.searchOnewayFlight.OTAAirLowFareSearchRQ(originLocationInformation, travelerInfoSummary)
        val searchFlight = crocusoft.com.gez.pojo.request.searchOnewayFlight.SearchFlight(otaAirLowFareSearchRQ)
        val soapBody = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapBody(searchFlight)
        val authenticationSoapHeader = crocusoft.com.gez.pojo.request.searchOnewayFlight.AuthenticationSoapHeader()
        val soapHeader = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapHeader(authenticationSoapHeader)
        val soapEnvelope = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapEnvelope(soapHeader,soapBody)
        val searchOneWay = crocusoft.com.gez.pojo.request.searchOnewayFlight.Request(soapEnvelope)

        val call : Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response> = service.oneWayFlightSearch(searchOneWay)

        call.enqueue(object :Callback<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>{
            override fun onFailure(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, t: Throwable?) {
                apiOneWayCallbackFailure.onFailure(call,t)
            }
            override fun onResponse(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, response: retrofit2.Response<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?) {
                apiCallback.onSuccess(call,response)
            }
        })
    }

    private fun multiCityFlightSearch(service:RetrofitService, apiCallback: Utils.Companion.MultiCityApiCallback,apiCallbackFailure: Utils.Companion.MultiCityApiCallbackFailure){
        val passengerTypeQuantity = PassengerTypeQuantity("ADT")
        val airTravelerAvail = AirTravelerAvail(passengerTypeQuantity)
        val cabinPref = CabinPref()
        val travelPreferences = TravelPreferences(cabinPref)
        val travelerInfoSummary = TravelerInfoSummary(airTravelerAvail)
        val otaAirLowFareSearchRQ = OTAAirLowFareSearchRQ(multiDestinationList, travelPreferences,"true",travelerInfoSummary)
        val searchFlight = SearchFlight(otaAirLowFareSearchRQ)
        val soapBody = SoapBody(searchFlight)
        val authenticationSoapHeader = AuthenticationSoapHeader()
        val soapHeader = SoapHeader(authenticationSoapHeader)
        val soapEnvelope = SoapEnvelope(soapHeader, soapBody)
        val searchRoundtripFlight = FlightRequest(soapEnvelope)
        val call : Call<MultiCityResponse> = service.multiCityFlightSearch(searchRoundtripFlight)
        call.enqueue(object : Callback<MultiCityResponse> {
            override fun onFailure(call: Call<MultiCityResponse>?, t: Throwable?) {
                apiCallbackFailure.onFailure(call,t)
            }
            override fun onResponse(call: Call<MultiCityResponse>?, response: retrofit2.Response<MultiCityResponse>?) {
                apiCallback.onSuccess(call, response)
            }

        })
    }
    private fun setClickListeners(inflater: LayoutInflater, container: ViewGroup?){
        radioMultyCity.setOnClickListener(View.OnClickListener {
            mainSearchButton.visibility = View.GONE
            returnDatePicker.visibility = View.INVISIBLE
            returnTextView.visibility = View.INVISIBLE
            addFirstLabel()
            addMultiCityView(inflater,container)
            radioMultyCity.isEnabled = false
        })
        radioOneWay.setOnClickListener(View.OnClickListener {
            mainSearchButton.visibility = View.VISIBLE
            returnTextView.visibility = View.INVISIBLE
            returnDatePicker.visibility = View.INVISIBLE
            elementsLinearLayout.removeView(firstLabel)
            multyCityLinearLayout.removeAllViews()
            mainLinearLayout.removeView(multyCityLinearLayout)
            mainLinearLayout.removeView(buttonLinearLayout)
            radioMultyCity.isEnabled = true
        })
        radioRoundTrip.setOnClickListener(View.OnClickListener {
            mainSearchButton.visibility = View.VISIBLE
            returnTextView.visibility = View.VISIBLE
            returnDatePicker.visibility = View.VISIBLE
            elementsLinearLayout.removeView(firstLabel)
            multyCityLinearLayout.removeAllViews()
            mainLinearLayout.removeView(multyCityLinearLayout)
            mainLinearLayout.removeView(buttonLinearLayout)
            radioMultyCity.isEnabled = true
        })
    }

    private fun addFirstLabel(){
        firstLabel.setText(R.string.firstFlight)
        firstLabel.setTextColor(resources.getColor(R.color.colorAccent))
        firstLabel.setBackgroundDrawable(resources.getDrawable(R.drawable.grey_round))
        firstLabel.setTextSize(TypedValue.COMPLEX_UNIT_PX,resources.getDimension(R.dimen.fontSize))
        firstLabel.gravity = Gravity.CENTER
        //firstLabel.layoutParams.height = 100
        firstLabel.setTypeface(null,Typeface.BOLD)
        elementsLinearLayout.addView(firstLabel)
    }

    private fun addMultiCityView(inflater: LayoutInflater, container: ViewGroup?){
        initMultiViews(inflater,container)
        multyCityLinearLayout.orientation = LinearLayout.VERTICAL
        multyCityLinearLayout.addView(secondFlightMultiCity)
        buttonLinearLayout.addView(addRemoveView)
        mainLinearLayout.addView(multyCityLinearLayout)
        mainLinearLayout.addView(buttonLinearLayout)
        addButton.setOnClickListener(View.OnClickListener {
            addMultiFlightView()
        })
        removeButton.setOnClickListener(View.OnClickListener {
            removeLastMultiFlightView()
        })

    }

    private fun initMultiViews(inflater: LayoutInflater, container: ViewGroup?){
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        val dialog:AlertDialog = initBuilder().create()
        dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        secondFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container,false)
        thirdFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container,false)
        forthFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container,false)
        fifthFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container, false)
        addRemoveView = inflater.inflate(R.layout.add_remove_buttons,container,false)
        Utils.datePicker(departDatePicker, context!!)
        Utils.datePicker(secondFlightMultiCity.multiDepartTime, context!!)
        Utils.datePicker(thirdFlightMultiCity.multiDepartTime, context!!)
        Utils.datePicker(forthFlightMultiCity.multiDepartTime, context!!)
        Utils.datePicker(fifthFlightMultiCity.multiDepartTime, context!!)
        secondMultiCityContent()
        addButton = addRemoveView.findViewById(R.id.addButton)
        removeButton = addRemoveView.findViewById(R.id.removeButton)
        searchMultiButton = addRemoveView.findViewById(R.id.searchButton)
        searchMultiButton.setOnClickListener(View.OnClickListener {

            var originDestinationInformation_ = OriginDestinationInformation_()
            val secondTimeFlight = secondFlightMultiCity.multiDepartTime.text.toString()
            val thirdTimeFlight = thirdFlightMultiCity.multiDepartTime.text.toString()


            if (departDatePicker.text.toString().trim().isNotEmpty()) {
                val originDestinationInformation = OriginDestinationInformation_(originLocation, destinationLocation, dateForm(departDatePicker.text.toString()))
                multiDestinationList.add(originDestinationInformation)
            }
            if (secondFlightMultiCity.multiFromEditText.text.toString().trim().isNotEmpty() && secondFlightMultiCity.multiToEditText.text.toString().trim().isNotEmpty() && secondFlightMultiCity.multiDepartTime.text.toString().trim().isNotEmpty()) {
                originDestinationInformation_ = OriginDestinationInformation_(secondOriginLocation, secondDestinationLocation, dateForm(secondTimeFlight))
                multiDestinationList.add(originDestinationInformation_)
            }
            if (thirdFlightMultiCity.multiFromEditText.text.toString().trim().isNotEmpty() && thirdFlightMultiCity.multiToEditText.text.toString().trim().isNotEmpty() && thirdTimeFlight.trim().isNotEmpty()) {
                originDestinationInformation_ = OriginDestinationInformation_(thirdOriginLocation, thirdDestinationLocation, dateForm(thirdTimeFlight))
                multiDestinationList.add(originDestinationInformation_)
            }
            if (validateFieldsMultiCity()){
                dialog.show()
                dialog.setCancelable(false)
                multiCityFlightSearch(service, object : Utils.Companion.MultiCityApiCallback {
                    override fun onSuccess(call: Call<MultiCityResponse>?, response: Response<MultiCityResponse>?) {
                        val bundle = Bundle()
                        val intent = Intent(context, FlightMultiCityActivity::class.java)
                        bundle.putParcelable("tickets", Utility.getTicketList(response!!.body()))
                        intent.putExtras(bundle)
                      //  multiDestinationList.clear()
                        dialog.hide()
                        Log.e("adsd","sdfdsfsd")
                        startActivity(intent)

                    }},object: Utils.Companion.MultiCityApiCallbackFailure{
                    override fun onFailure(call: Call<MultiCityResponse>?, t: Throwable?) {
                        Log.e("Message Error: ", t!!.message.toString())
                        dialog.hide()
                        Utils.toast(context!!, "Can't find available tickets")
                    }
                })

        }
        })
        secondFlightMultiCity.flightCountLabel.setText(R.string.secondFlight)
    }
    private fun addMultiFlightView(){
        if (clickCounter<3) {
            clickCounter++
            when(clickCounter){
                1-> {
                    multyCityLinearLayout.addView(thirdFlightMultiCity)
                    thirdFlightMultiCity.
                            flightCountLabel.setText(R.string.thirdFlight)
                }
                2-> {
                    multyCityLinearLayout.addView(forthFlightMultiCity)
                    forthFlightMultiCity.flightCountLabel.setText(R.string.forthFlight)
                }

                3-> {
                    multyCityLinearLayout.addView(fifthFlightMultiCity)
                    fifthFlightMultiCity.flightCountLabel.setText(R.string.fifthFlight)
                }
            }
        }

    }
    private fun removeLastMultiFlightView(){
        if(clickCounter>0){
            when(clickCounter){
                1-> multyCityLinearLayout.removeView(thirdFlightMultiCity)
                2-> multyCityLinearLayout.removeView(forthFlightMultiCity)
                3-> multyCityLinearLayout.removeView(fifthFlightMultiCity)
            }
            clickCounter--
        }
    }

    private fun secondMultiCityContent(){
        val textWatcher : TextWatcher = (object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
              //  autoMultiTextViewsInit()
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        val airportNames: ArrayList<AirportModel> = ArrayList()
        val airportCodes: ArrayList<String> = ArrayList()
        thirdFlightMultiCity.multiToEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Utils.getAirportsList(service, thirdFlightMultiCity.multiToEditText.text.toString(), object : Utils.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode, response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).airportname)
                        }
                        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        thirdFlightMultiCity.multiToEditText.setAdapter(adapter)

                        thirdFlightMultiCity.multiToEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(airportCodes[position])) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        thirdDestinationLocation = DestinationLocation(airportCodes[position], "true")
                                    } else {
                                        thirdDestinationLocation = DestinationLocation(airportCodes[position])
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                })
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        thirdFlightMultiCity.multiFromEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Utils.getAirportsList(service, thirdFlightMultiCity.multiFromEditText.text.toString(), object : Utils.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode, response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(response!!.body()!![i].airportCode)
                        }

                        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        thirdFlightMultiCity.multiFromEditText.setAdapter(adapter)
                        adapter.notifyDataSetChanged()

                        thirdFlightMultiCity.multiFromEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(airportCodes[position])) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        thirdOriginLocation = OriginLocation(airportCodes[position], "true")
                                    } else {
                                        thirdOriginLocation = OriginLocation(airportCodes[position])
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                })
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        secondFlightMultiCity.multiToEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Utils.getAirportsList(service, secondFlightMultiCity.multiToEditText.text.toString(), object : Utils.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode, response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).airportname)
                        }
                        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        adapter.notifyDataSetChanged()
                        secondFlightMultiCity.multiToEditText.setAdapter(adapter)

                        secondFlightMultiCity.multiToEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(airportCodes[position])) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        secondDestinationLocation = DestinationLocation(airportCodes[position], "true")
                                    } else {
                                        secondDestinationLocation = DestinationLocation(airportCodes[position])

                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                })
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        secondFlightMultiCity.multiFromEditText.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Utils.getAirportsList(service, secondFlightMultiCity.multiFromEditText.text.toString(), object : Utils.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()

                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode, response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).airportname)
                        }

                        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        adapter.notifyDataSetChanged()

                        secondFlightMultiCity.multiFromEditText.setAdapter(adapter)

                        secondFlightMultiCity.multiFromEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(airportCodes[position])) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        secondOriginLocation = OriginLocation(airportCodes[position], "true")
                                    } else {
                                        secondOriginLocation = OriginLocation(airportCodes[position])
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                })
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
    }





    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
                FlightFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}

private operator fun ViewGroup.LayoutParams.invoke(params: LinearLayout.LayoutParams) {

}
