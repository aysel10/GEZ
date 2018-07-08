package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"xmlns","oTAAirBookRQ"})
public class BookFlight{

	@JsonProperty("OTA_AirBookRQ")
	private OTAAirBookRQ oTAAirBookRQ;

	@JsonProperty("@xmlns")
	private String xmlns;

	public BookFlight(OTAAirBookRQ oTAAirBookRQ) {
		this.oTAAirBookRQ = oTAAirBookRQ;
		this.xmlns = "http://epowerv5.amadeus.com.tr/WS";
	}

	public void setOTAAirBookRQ(OTAAirBookRQ oTAAirBookRQ){
		this.oTAAirBookRQ = oTAAirBookRQ;
	}

	public OTAAirBookRQ getOTAAirBookRQ(){
		return oTAAirBookRQ;
	}

	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}

	public String getXmlns(){
		return xmlns;
	}

	@Override
 	public String toString(){
		return 
			"BookFlight{" + 
			"oTA_AirBookRQ = '" + oTAAirBookRQ + '\'' + 
			",@xmlns = '" + xmlns + '\'' + 
			"}";
		}
}