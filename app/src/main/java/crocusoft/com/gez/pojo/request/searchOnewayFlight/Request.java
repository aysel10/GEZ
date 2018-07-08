package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request{

	@JsonProperty("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public void setSoapEnvelope(SoapEnvelope soapEnvelope){
		this.soapEnvelope = soapEnvelope;
	}

	public SoapEnvelope getSoapEnvelope(){
		return soapEnvelope;
	}

	public Request(SoapEnvelope soapEnvelope) {
		this.soapEnvelope = soapEnvelope;
	}

	@Override
 	public String toString(){
		return 
			"Request{" + 
			"soap:Envelope = '" + soapEnvelope + '\'' + 
			"}";
		}
}