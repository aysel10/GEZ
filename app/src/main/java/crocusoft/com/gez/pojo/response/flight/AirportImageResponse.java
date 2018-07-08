package crocusoft.com.gez.pojo.response.flight;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class AirportImageResponse{
	@JsonIgnore
	@NonNull
	@PrimaryKey(autoGenerate = true)
	private int uid;
	@ColumnInfo(name = "AirlineName")
	@NonNull
	@JsonProperty("AirlineName")
	private String airlineName;

	@NonNull
	@ColumnInfo(name = "ID")
	@JsonProperty("ID")
	private int iD;

	public void setAirlineName(String airlineName){
		this.airlineName = airlineName;
	}

	public String getAirlineName(){
		return airlineName;
	}

	public void setID(int iD){
		this.iD = iD;
	}

	public int getID(){
		return iD;
	}

	@Override
 	public String toString(){
		return 
			"AirportImageResponse{" + 
			"airlineName = '" + airlineName + '\'' + 
			",iD = '" + iD + '\'' + 
			"}";
		}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}
}