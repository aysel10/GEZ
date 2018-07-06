package crocusoft.com.gez.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "weatherData")
data class AirportDataBaseModel(@PrimaryKey(autoGenerate = true) var id: Long?,
                                @ColumnInfo(name = "afhc") var lat: Double,
                                @ColumnInfo(name = "path") var lon: Double,
                                @ColumnInfo(name = "name") var name: String
                       ) {
    constructor():this(null,0.0,0.0,"")
}