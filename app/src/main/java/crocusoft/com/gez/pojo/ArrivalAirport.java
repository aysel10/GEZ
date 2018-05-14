package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class ArrivalAirport{

	@SerializedName("@Terminal")
	private String terminal;

	@SerializedName("@LocationCode")
	private String locationCode;

	public void setTerminal(String terminal){
		this.terminal = terminal;
	}

	public String getTerminal(){
		return terminal;
	}

	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}

	public String getLocationCode(){
		return locationCode;
	}

	@Override
 	public String toString(){
		return 
			"ArrivalAirport{" + 
			"@Terminal = '" + terminal + '\'' + 
			",@LocationCode = '" + locationCode + '\'' + 
			"}";
		}
}