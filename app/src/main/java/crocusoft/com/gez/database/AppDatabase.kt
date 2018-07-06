package crocusoft.com.gez.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse


@Database(entities = arrayOf(AirportImageResponse::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun imagesDataDAO(): DatabaseService

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase::class.java, "airport.db")
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}