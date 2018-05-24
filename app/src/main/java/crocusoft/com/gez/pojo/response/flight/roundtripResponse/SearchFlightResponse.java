package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchFlightResponse{

	@JsonProperty("@xmlns")
	private String xmlns;

	@JsonProperty("OTA_AirLowFareSearchRS")
	private OTAAirLowFareSearchRS oTAAirLowFareSearchRS;

	public SearchFlightResponse(String xmlns, OTAAirLowFareSearchRS oTAAirLowFareSearchRS) {
		this.xmlns = xmlns;
		this.oTAAirLowFareSearchRS = oTAAirLowFareSearchRS;
	}
	public SearchFlightResponse(){

	}

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