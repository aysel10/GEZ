package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OperatingAirline{

	@JsonProperty("@Code")
	@SerializedName("@Code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public OperatingAirline(String code) {
		this.code = code;
	}
	public OperatingAirline(){

	}
	@Override
 	public String toString(){
		return 
			"OperatingAirline{" + 
			"@Code = '" + code + '\'' + 
			"}";
		}
}