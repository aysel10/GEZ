package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class SearchFlightResponse{

	@SerializedName("@xmlns")
	private String xmlns;

	@SerializedName("OTA_AirLowFareSearchRS")
	private OTAAirLowFareSearchRS oTAAirLowFareSearchRS;

	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}

	public String getXmlns(){
		return xmlns;
	}

	public void setOTAAirLowFareSearchRS(OTAAirLowFareSearchRS oTAAirLowFareSearchRS){
		this.oTAAirLowFareSearchRS = oTAAirLowFareSearchRS;
	}

	public OTAAirLowFareSearchRS getOTAAirLowFareSearchRS(){
		return oTAAirLowFareSearchRS;
	}

	@Override
 	public String toString(){
		return 
			"SearchFlightResponse{" + 
			"@xmlns = '" + xmlns + '\'' + 
			",oTA_AirLowFareSearchRS = '" + oTAAirLowFareSearchRS + '\'' + 
			"}";
		}
}