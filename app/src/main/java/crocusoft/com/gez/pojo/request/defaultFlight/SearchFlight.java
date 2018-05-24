package crocusoft.com.gez.pojo.request.defaultFlight;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;

import crocusoft.com.gez.pojo.request.defaultFlight.OTAAirLowFareSearchRQ;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)

@JsonPropertyOrder({"xmlns","oTAAirLowFareSearchRQ"})
public class SearchFlight {
    @JsonProperty("@xmlns")
    @Expose
    private String xmlns;
    @JsonProperty("OTA_AirLowFareSearchRQ")
    @Expose
    private OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ;

    public SearchFlight(OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ) {
        this.xmlns = "http://epowerv5.amadeus.com.tr/WS";
        this.oTAAirLowFareSearchRQ = oTAAirLowFareSearchRQ;
    }

    public SearchFlight(String xmlns, OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ) {
        this.xmlns = xmlns;
        this.oTAAirLowFareSearchRQ = oTAAirLowFareSearchRQ;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public OTAAirLowFareSearchRQ getOTAAirLowFareSearchRQ() {
        return oTAAirLowFareSearchRQ;
    }

    public void setOTAAirLowFareSearchRQ(OTAAirLowFareSearchRQ oTAAirLowFareSearchRQ) {
        this.oTAAirLowFareSearchRQ = oTAAirLowFareSearchRQ;
    }
}
