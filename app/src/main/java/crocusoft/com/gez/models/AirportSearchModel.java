package crocusoft.com.gez.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class AirportSearchModel{

	@SerializedName("CityCode")
	@JsonProperty("CityCode")
	private String cityCode;

	@JsonProperty("IsCity")
	@SerializedName("IsCity")
	private boolean isCity;

	@JsonProperty("AirportCode")
	@SerializedName("AirportCode")
	private String airportCode;

	@JsonProperty("TypeCode")
	@SerializedName("TypeCode")
	private Object typeCode;

	@JsonProperty("AirportName")
	@SerializedName("AirportName")
	private String airportName;

	@JsonProperty("CityName")
	@SerializedName("CityName")
	private String cityName;

	@JsonProperty("CountryCode")
	@SerializedName("CountryCode")
	private Object countryCode;

	public AirportSearchModel(String cityCode, boolean isCity, String airportCode, Object typeCode, String airportName, String cityName, Object countryCode) {
		this.cityCode = cityCode;
		this.isCity = isCity;
		this.airportCode = airportCode;
		this.typeCode = typeCode;
		this.airportName = airportName;
		this.cityName = cityName;
		this.countryCode = countryCode;
	}
	public AirportSearchModel(){}

	public void setCityCode(String cityCode){
		this.cityCode = cityCode;
	}

	public String getCityCode(){
		return cityCode;
	}

	public void setIsCity(boolean isCity){
		this.isCity = isCity;
	}

	public boolean isIsCity(){
		return isCity;
	}

	public void setAirportCode(String airportCode){
		this.airportCode = airportCode;
	}

	public String getAirportCode(){
		return airportCode;
	}

	public void setTypeCode(Object typeCode){
		this.typeCode = typeCode;
	}

	public Object getTypeCode(){
		return typeCode;
	}

	public void setAirportName(String airportName){
		this.airportName = airportName;
	}

	public String getAirportName(){
		return airportName;
	}

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public String getCityName(){
		return cityName;
	}

	public void setCountryCode(Object countryCode){
		this.countryCode = countryCode;
	}

	public Object getCountryCode(){
		return countryCode;
	}

	@Override
 	public String toString(){
		return 
			"AirportSearchModel{" + 
			"cityCode = '" + cityCode + '\'' + 
			",isCity = '" + isCity + '\'' + 
			",airportCode = '" + airportCode + '\'' + 
			",typeCode = '" + typeCode + '\'' + 
			",airportName = '" + airportName + '\'' + 
			",cityName = '" + cityName + '\'' + 
			",countryCode = '" + countryCode + '\'' + 
			"}";
		}
}