package crocusoft.com.gez.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import okhttp3.JavaNetCookieJar
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.jackson.JacksonConverterFactory
import okhttp3.OkHttpClient
import java.net.CookieHandler
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.concurrent.TimeUnit
import java.net.CookiePolicy.ACCEPT_ALL




class RetrofitClient {
    companion object {
        var client: Retrofit? = null
    }
    private val baseUrl: String = "http://88.99.186.108:8888/api/FlightOperationsForMobile"

     fun getClient() : Retrofit? {
         val cookieManager = CookieManager()
         cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)
         val jncj = JavaNetCookieJar(cookieManager)

         if(client==null){
            val gson = GsonBuilder()
                    .setLenient()
                    .create()
//            client = Retrofit.Builder()
//                    .baseUrl(baseUrl)
//                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .build();
            val logging :  HttpLoggingInterceptor =  HttpLoggingInterceptor();

            logging.level = HttpLoggingInterceptor.Level.BODY
            var okHttpClient = OkHttpClient()

            okHttpClient = okHttpClient.newBuilder()
                    .addInterceptor(logging)
                    .cookieJar(jncj)
                    .connectTimeout(60,TimeUnit.SECONDS)
                    .writeTimeout(60, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .build()
            client = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(okHttpClient)
                    .build()
        }
        return client
    }

}

