package crocusoft.com.gez.util

import android.app.DatePickerDialog
import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import crocusoft.com.gez.adapters.FlightRoundtripTicketsAdapter
import crocusoft.com.gez.models.AirportSearchModel
import crocusoft.com.gez.pojo.request.searchRoundtripFlight.*
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse
import crocusoft.com.gez.services.RetrofitService
//хахахахха

import retrofit2.Call
import retrofit2.Callback
import java.util.ArrayList
import java.text.SimpleDateFormat
import java.util.*
import crocusoft.com.gez.view_model.TicketDataViewModel
import okhttp3.ResponseBody


class Utils {

    companion object {
        fun changeFragment(fragmentManager: android.support.v4.app.FragmentManager, fragmentPlaceHolder: Int, fragment: Fragment) {
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(fragmentPlaceHolder, fragment)
            transaction.commit()

        }

        interface ApiCallback {
            fun onSuccess(call: Call<RoundtripResponse>?,
                          response: retrofit2.Response<RoundtripResponse>?)
        }

        interface ApiCallbackFailure {
            fun onFailre(call: Call<RoundtripResponse>?, t: Throwable?)
        }
        interface OneWayApiCallback {
            fun onSuccess(call: Call<Response>?,
                          response: retrofit2.Response<Response>?)
        }
        interface OneWayApiCallbackFailure {
            fun onFailure(call: Call<Response>?, t: Throwable?)
        }
        interface MultiCityApiCallback {
            fun onSuccess(call: Call<MultiCityResponse>?,
                          response: retrofit2.Response<MultiCityResponse>?)
        }

        interface MultiCityApiCallbackFailure {
            fun onFailure(call: Call<MultiCityResponse>?, t: Throwable?)
        }
        interface AirportListApiCallback {
            fun onSuccess(call: Call<List<AirportSearchModel>>?,
                          response: retrofit2.Response<List<AirportSearchModel>>?)
        }



        fun getAirportsList(service: RetrofitService,keyword : String,airportListApiCallback: AirportListApiCallback):List<AirportSearchModel> {
            val airportsList : List<AirportSearchModel> = ArrayList()
            val call : Call<List<AirportSearchModel>> = service.getAirportsList(keyword)
            call.enqueue(object :Callback<List<AirportSearchModel>>{
                override fun onFailure(call: Call<List<AirportSearchModel>>?, t: Throwable?) {
                    Log.e("error",t!!.message.toString())
                }
                override fun onResponse(call: Call<List<AirportSearchModel>>?, response: retrofit2.Response<List<AirportSearchModel>>?) {
                   airportListApiCallback.onSuccess(call,response)
                }
            })
            return airportsList
        }


        fun oneWayFlightSearch(service: RetrofitService){

            val originLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation("BAK","true")
            val destinationLocation = crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation("IST", "true")

            val originLocationInformation = crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginDestinationInformation(originLocation,
                    "2018-05-25T12:00:00", destinationLocation)
            val passengerTypeQuantity = crocusoft.com.gez.pojo.request.searchOnewayFlight.PassengerTypeQuantity("ADT")
            val airTravelerAvail = crocusoft.com.gez.pojo.request.searchOnewayFlight.AirTravelerAvail(passengerTypeQuantity)
            val travelerInfoSummary = crocusoft.com.gez.pojo.request.searchOnewayFlight.TravelerInfoSummary(airTravelerAvail)
            val otaAirLowFareSearchRQ = crocusoft.com.gez.pojo.request.searchOnewayFlight.OTAAirLowFareSearchRQ(originLocationInformation, travelerInfoSummary)
            val searchFlight = crocusoft.com.gez.pojo.request.searchOnewayFlight.SearchFlight(otaAirLowFareSearchRQ)
            val soapBody = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapBody(searchFlight)
            val authenticationSoapHeader = crocusoft.com.gez.pojo.request.searchOnewayFlight.AuthenticationSoapHeader()
            val soapHeader = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapHeader(authenticationSoapHeader)
            val soapEnvelope = crocusoft.com.gez.pojo.request.searchOnewayFlight.SoapEnvelope(soapHeader,soapBody)
            var searchOneWay = crocusoft.com.gez.pojo.request.searchOnewayFlight.Request(soapEnvelope)

            val call : Call<Response> = service.oneWayFlightSearch(searchOneWay)

            call.enqueue(object :Callback<Response>{
                override fun onFailure(call: Call<Response>?, t: Throwable?) {
                    Log.e("ERROR",t!!.message)
                }
                override fun onResponse(call: Call<Response>?, response: retrofit2.Response<Response>?) {

                }
            })
        }

        fun rroundTripFlightSearch(service:RetrofitService, apiCallback: ApiCallback){
            val originLocation = OriginLocation("GYD")
            val destinationLocation = DestinationLocation("IST", "true")
            val newOriginLocation = OriginLocation("IST", "true")
            val newDestinationLocation = DestinationLocation("BAK", "true")
            val originLocationInformation = OriginDestinationInformation_(originLocation,
                    destinationLocation,"2018-05-28T12:00:00")
            val originDestinationInformation = OriginDestinationInformation_(newOriginLocation,
                    newDestinationLocation, "2018-05-29T12:00:00")
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
            call.enqueue(object :Callback<RoundtripResponse>{
                override fun onFailure(call: Call<RoundtripResponse>?, t: Throwable?) {
                    Log.e("ERROR",t!!.message)
                }
                override fun onResponse(call: Call<RoundtripResponse>?, response: retrofit2.Response<RoundtripResponse>?) {
                    apiCallback.onSuccess(call, response)
                }

            })
        }

        fun roundTripFlightSearch(service:RetrofitService):FlightRoundtripTicketsAdapter{
            val originLocation = OriginLocation("GYD")
            val destinationLocation = DestinationLocation("IST", "true")
            val newOriginLocation = OriginLocation("IST", "true")
            val newDestinationLocation = DestinationLocation("BAK", "true")
            val originLocationInformation = OriginDestinationInformation_(originLocation,
                    destinationLocation,"2018-05-28T12:00:00")
            val originDestinationInformation = OriginDestinationInformation_(newOriginLocation,
                    newDestinationLocation, "2018-05-29T12:00:00")
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

            val flightTicketsAdapter = FlightRoundtripTicketsAdapter()
            val call : Call<RoundtripResponse> = service.roundTripFlightSearch(searchRoundtripFlight)

            call.enqueue(object :Callback<RoundtripResponse>{
                override fun onFailure(call: Call<RoundtripResponse>?, t: Throwable?) {
                    Log.e("ERROR",t!!.message)
                }

                override fun onResponse(call: Call<RoundtripResponse>?, response: retrofit2.Response<RoundtripResponse>?) {

                    var comb = response!!.body()!!.soapEnvelope.soapBody.searchFlightResponse.otaAirLowFareSearchRS.pricedItineraries.pricedItinerary[0].airItinerary.originDestinationCombinations.originDestinationCombination
                  //  Log.e("comb",comb.toString())


                    val ticketDataViewModel: TicketDataViewModel = Utility.getTicketList(response!!.body())
                    flightTicketsAdapter
                            .addViewModel(ticketDataViewModel)

                    flightTicketsAdapter.notifyDataSetChanged()
                }
            })

            return flightTicketsAdapter

        }







        fun toast(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_LONG).show()
        }

        fun datePicker(textview: TextView, context: Context) {
            var cal = Calendar.getInstance()

            val dateSetListener = DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val myFormat = "dd.MM.yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                textview.text = sdf.format(cal.time)

            }


            textview.setOnClickListener {
                DatePickerDialog(context, dateSetListener,
                        cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH),
                        cal.get(Calendar.DAY_OF_MONTH)).show() }

        }

    }
}


