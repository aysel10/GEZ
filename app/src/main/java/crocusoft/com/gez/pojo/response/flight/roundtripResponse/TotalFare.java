package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalFare{

	@JsonProperty("@Amount")
	private String amount;

	public TotalFare(String amount) {
		this.amount = amount;
	}
	public TotalFare(){

	}

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	@Override
 	public String toString(){
		return 
			"TotalFare{" + 
			"@Amount = '" + amount + '\'' + 
			"}";
		}
}