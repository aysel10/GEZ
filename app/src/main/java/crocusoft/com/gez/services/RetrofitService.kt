package crocusoft.com.gez.services

import crocusoft.com.gez.pojo.request.searchOnewayFlight.OneWayRequest
import crocusoft.com.gez.pojo.request.defaultFlight.FlightRequest
import crocusoft.com.gez.pojo.response.flight.defaultFlight.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitService {
    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun roundTripFlightSearch(@Body flightRequest: FlightRequest): Call<Response>

    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun oneWayFlightSearch(@Body oneWayRequest: OneWayRequest): Call<Response>

}