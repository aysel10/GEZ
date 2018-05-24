package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginLocation{

	@JsonProperty("@LocationCode")
	private String locationCode;

	@JsonProperty("@MultiAirportCityInd")
	private String multiAirportCityInd;

	public OriginLocation(String locationCode, String multiAirportCityInd) {
		this.locationCode = locationCode;
		this.multiAirportCityInd = multiAirportCityInd;
	}

	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}

	public String getLocationCode(){
		return locationCode;
	}

	public void setMultiAirportCityInd(String multiAirportCityInd){
		this.multiAirportCityInd = multiAirportCityInd;
	}

	public String getMultiAirportCityInd(){
		return multiAirportCityInd;
	}

	@Override
 	public String toString(){
		return 
			"OriginLocation{" + 
			"@LocationCode = '" + locationCode + '\'' + 
			",@MultiAirportCityInd = '" + multiAirportCityInd + '\'' + 
			"}";
		}
}