package crocusoft.com.gez.models

import android.arch.persistence.room.ColumnInfo

data class AirportImageModel(@ColumnInfo(name = "ID") var ID: Int, @ColumnInfo(name = "AirlineName") var AirlineName: String)