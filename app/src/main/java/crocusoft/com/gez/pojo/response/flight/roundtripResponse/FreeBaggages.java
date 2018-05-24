package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FreeBaggages{

	@JsonProperty("Baggage")
	private List<BaggageItem> baggage;

	public void setBaggage(List<BaggageItem> baggage){
		this.baggage = baggage;
	}

	public List<BaggageItem> getBaggage(){
		return baggage;
	}
	public FreeBaggages(){}
	public FreeBaggages(List<BaggageItem> baggage) {
		this.baggage = baggage;
	}

	@Override
 	public String toString(){
		return 
			"FreeBaggages{" + 
			"baggage = '" + baggage + '\'' + 
			"}";
		}
}