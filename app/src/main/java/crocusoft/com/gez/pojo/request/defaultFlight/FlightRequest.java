package crocusoft.com.gez.pojo.request.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

public class FlightRequest {
    @JsonProperty("soap:Envelope")
    @Expose
    private SoapEnvelope soapEnvelope;

    public FlightRequest(SoapEnvelope soapEnvelope) {
        this.soapEnvelope = soapEnvelope;
    }

    public SoapEnvelope getSoapEnvelope() {
        return soapEnvelope;
    }

    public void setSoapEnvelope(SoapEnvelope soapEnvelope) {
        this.soapEnvelope = soapEnvelope;
    }

}
