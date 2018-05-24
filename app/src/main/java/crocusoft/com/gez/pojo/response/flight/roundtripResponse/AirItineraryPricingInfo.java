package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AirItineraryPricingInfo{

	@JsonProperty("PTC_FareBreakdowns")
	private PTCFareBreakdowns pTCFareBreakdowns;

	@JsonProperty("ItinTotalFare")
	private ItinTotalFare itinTotalFare;

	public void setPTCFareBreakdowns(PTCFareBreakdowns pTCFareBreakdowns){
		this.pTCFareBreakdowns = pTCFareBreakdowns;
	}

	public PTCFareBreakdowns getPTCFareBreakdowns(){
		return pTCFareBreakdowns;
	}

	public void setItinTotalFare(ItinTotalFare itinTotalFare){
		this.itinTotalFare = itinTotalFare;
	}

	public ItinTotalFare getItinTotalFare(){
		return itinTotalFare;
	}

	@Override
 	public String toString(){
		return 
			"AirItineraryPricingInfo{" + 
			"pTC_FareBreakdowns = '" + pTCFareBreakdowns + '\'' + 
			",itinTotalFare = '" + itinTotalFare + '\'' + 
			"}";
		}
}