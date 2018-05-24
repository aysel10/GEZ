package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class MarketingAirline{

	@JsonProperty("@Code")
	@SerializedName("@Code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public MarketingAirline(String code) {
		this.code = code;
	}
	public MarketingAirline(){}
	@Override
 	public String toString(){
		return 
			"MarketingAirline{" + 
			"@Code = '" + code + '\'' + 
			"}";
		}
}