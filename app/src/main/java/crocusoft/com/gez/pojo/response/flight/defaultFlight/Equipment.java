package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import android.widget.EditText;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Equipment{

	@JsonProperty("@AirEquipType")
	@SerializedName("@AirEquipType")
	private String airEquipType;

	public void setAirEquipType(String airEquipType){
		this.airEquipType = airEquipType;
	}

	public String getAirEquipType(){
		return airEquipType;
	}

	public Equipment(String airEquipType) {
		this.airEquipType = airEquipType;
	}
	public Equipment(){}
	@Override
 	public String toString(){
		return 
			"Equipment{" + 
			"@AirEquipType = '" + airEquipType + '\'' + 
			"}";
		}
}