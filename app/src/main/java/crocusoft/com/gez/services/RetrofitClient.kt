package crocusoft.com.gez.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.jackson.JacksonConverterFactory
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit


class RetrofitClient {
    companion object {
        var client: Retrofit? = null
    }
    private val baseUrl: String = "http://88.99.186.108/"


    public fun getClient() : Retrofit? {
        if(client==null){
            val gson = GsonBuilder()
                    .setLenient()
                    .create()
//            client = Retrofit.Builder()
//                    .baseUrl(baseUrl)
//                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .build();
            var logging :  HttpLoggingInterceptor =  HttpLoggingInterceptor();

            logging.level = HttpLoggingInterceptor.Level.BODY
            var okHttpClient = OkHttpClient()
            okHttpClient = okHttpClient.newBuilder()
                    .addInterceptor(logging)
                    .connectTimeout(30,TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .build()
            client = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return client;
    }

}

