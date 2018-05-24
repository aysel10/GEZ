package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoundtripResponse {

	@JsonProperty("?xml")
	private Xml xml;

	@JsonProperty("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public RoundtripResponse(Xml xml, SoapEnvelope soapEnvelope) {
		this.xml = xml;
		this.soapEnvelope = soapEnvelope;
	}
	public RoundtripResponse(){

	}


	public void setXml(Xml xml){
		this.xml = xml;
	}

	public Xml getXml(){
		return xml;
	}

	public void setSoapEnvelope(SoapEnvelope soapEnvelope){
		this.soapEnvelope = soapEnvelope;
	}

	public SoapEnvelope getSoapEnvelope(){
		return soapEnvelope;
	}

	@Override
 	public String toString(){
		return 
			"OneWayRequest{" +
			"?xml = '" + xml + '\'' + 
			",soap:Envelope = '" + soapEnvelope + '\'' + 
			"}";
		}
}