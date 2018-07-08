package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerTypeQuantity{

	@JsonProperty("@Code")
	private String code;

	public PassengerTypeQuantity(String code) {
		this.code = code;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"PassengerTypeQuantity{" + 
			"@Code = '" + code + '\'' + 
			"}";
		}
}