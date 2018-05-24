package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "soap:Envelope"
})
public class FlightRequest implements Serializable{

    @JsonProperty("soap:Envelope")
    SoapEnvelope soapEnvelope;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6253845089962357091L;

    public FlightRequest(SoapEnvelope soapEnvelope) {
        this.soapEnvelope = soapEnvelope;
    }

    @JsonProperty("soap:Envelope")
    public SoapEnvelope getSoapEnvelope() {
        return soapEnvelope;
    }

    @JsonProperty("soap:Envelope")
    public void setSoapEnvelope(SoapEnvelope soapEnvelope) {
        this.soapEnvelope = soapEnvelope;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
