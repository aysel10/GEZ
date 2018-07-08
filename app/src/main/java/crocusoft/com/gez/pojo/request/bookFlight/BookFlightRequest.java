package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class BookFlightRequest{

	@JsonProperty("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public BookFlightRequest(SoapEnvelope soapEnvelope) {
		this.soapEnvelope = soapEnvelope;
	}

	public SoapEnvelope getSoapEnvelope() {
		return soapEnvelope;
	}

	public void setSoapEnvelope(SoapEnvelope soapEnvelope) {
		this.soapEnvelope = soapEnvelope;
	}

	@Override
 	public String toString(){
		return 
			"BookFlightRequest{" + 
			"soap:Envelope = '" + soapEnvelope + '\'' +
			"}";
		}
}