package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxes{

	@JsonProperty("Tax")
	private Tax tax;

	public void setTax(Tax tax){
		this.tax = tax;
	}

	public Tax getTax(){
		return tax;
	}

	@Override
 	public String toString(){
		return 
			"Taxes{" + 
			"tax = '" + tax + '\'' + 
			"}";
		}
}