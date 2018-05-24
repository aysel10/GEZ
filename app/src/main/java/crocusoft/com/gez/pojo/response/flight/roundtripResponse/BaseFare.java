package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseFare{

	@JsonProperty("@Amount")
	private String amount;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public BaseFare(String amount) {
		this.amount = amount;
	}
	public BaseFare(){}
	@Override
 	public String toString(){
		return 
			"BaseFare{" + 
			"@Amount = '" + amount + '\'' + 
			"}";
		}
}