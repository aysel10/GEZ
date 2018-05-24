package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("?xml")
	private Xml xml;

	@JsonProperty("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public Response(Xml xml, SoapEnvelope soapEnvelope) {
		this.xml = xml;
		this.soapEnvelope = soapEnvelope;
	}
	public Response(){

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