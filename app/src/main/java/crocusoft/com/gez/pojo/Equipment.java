package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class Equipment{

	@SerializedName("@AirEquipType")
	private String airEquipType;

	public void setAirEquipType(String airEquipType){
		this.airEquipType = airEquipType;
	}

	public String getAirEquipType(){
		return airEquipType;
	}

	@Override
 	public String toString(){
		return 
			"Equipment{" + 
			"@AirEquipType = '" + airEquipType + '\'' + 
			"}";
		}
}