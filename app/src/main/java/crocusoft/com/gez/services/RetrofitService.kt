package crocusoft.com.gez.services

import crocusoft.com.gez.database.AirportDataBaseModel
import crocusoft.com.gez.models.AirportSearchModel
import crocusoft.com.gez.pojo.request.bookFlight.BookFlightRequest
import crocusoft.com.gez.pojo.request.searchRoundtripFlight.FlightRequest
import crocusoft.com.gez.pojo.request.searchOnewayFlight.Request
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    @POST("/SearchBookCreate")
    //@Headers("Accept:application/json")
    fun roundTripFlightSearch(@Body flightRequest: FlightRequest,
                              @HeaderMap headers: Map<String, String>): Call<RoundtripResponse>

    @POST("/SearchBookCreate")
    //@Headers("Accept:application/json")
    fun oneWayFlightSearch(@Body oneWayRequest: Request,
                           @HeaderMap headers: Map<String, String>): Call<Response>

    @POST("/SearchBookCreate")
    //@Headers("Accept:application/json")
    fun bookFlightRequest(@Body bookFlightRequest: BookFlightRequest,
                          @HeaderMap headers: Map<String, String>): Call<ResponseBody>

    @POST("/SearchBookCreate")
    //@Headers("Accept:application/json")
    fun multiCityFlightSearch(@Body multiCityFlightSearch: FlightRequest,
                              @HeaderMap headers: Map<String, String>): Call<MultiCityResponse>

    //http://88.99.186.108:8888/api/FlightOperationsForMobile/GetAirportnames?search=a
    @GET("/GetAirportnames")
    //@Headers("Accept:application/json")
    fun getAirportsList(@Query("search") keyword: String,
                        @HeaderMap headers: Map<String, String>): Call<List<AirportSearchModel>>

    @GET("/GetAirlineImageNames")
    //@Headers("Accept:application/json", "Authorization: Basic {token}")
    fun getAirportImageAndName(@HeaderMap headers: Map<String, String>): Call<List<AirportImageResponse>>

}