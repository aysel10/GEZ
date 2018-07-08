package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"xmlns","oTAAirLowFareSearchRQ"})

public class SearchFlight{

	@JsonProperty("@xmlns")
	private String xmlns;

	@JsonProperty("OTA_AirLowFareSearchRQ")
	private OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ;

	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}

	public String getXmlns(){
		return xmlns;
	}

    public SearchFlight( OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ) {
        this.xmlns = "http://epowerv5.amadeus.com.tr/WS";
        this.oTAAirLowFareSearchRQ = oTAAirLowFareSearchRQ;
    }

    public void setOTAAirLowFareSearchRQ(OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ){
		this.oTAAirLowFareSearchRQ = oTAAirLowFareSearchRQ;
	}

	public OTAAirLowFareSearchRQ getOTAAirLowFareSearchRQ(){
		return oTAAirLowFareSearchRQ;
	}

	@Override
 	public String toString(){
		return 
			"SearchFlight{" + 
			"@xmlns = '" + xmlns + '\'' + 
			",oTA_AirLowFareSearchRQ = '" + oTAAirLowFareSearchRQ + '\'' + 
			"}";
		}
}