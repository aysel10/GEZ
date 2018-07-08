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
import kotlin.collections.HashMap


class RetrofotManager {

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
        interface BookFlightCallback {
            fun onSuccess(call: Call<ResponseBody>?,
                          response: retrofit2.Response<ResponseBody>?)
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

        fun getAirportsList(service: RetrofitService,keyword : String,
                            airportListApiCallback: AirportListApiCallback,
                            header: HashMap<String, String>):List<AirportSearchModel> {
            val airportsList : List<AirportSearchModel> = ArrayList()
            val call : Call<List<AirportSearchModel>> = service.getAirportsList(keyword, header)
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


        fun getHeader(myPreferences: AppSharedPreferences): HashMap<String, String> {
            var hederMap: HashMap<String, String> = HashMap()
            hederMap["Authorization"] = "Basic ${myPreferences.getString("token").trim()}"
            hederMap["Content-Type"] = "application/json"
            return hederMap
        }
    }

}


