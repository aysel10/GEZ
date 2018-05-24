package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class MarkupFare{

	@JsonProperty("@Amount")
	private String amount;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}
	public MarkupFare(){}

	public MarkupFare(String amount) {
		this.amount = amount;
	}

	@Override
 	public String toString(){
		return 
			"MarkupFare{" + 
			"@Amount = '" + amount + '\'' + 
			"}";
		}
}