package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class PTCFareBreakdowns{

	@SerializedName("PTC_FareBreakdown")
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