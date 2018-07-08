package crocusoft.com.gez.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u00052\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'J4\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00112\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'J.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00112\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\'\u00a8\u0006\u0019"}, d2 = {"Lcrocusoft/com/gez/services/RetrofitService;", "", "bookFlightRequest", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "Lcrocusoft/com/gez/pojo/request/bookFlight/BookFlightRequest;", "headers", "", "", "getAirportImageAndName", "", "Lcrocusoft/com/gez/pojo/response/flight/AirportImageResponse;", "getAirportsList", "Lcrocusoft/com/gez/models/AirportSearchModel;", "keyword", "multiCityFlightSearch", "Lcrocusoft/com/gez/pojo/response/flight/multiCityReponse/MultiCityResponse;", "Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/FlightRequest;", "oneWayFlightSearch", "Lcrocusoft/com/gez/pojo/response/flight/oneWayResponse/Response;", "oneWayRequest", "Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/Request;", "roundTripFlightSearch", "Lcrocusoft/com/gez/pojo/response/flight/roundtripResponse/RoundtripResponse;", "flightRequest", "app_debug"})
public abstract interface RetrofitService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/FlightOperationsForMobile/SearchBookCreate")
    public abstract retrofit2.Call<crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse> roundTripFlightSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.FlightRequest flightRequest, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/FlightOperationsForMobile/SearchBookCreate")
    public abstract retrofit2.Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response> oneWayFlightSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    crocusoft.com.gez.pojo.request.searchOnewayFlight.Request oneWayRequest, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/FlightOperationsForMobile/SearchBookCreate")
    public abstract retrofit2.Call<okhttp3.ResponseBody> bookFlightRequest(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    crocusoft.com.gez.pojo.request.bookFlight.BookFlightRequest bookFlightRequest, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/api/FlightOperationsForMobile/SearchBookCreate")
    public abstract retrofit2.Call<crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse> multiCityFlightSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.FlightRequest multiCityFlightSearch, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/FlightOperationsForMobile/GetAirportnames")
    public abstract retrofit2.Call<java.util.List<crocusoft.com.gez.models.AirportSearchModel>> getAirportsList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/FlightOperationsForMobile/GetAirlineImageNames")
    public abstract retrofit2.Call<java.util.List<crocusoft.com.gez.pojo.response.flight.AirportImageResponse>> getAirportImageAndName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.Map<java.lang.String, java.lang.String> headers);
}