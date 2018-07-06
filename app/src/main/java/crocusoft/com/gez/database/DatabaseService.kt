package crocusoft.com.gez.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse

@Dao
interface DatabaseService {
    /*
    @Query("SELECT * from weatherData")
    fun getAll(): List<AirportDataBaseModel>

    @Insert(onConflict = REPLACE)
    fun insert(airportData: AirportDataBaseModel)

    @Query("DELETE from weatherData")
    fun deleteAll()
    */

    @Insert
    fun insertImage(model: AirportImageResponse)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllImages(user: List<AirportImageResponse>)


    @Query("SELECT * FROM airportImageResponse")
    fun fetchAllImages(): List<AirportImageResponse>

    @Query("SELECT * FROM airportImageResponse WHERE AirlineName LIKE :code LIMIT 1")
    fun getImage(code: String): AirportImageResponse
}