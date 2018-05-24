package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class PassengerTypeQuantity{

	@JsonProperty("@Quantity")
	private String quantity;

	@JsonProperty("@Code")
	private String code;

	public PassengerTypeQuantity(String quantity, String code) {
		this.quantity = quantity;
		this.code = code;
	}
	public PassengerTypeQuantity(){

	}
	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
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
			"@Quantity = '" + quantity + '\'' + 
			",@Code = '" + code + '\'' + 
			"}";
		}
}