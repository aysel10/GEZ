package crocusoft.com.gez.services

import crocusoft.com.gez.pojo.request.searchRoundtripFlight.FlightRequest
import crocusoft.com.gez.pojo.request.searchOnewayFlight.Request
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitService {
    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun roundTripFlightSearch(@Body flightRequest: FlightRequest): Call<RoundtripResponse>

    @POST("/api/Converter")
    @Headers("Accept:application/json")
    fun oneWayFlightSearch(@Body oneWayRequest: Request): Call<Response>

}