package crocusoft.com.gez.services

import crocusoft.com.gez.models.AirportSearchModel
import crocusoft.com.gez.pojo.request.bookFlight.BookFlightRequest
import crocusoft.com.gez.pojo.request.searchRoundtripFlight.FlightRequest
import crocusoft.com.gez.pojo.request.searchOnewayFlight.Request
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun roundTripFlightSearch(@Body flightRequest: FlightRequest): Call<RoundtripResponse>

    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun oneWayFlightSearch(@Body oneWayRequest: Request): Call<Response>

    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun bookFlightRequest(@Body bookFlightRequest: BookFlightRequest): Call<ResponseBody>

    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun multiCityFlightSearch(@Body multiCityFlightSearch: FlightRequest): Call<MultiCityResponse>

    @GET("/api/GetAirports")
    @Headers("Accept:application/json")
    fun getAirportsList(@Query("search") keyword: String): Call<List<AirportSearchModel>>



}