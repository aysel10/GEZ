package crocusoft.com.gez.util

import android.app.DatePickerDialog
import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import crocusoft.com.gez.adapters.FlightTicketsAdapter
import crocusoft.com.gez.pojo.request.searchRoundtripFlight.*
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


class Utils {

    companion object {
        fun changeFragment(fragmentManager: android.support.v4.app.FragmentManager, fragmentPlaceHolder: Int, fragment: Fragment) {
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(fragmentPlaceHolder, fragment)
            transaction.commit()

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

                override fun onResponse(call: Call<Response>?,
                                        response: retrofit2.Response<Response>?) {
                    Log.e("success","FUCK YOU")

//                    flightTicketsAdapter!!.addViewModel(ticketDataViewModel!!)
//                    flightTicketsAdapter.notifyDataSetChanged()
                }
            })

//            return flightTicketsAdapter
        }



        fun roundTripFlightSearch(service:RetrofitService):FlightTicketsAdapter{
            val originLocation = OriginLocation("GYD")
            val destinationLocation = DestinationLocation("IST", "true")
            val newOriginLocation = OriginLocation("IST", "true")
            val newDestinationLocation = DestinationLocation("BAK", "true")
            val originLocationInformation = OriginDestinationInformation_(originLocation,
                    destinationLocation,"2018-05-25T12:00:00")
            val originDestinationInformation = OriginDestinationInformation_(newOriginLocation,
                    newDestinationLocation, "2018-05-26T12:00:00")
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

            val flightTicketsAdapter = FlightTicketsAdapter()
            val call : Call<RoundtripResponse> = service.roundTripFlightSearch(searchRoundtripFlight)

            call.enqueue(object :Callback<RoundtripResponse>{
                override fun onFailure(call: Call<RoundtripResponse>?, t: Throwable?) {
                    Log.e("ERROR",t!!.message)
                }

                override fun onResponse(call: Call<RoundtripResponse>?, response: retrofit2.Response<RoundtripResponse>?) {


                    val ticketDataViewModel: TicketDataViewModel = Utility.getTicketList(response!!.body())
                    flightTicketsAdapter
                            .addViewModel(ticketDataViewModel)
                    flightTicketsAdapter.notifyDataSetChanged()
                }
            })

            return flightTicketsAdapter

        }





        fun toast(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_LONG)
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


