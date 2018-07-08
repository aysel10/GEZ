package crocusoft.com.gez.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcrocusoft/com/gez/util/Utils;", "", "()V", "Companion", "app_debug"})
public final class Utils {
    public static final crocusoft.com.gez.util.Utils.Companion Companion = null;
    
    public Utils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001:\b!\"#$%&\'(B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJH\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001aj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`\u001bJ*\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001aj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0016\u00a8\u0006)"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion;", "", "()V", "changeFragment", "", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "fragmentPlaceHolder", "", "fragment", "Landroid/support/v4/app/Fragment;", "datePicker", "textview", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "getAirportsList", "", "Lcrocusoft/com/gez/models/AirportSearchModel;", "service", "Lcrocusoft/com/gez/services/RetrofitService;", "keyword", "", "airportListApiCallback", "Lcrocusoft/com/gez/util/Utils$Companion$AirportListApiCallback;", "header", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getHeader", "myPreferences", "Lcrocusoft/com/gez/util/AppSharedPreferences;", "toast", "text", "AirportListApiCallback", "ApiCallback", "ApiCallbackFailure", "BookFlightCallback", "MultiCityApiCallback", "MultiCityApiCallbackFailure", "OneWayApiCallback", "OneWayApiCallbackFailure", "app_debug"})
    public static final class Companion {
        
        public final void changeFragment(@org.jetbrains.annotations.NotNull()
        android.support.v4.app.FragmentManager fragmentManager, int fragmentPlaceHolder, @org.jetbrains.annotations.NotNull()
        android.support.v4.app.Fragment fragment) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<crocusoft.com.gez.models.AirportSearchModel> getAirportsList(@org.jetbrains.annotations.NotNull()
        crocusoft.com.gez.services.RetrofitService service, @org.jetbrains.annotations.NotNull()
        java.lang.String keyword, @org.jetbrains.annotations.NotNull()
        crocusoft.com.gez.util.Utils.Companion.AirportListApiCallback airportListApiCallback, @org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, java.lang.String> header) {
            return null;
        }
        
        public final void toast(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
        
        public final void datePicker(@org.jetbrains.annotations.NotNull()
        android.widget.TextView textview, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, java.lang.String> getHeader(@org.jetbrains.annotations.NotNull()
        crocusoft.com.gez.util.AppSharedPreferences myPreferences) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$ApiCallback;", "", "onSuccess", "", "call", "Lretrofit2/Call;", "Lcrocusoft/com/gez/pojo/response/flight/roundtripResponse/RoundtripResponse;", "response", "Lretrofit2/Response;", "app_debug"})
        public static abstract interface ApiCallback {
            
            public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse> call, @org.jetbrains.annotations.Nullable()
            retrofit2.Response<crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse> response);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$BookFlightCallback;", "", "onSuccess", "", "call", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "response", "Lretrofit2/Response;", "app_debug"})
        public static abstract interface BookFlightCallback {
            
            public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<okhttp3.ResponseBody> call, @org.jetbrains.annotations.Nullable()
            retrofit2.Response<okhttp3.ResponseBody> response);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$ApiCallbackFailure;", "", "onFailre", "", "call", "Lretrofit2/Call;", "Lcrocusoft/com/gez/pojo/response/flight/roundtripResponse/RoundtripResponse;", "t", "", "app_debug"})
        public static abstract interface ApiCallbackFailure {
            
            public abstract void onFailre(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse> call, @org.jetbrains.annotations.Nullable()
            java.lang.Throwable t);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$OneWayApiCallback;", "", "onSuccess", "", "call", "Lretrofit2/Call;", "Lcrocusoft/com/gez/pojo/response/flight/oneWayResponse/Response;", "response", "Lretrofit2/Response;", "app_debug"})
        public static abstract interface OneWayApiCallback {
            
            public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response> call, @org.jetbrains.annotations.Nullable()
            retrofit2.Response<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response> response);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$OneWayApiCallbackFailure;", "", "onFailure", "", "call", "Lretrofit2/Call;", "Lcrocusoft/com/gez/pojo/response/flight/oneWayResponse/Response;", "t", "", "app_debug"})
        public static abstract interface OneWayApiCallbackFailure {
            
            public abstract void onFailure(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response> call, @org.jetbrains.annotations.Nullable()
            java.lang.Throwable t);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$MultiCityApiCallback;", "", "onSuccess", "", "call", "Lretrofit2/Call;", "Lcrocusoft/com/gez/pojo/response/flight/multiCityReponse/MultiCityResponse;", "response", "Lretrofit2/Response;", "app_debug"})
        public static abstract interface MultiCityApiCallback {
            
            public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse> call, @org.jetbrains.annotations.Nullable()
            retrofit2.Response<crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse> response);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$MultiCityApiCallbackFailure;", "", "onFailure", "", "call", "Lretrofit2/Call;", "Lcrocusoft/com/gez/pojo/response/flight/multiCityReponse/MultiCityResponse;", "t", "", "app_debug"})
        public static abstract interface MultiCityApiCallbackFailure {
            
            public abstract void onFailure(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse> call, @org.jetbrains.annotations.Nullable()
            java.lang.Throwable t);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcrocusoft/com/gez/util/Utils$Companion$AirportListApiCallback;", "", "onSuccess", "", "call", "Lretrofit2/Call;", "", "Lcrocusoft/com/gez/models/AirportSearchModel;", "response", "Lretrofit2/Response;", "app_debug"})
        public static abstract interface AirportListApiCallback {
            
            public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
            retrofit2.Call<java.util.List<crocusoft.com.gez.models.AirportSearchModel>> call, @org.jetbrains.annotations.Nullable()
            retrofit2.Response<java.util.List<crocusoft.com.gez.models.AirportSearchModel>> response);
        }
    }
}