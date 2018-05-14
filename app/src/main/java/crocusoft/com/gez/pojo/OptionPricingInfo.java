package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class OptionPricingInfo{

	@SerializedName("PTC_FareBreakdowns")
	private PTCFareBreakdowns pTCFareBreakdowns;

	@SerializedName("ItinTotalFare")
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
			"OptionPricingInfo{" + 
			"pTC_FareBreakdowns = '" + pTCFareBreakdowns + '\'' + 
			",itinTotalFare = '" + itinTotalFare + '\'' + 
			"}";
		}
}