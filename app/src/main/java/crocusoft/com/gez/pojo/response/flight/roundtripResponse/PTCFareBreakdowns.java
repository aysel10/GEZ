package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PTCFareBreakdowns{

	@JsonProperty("PTC_FareBreakdown")
	private PTCFareBreakdown pTCFareBreakdown;

	public void setPTCFareBreakdown(PTCFareBreakdown pTCFareBreakdown){
		this.pTCFareBreakdown = pTCFareBreakdown;
	}

	public PTCFareBreakdown getPTCFareBreakdown(){
		return pTCFareBreakdown;
	}

	@Override
 	public String toString(){
		return 
			"PTCFareBreakdowns{" + 
			"pTC_FareBreakdown = '" + pTCFareBreakdown + '\'' + 
			"}";
		}
}