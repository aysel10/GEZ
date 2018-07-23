package crocusoft.com.gez.fragments

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v4.widget.NestedScrollView
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.*
import com.google.gson.Gson
import crocusoft.com.gez.R
import crocusoft.com.gez.activities.FlightMultiCityActivity
import crocusoft.com.gez.activities.FlightOneWayActivity
import crocusoft.com.gez.services.RetrofitManager
import crocusoft.com.gez.activities.FlightTicketsActivity
import crocusoft.com.gez.database.AppDatabase
import crocusoft.com.gez.database.DBWorkerThread
import crocusoft.com.gez.models.AirportModel
import crocusoft.com.gez.models.AirportSearchModel
import crocusoft.com.gez.pojo.request.searchRoundtripFlight.*
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService
import crocusoft.com.gez.util.AppSharedPreferences
import crocusoft.com.gez.flight_view_model.TicketModelManager
import kotlinx.android.synthetic.main.flight_multy_city.view.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
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

    private lateinit var mDbWorkerThread: DBWorkerThread
    private var mDb: AppDatabase? = null

    private val mUiHandler = Handler()

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
        RetrofitManager.datePicker(departDatePicker, context!!)
        RetrofitManager.datePicker(returnDatePicker, context!!)
        val myPreferences = AppSharedPreferences(context!!)
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        airportImagesVerification(service)
        val airportNames: ArrayList<AirportModel> = ArrayList()
        val airportCodes: ArrayList<String> = ArrayList()
        setClickListeners(inflater,container)
        var adapter: ArrayAdapter<String> = ArrayAdapter(context,android.R.layout.simple_dropdown_item_1line)
        fromAutoComplete.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(fromAutoComplete.text.isNotEmpty()){
                    originLocation = OriginLocation(fromAutoComplete.text.toString(),"true")
                    oneWayOriginLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation(fromAutoComplete.text.toString(),"true")
                }
                RetrofitManager.getAirportsList(service,fromAutoComplete.text.toString(),object: RetrofitManager.Companion.AirportListApiCallback{
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for(i in 0..response!!.body()!!.size-1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].airportName,response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).cityName + " (" + airportNames.get(i).airportname + ")")
                        }
                        if(context!=null) {
                            adapter  = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                            adapter.notifyDataSetChanged()
                            fromAutoComplete.setAdapter(adapter)
                        }
                        fromAutoComplete.onItemClickListener = AdapterView.OnItemClickListener {
                            parent, view, position, id ->
                            val name = airportCodes[position].substring(airportCodes[position].indexOf("(")+1,airportCodes[position].indexOf(")"))
                            fromAutoComplete.setText(name)
                            fromAutoComplete.setSelection(fromAutoComplete.text.length)
                            for(i in 0..airportNames.size-1) {
                                if(airportNames[i].airportname.equals(name)){
                                    isCity = airportNames[i].isCity
                                    code = airportCodes[position]
                                    if(isCity) {
                                        originLocation = OriginLocation(name,"true")
                                        oneWayOriginLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation(name,"true")
                                    }else{
                                        originLocation = OriginLocation(name)
                                        oneWayOriginLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation(name)
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                }, RetrofitManager.getHeader(myPreferences))
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
       toAutoComplete.addTextChangedListener(object: TextWatcher{
           override fun afterTextChanged(s: Editable?) {
               if(toAutoComplete.text.isNotEmpty()){
                   destinationLocation = DestinationLocation(toAutoComplete.text.toString(),"true")
                   oneWayDestination = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation(toAutoComplete.text.toString(),"true")
               }
               RetrofitManager.getAirportsList(service,toAutoComplete.text.toString(),object: RetrofitManager.Companion.AirportListApiCallback{
                   override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                       airportNames.clear()
                       airportCodes.clear()
                       for(i in 0..response!!.body()!!.size-1) {
                           val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].airportName,response!!.body()!![i].isIsCity)
                           airportNames.add(airportModel)
                           airportCodes.add(airportNames.get(i).cityName + " (" + airportNames.get(i).airportname + ")")
                       }
                       if(context!=null) {
                           adapter = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                           adapter.notifyDataSetChanged()
                           toAutoComplete.setAdapter(adapter)

                       }
                       toAutoComplete.onItemClickListener = AdapterView.OnItemClickListener{
                           parent, view, position, id ->
                           val name = airportCodes[position].substring(airportCodes[position].indexOf("(")+1,airportCodes[position].indexOf(")"))
                           toAutoComplete.setText(name)
                           toAutoComplete.setSelection(toAutoComplete.text.length)
                           for(i in 0..airportNames.size-1) {
                               if(airportNames[i].airportname.equals(name)){
                                    isCity = airportNames[i].isCity
                                   if(isCity) {
                                       destinationLocation = DestinationLocation(name,"true")
                                       oneWayDestination = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation(name,"true")
                                   }else{
                                        destinationLocation = DestinationLocation(name)
                                        oneWayDestination = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation(name)
                                   }
                               }
                           }
                       }
                       adapter.notifyDataSetChanged()
                   }
               }, RetrofitManager.getHeader(myPreferences))
           }
           override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
           }
           override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
           }
       })

        mainSearchButton.setOnClickListener(View.OnClickListener {
            if(radioRoundTrip.isChecked) {
                if(validateFieldsRoundTrip()) {
                    closeKeyboard()
                    dialog.show()
                    dialog.setCancelable(false)
                    roundTripFlightSearch(service, object : RetrofitManager.Companion.ApiCallback {
                        override fun onSuccess(call: Call<RoundtripResponse>?, response: Response<RoundtripResponse>?) {
                            val bundle = Bundle()
                            val intent = Intent(context, FlightTicketsActivity::class.java)
                            doAsync {
                              val fd: Gson = Gson()
                                val ticketsJSON = fd.toJson(TicketModelManager.getTicketList(response!!.body()))
                                var y = TicketModelManager.getTicketList(response!!.body())
                                bundle.putString("flightTickets", ticketsJSON)
                                myPreferences.putString("roundtripModel",ticketsJSON)
                                uiThread {
                                    dialog.dismiss()
                                    intent.putExtras(bundle)
                                    startActivity(intent)
                                }
                            }
                        }} , object: RetrofitManager.Companion.ApiCallbackFailure {
                        override fun onFailre(call: Call<RoundtripResponse>?, t: Throwable?) {
                            dialog.hide()
                            Log.e("ef",t!!.message.toString())
                            RetrofitManager.toast(context!!, "Can't find available tickets")
                        }
                    })

                }
            }else if(radioOneWay.isChecked){
                if(validateFieldsOneWay()){
                    closeKeyboard()
//                    dialog.show()
//                    dialog.setCancelable(false)
//                    oneWayFlightSearch(service, object : RetrofitManager.Companion.OneWayApiCallback {
//                        override fun onSuccess(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, response: Response<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?) {
                            val bundle = Bundle()
                            val intent = Intent(context, FlightOneWayActivity::class.java)
//                            doAsync {
                                bundleForOneWay(bundle)
////                                val fd: Gson = Gson()
////                                val objectDest = fd.toJson(TicketModelManager.getTicketList(response!!.body()))
////                                myPreferences.putString("tickets",objectDest)
//                                uiThread {
//                                   // dialog.dismiss()
                                    intent.putExtras(bundle)
                                    startActivity(intent)
//                                }
//                            }
                         //   bundle.putString("jsonTicket", objectDest)

//                        }}, object: RetrofitManager.Companion.OneWayApiCallbackFailure{
//                        override fun onFailure(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, t: Throwable?) {
//                            Log.e("ef",t!!.message.toString())
//                            dialog.dismiss()
//                            RetrofitManager.toast(context!!, "Can't find available tickets")
//                        }
//                    })
                }
            }else if(radioMultyCity.isChecked){
                secondMultiCityContent()
            }
        })
    }
    private fun bundleForOneWay(bundle: Bundle){
        bundle.putParcelable("destination",oneWayDestination)
        bundle.putParcelable("locatoon",oneWayOriginLocation)
        bundle.putString("departTime",dateForm(departDatePicker.text.toString()))
    }
    private fun dateForm(dateString: String):String{
        val datePatternForParse = SimpleDateFormat("dd.MM.yyyy",Locale.US)
        val date: Date = datePatternForParse.parse(dateString)
        val newPattern = SimpleDateFormat("yyyy-MM-dd",Locale.US)
        return newPattern.format(date)
    }


    fun hideKeyboardFrom(context: Context, view: View) {
        val imm = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
    fun hideSoftKeyboard(activity: Activity) {
        val inputMethodManager = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager!!.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
    }

    private fun closeKeyboard() {
        val inputManager = activity!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(activity!!.currentFocus!!.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)

    }
    private fun initBuilder():AlertDialog.Builder {
        val builder = AlertDialog.Builder(context)
        val view:View = getLayoutInflater().inflate(R.layout.progress,null);
        builder.setView(view)
        //val dialog = builder.create()
        return builder
    }
    private fun validateFieldsOneWay():Boolean{
        if(fromAutoComplete.text.isEmpty()){
            RetrofitManager.toast(this!!.context!!,"Choose your location")
            return false
        }
        if(toAutoComplete.text.trim().isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose destination location")
            return false
        }
        if(departDatePicker.text.trim().isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose depart time")
            return false
        }
        if(adultCountPicker.count==0){
            RetrofitManager.toast(this.context!!,"Choose adult count")
            return false
        }
        return true
    }
    private fun isCorrectDates(depart: String, arrive: String): Boolean {
        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.US)
        val departDate: Date = dateFormat.parse(depart)
        val arriveDate: Date = dateFormat.parse(arrive)
        if(departDate.after(arriveDate)) {
            RetrofitManager.toast(context!!,"Return date must be after depart")
            return true
        }
        return false
    }
    private fun validateFieldsRoundTrip():Boolean{
        if(fromAutoComplete.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose your location")
            return false
        }
        if(toAutoComplete.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose destination location")
            return false
        }
        if(departDatePicker.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose depart time")
            return false
        }
        if(returnDatePicker.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose return time")
            return false
        }
        if(adultCountPicker.count==0){
            RetrofitManager.toast(this.context!!,"Choose adult count")
            return false
        }
        if(isCorrectDates(departDatePicker.text.toString(),returnDatePicker.text.toString())){
            return false
        }

        return true
    }
    private fun validateFieldsMultiCity():Boolean{
        if(fromAutoComplete.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose your location")
            return false
        }
        if(toAutoComplete.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose destination location")
            return false
        }
        if(departDatePicker.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose depart time")
            return false
        }
        if(adultCountPicker.count==0){
            RetrofitManager.toast(this.context!!,"Choose adult count")
            return false
        }
        if(secondFlightMultiCity.multiFromEditText.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose second location")
            return false
        }
        if(secondFlightMultiCity.multiToEditText.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose second destination")
            return false
        }
        if(secondFlightMultiCity.multiDepartTime.text.isEmpty()){
            RetrofitManager.toast(this.context!!,"Choose second time")
            return false
        }
        return true
    }
    private fun roundTripFlightSearch(service:RetrofitService, apiCallback: RetrofitManager.Companion.ApiCallback, apiCallbackFailure: RetrofitManager.Companion.ApiCallbackFailure){
        val myPreferences = AppSharedPreferences(context!!)
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
        val call : Call<RoundtripResponse> = service.roundTripFlightSearch(searchRoundtripFlight, RetrofitManager.getHeader(myPreferences))
        call.enqueue(object : Callback<RoundtripResponse> {
            override fun onFailure(call: Call<RoundtripResponse>?, t: Throwable?) {
                apiCallbackFailure.onFailre(call,t)
            }
            override fun onResponse(call: Call<RoundtripResponse>?, response: retrofit2.Response<RoundtripResponse>?) {
                apiCallback.onSuccess(call, response)
            }
        })
    }

    fun Context.isConnectedToInternet(): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val activeNetwork = cm.activeNetworkInfo

        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }

    private fun oneWayFlightSearch(service: RetrofitService, apiCallback: RetrofitManager.Companion.OneWayApiCallback, apiOneWayCallbackFailure: RetrofitManager.Companion.OneWayApiCallbackFailure){
        val myPreferences = AppSharedPreferences(context!!)
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

        val call : Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response> =
                service.oneWayFlightSearch(searchOneWay, RetrofitManager.getHeader(myPreferences))

        call.enqueue(object :Callback<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>{
            override fun onFailure(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, t: Throwable?) {
                apiOneWayCallbackFailure.onFailure(call,t)
            }
            override fun onResponse(call: Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?, response: retrofit2.Response<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response>?) {
                apiCallback.onSuccess(call,response)
            }
        })
    }

    private fun multiCityFlightSearch(service:RetrofitService, apiCallback: RetrofitManager.Companion.MultiCityApiCallback, apiCallbackFailure: RetrofitManager.Companion.MultiCityApiCallbackFailure){
        val myPreferences = AppSharedPreferences(context!!)
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
        val call : Call<MultiCityResponse> = service.multiCityFlightSearch(searchRoundtripFlight, RetrofitManager.getHeader(myPreferences))
        call.enqueue(object : Callback<MultiCityResponse> {
            override fun onFailure(call: Call<MultiCityResponse>?, t: Throwable?) {
                apiCallbackFailure.onFailure(call,t)
                multiDestinationList.clear()
            }
            override fun onResponse(call: Call<MultiCityResponse>?, response: retrofit2.Response<MultiCityResponse>?) {
                apiCallback.onSuccess(call, response)
                multiDestinationList.clear()
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
        firstLabel.setBackgroundDrawable(resources.getDrawable(R.drawable.back_dark_gray))
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
        RetrofitManager.datePicker(departDatePicker, context!!)
        RetrofitManager.datePicker(secondFlightMultiCity.multiDepartTime, context!!)
        RetrofitManager.datePicker(thirdFlightMultiCity.multiDepartTime, context!!)
        RetrofitManager.datePicker(forthFlightMultiCity.multiDepartTime, context!!)
        RetrofitManager.datePicker(fifthFlightMultiCity.multiDepartTime, context!!)
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
                closeKeyboard()
                dialog.show()
                dialog.setCancelable(false)
                multiCityFlightSearch(service, object : RetrofitManager.Companion.MultiCityApiCallback {
                    override fun onSuccess(call: Call<MultiCityResponse>?, response: Response<MultiCityResponse>?) {
                        val bundle = Bundle()
                        val intent = Intent(context, FlightMultiCityActivity::class.java)
                        doAsync {
                            val gson=Gson()
                            multiDestinationList.clear()
                            bundle.putString("tickets",gson.toJson(TicketModelManager.getTicketList(response!!.body())))
                            uiThread {
                                intent.putExtras(bundle)
                                dialog.dismiss()
                                startActivity(intent)
                            }
                        }

                    }},object: RetrofitManager.Companion.MultiCityApiCallbackFailure{
                    override fun onFailure(call: Call<MultiCityResponse>?, t: Throwable?) {
                        Log.e("Message Error: ", t!!.message.toString())
                        dialog.hide()
                        RetrofitManager.toast(context!!, "Can't find available tickets")
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
        val myPreferences = AppSharedPreferences(context!!)
        val textWatcher : TextWatcher = (object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
              //  autoMultiTextViewsInit()
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        var adapter: ArrayAdapter<String> = ArrayAdapter(context,android.R.layout.simple_dropdown_item_1line)
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        val airportNames: ArrayList<AirportModel> = ArrayList()
        val airportCodes: ArrayList<String> = ArrayList()
        thirdFlightMultiCity.multiToEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(thirdFlightMultiCity.multiToEditText.text.isNotEmpty()){
                    thirdDestinationLocation = DestinationLocation(thirdFlightMultiCity.multiToEditText.text.toString(), "true")
                }
                RetrofitManager.getAirportsList(service, thirdFlightMultiCity.multiToEditText.text.toString(), object : RetrofitManager.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].airportName,response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).cityName + " (" + airportNames.get(i).airportname + ")")
                        }
                        if(context!=null) {
                            adapter= ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        }
                        thirdFlightMultiCity.multiToEditText.setAdapter(adapter)

                        thirdFlightMultiCity.multiToEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            val name = airportCodes[position].substring(airportCodes[position].indexOf("(")+1,airportCodes[position].indexOf(")"))
                            thirdFlightMultiCity.multiToEditText.setText(name)
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(name)) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        thirdDestinationLocation = DestinationLocation(name, "true")
                                    } else {
                                        thirdDestinationLocation = DestinationLocation(name)
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                }, RetrofitManager.getHeader(myPreferences))
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        thirdFlightMultiCity.multiFromEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(thirdFlightMultiCity.multiFromEditText.text.isNotEmpty()){
                    thirdOriginLocation = OriginLocation(thirdFlightMultiCity.multiFromEditText.text.toString(), "true")
                }
                RetrofitManager.getAirportsList(service, thirdFlightMultiCity.multiFromEditText.text.toString(), object : RetrofitManager.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].airportName,response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).cityName + " (" + airportNames.get(i).airportname + ")")
                        }
                        if(context!=null) {
                            adapter= ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        }
                        thirdFlightMultiCity.multiFromEditText.setAdapter(adapter)
                        adapter.notifyDataSetChanged()

                        thirdFlightMultiCity.multiFromEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            val name = airportCodes[position].substring(airportCodes[position].indexOf("(")+1,airportCodes[position].indexOf(")"))
                            thirdFlightMultiCity.multiFromEditText.setText(name)
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(name)) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        thirdOriginLocation = OriginLocation(name, "true")
                                    } else {
                                        thirdOriginLocation = OriginLocation(name)
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                }, RetrofitManager.getHeader(myPreferences))
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        secondFlightMultiCity.multiToEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(secondFlightMultiCity.multiToEditText.text.isNotEmpty()){
                    secondDestinationLocation = DestinationLocation(secondFlightMultiCity.multiToEditText.text.toString(),"true")
                }
                RetrofitManager.getAirportsList(service, secondFlightMultiCity.multiToEditText.text.toString(), object : RetrofitManager.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()
                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].airportName,response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                            airportCodes.add(airportNames.get(i).cityName + " (" + airportNames.get(i).airportname + ")")
                        }
                        if(context!=null) {
                            adapter= ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        }
                        adapter.notifyDataSetChanged()
                        secondFlightMultiCity.multiToEditText.setAdapter(adapter)

                        secondFlightMultiCity.multiToEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            val name = airportCodes[position].substring(airportCodes[position].indexOf("(")+1,airportCodes[position].indexOf(")"))
                            secondFlightMultiCity.multiToEditText.setText(name)
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(name)) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        secondDestinationLocation = DestinationLocation(name, "true")
                                    } else {
                                        secondDestinationLocation = DestinationLocation(name)

                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                }, RetrofitManager.getHeader(myPreferences))
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        })
        secondFlightMultiCity.multiFromEditText.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(secondFlightMultiCity.multiFromEditText.text.isNotEmpty()){
                    secondOriginLocation = OriginLocation(secondFlightMultiCity.multiFromEditText.text.toString(), "true")
                }
                RetrofitManager.getAirportsList(service, secondFlightMultiCity.multiFromEditText.text.toString(), object : RetrofitManager.Companion.AirportListApiCallback {
                    override fun onSuccess(call: Call<List<AirportSearchModel>>?, response: Response<List<AirportSearchModel>>?) {
                        airportNames.clear()
                        airportCodes.clear()

                        for (i in 0..response!!.body()!!.size - 1) {
                            val airportModel = AirportModel(response!!.body()!![i].airportCode,response!!.body()!![i].airportName,response!!.body()!![i].isIsCity)
                            airportNames.add(airportModel)
                                airportCodes.add(airportNames.get(i).cityName + " (" + airportNames.get(i).airportname + ")")
                              }
                        if(context!=null) {
                             adapter = ArrayAdapter<String>(context, android.R.layout.simple_dropdown_item_1line, airportCodes)
                        }
                        adapter.notifyDataSetChanged()

                        secondFlightMultiCity.multiFromEditText.setAdapter(adapter)

                        secondFlightMultiCity.multiFromEditText.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
                            val name = airportCodes[position].substring(airportCodes[position].indexOf("(")+1,airportCodes[position].indexOf(")"))
                            secondFlightMultiCity.multiFromEditText.setText(name)
                            for (i in 0..airportNames.size - 1) {
                                if (airportNames[i].airportname.equals(name)) {
                                    isCity = airportNames[i].isCity
                                    if (isCity) {
                                        secondOriginLocation = OriginLocation(name, "true")
                                    } else {
                                        secondOriginLocation = OriginLocation(name)
                                    }
                                }
                            }
                        }
                        adapter.notifyDataSetChanged()
                    }
                }, RetrofitManager.getHeader(myPreferences))
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


    private fun airportImagesVerification(service: RetrofitService) {
        val myPreferences = AppSharedPreferences(context!!)
        val db: AppDatabase? = AppDatabase.getInstance(context!!)
        // if database if already filled
            // DO NOTHING

        // IF NOT -> populate DB from REST
        doAsync {
            var getImagesFromDB: List<AirportImageResponse> = db!!.imagesDataDAO().fetchAllImages()
            if(getImagesFromDB.isEmpty()) {
                val call : Call<List<AirportImageResponse>> = service
                        .getAirportImageAndName(RetrofitManager.getHeader(myPreferences))
                call.enqueue(object: Callback<List<AirportImageResponse>> {
                    override fun onFailure(call: Call<List<AirportImageResponse>>?, t: Throwable?) {
                        Log.e("fail", t!!.message)
                    }

                    override fun onResponse(call: Call<List<AirportImageResponse>>?, response: Response<List<AirportImageResponse>>?) {
                        Log.e("ura", response!!.message())
                        doAsync {
                            db!!.clearAllTables()
                            db!!.imagesDataDAO().insertAllImages(response.body()!!)
                        }
                    }
                })
            }
        }
    }


}

private operator fun ViewGroup.LayoutParams.invoke(params: LinearLayout.LayoutParams) {

}



































































//boom!