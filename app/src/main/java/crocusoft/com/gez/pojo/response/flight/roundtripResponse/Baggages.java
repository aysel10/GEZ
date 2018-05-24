package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Baggages{

	@JsonProperty("Baggage")
	@SerializedName("Baggage")
	private Baggage baggage;

	public void setBaggage(Baggage baggage){
		this.baggage = baggage;
	}

	public Baggage getBaggage(){
		return baggage;
	}

	public Baggages(Baggage baggage) {
		this.baggage = baggage;
	}
	public Baggages(){}
	@Override
 	public String toString(){
		return 
			"Baggages{" + 
			"baggage = '" + baggage + '\'' + 
			"}";
		}
}