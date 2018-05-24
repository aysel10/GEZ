package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OptionPricingInfo{

	@JsonProperty("PTC_FareBreakdowns")
	private PTCFareBreakdowns pTCFareBreakdowns;

	@JsonProperty("ItinTotalFare")
	private ItinTotalFare itinTotalFare;


	public OptionPricingInfo(PTCFareBreakdowns pTCFareBreakdowns, ItinTotalFare itinTotalFare) {
		this.pTCFareBreakdowns = pTCFareBreakdowns;
		this.itinTotalFare = itinTotalFare;
	}
	public OptionPricingInfo(){

	}
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
			"OptionPricingInfo{" + 
			"pTC_FareBreakdowns = '" + pTCFareBreakdowns + '\'' + 
			",itinTotalFare = '" + itinTotalFare + '\'' + 
			"}";
		}
}