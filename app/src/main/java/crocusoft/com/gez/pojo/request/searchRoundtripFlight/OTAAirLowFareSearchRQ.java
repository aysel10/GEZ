package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
@JsonPropertyOrder({"providerType","refundableType","xmlnsXsi","xmlnsXsd","version","maxPrice"})
public class OTAAirLowFareSearchRQ {

    @JsonProperty("@ProviderType")
    @Expose
    private String providerType;
    @JsonProperty("@RefundableType")
    @Expose
    private String refundableType;
    @JsonProperty("@xmlns:xsi")
    @Expose
    private String xmlnsXsi;
    @JsonProperty("@xmlns:xsd")
    @Expose
    private String xmlnsXsd;
    @JsonProperty("@Version")
    @Expose
    private String version;
    @JsonProperty("@MaxPrice")
    @Expose
    private String maxPrice;
    @JsonProperty("OriginDestinationInformation")
    @Expose
    private List<OriginDestinationInformation_> originDestinationInformation;
    @JsonProperty("TravelPreferences")
    @Expose
    private TravelPreferences travelPreferences;
    @JsonProperty("TravelerInfoSummary")
    @Expose
    private TravelerInfoSummary travelerInfoSummary;

    public OTAAirLowFareSearchRQ(List<OriginDestinationInformation_> originDestinationInformation,
                                 TravelPreferences travelPreferences,
                                 TravelerInfoSummary travelerInfoSummary) {
        this.providerType = "OnlyAmadeus";
        this.refundableType = "AllFlights";
        this.version = "0";
        this.maxPrice = "2000";
        this.xmlnsXsi = "http://www.w3.org/2001/XMLSchema-instance";
        this.xmlnsXsd = "http://www.w3.org/2001/XMLSchema";
        this.originDestinationInformation = originDestinationInformation;
        this.travelPreferences = travelPreferences;
        this.travelerInfoSummary = travelerInfoSummary;

    }


    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getRefundableType() {
        return refundableType;
    }

    public void setRefundableType(String refundableType) {
        this.refundableType = refundableType;
    }

    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    public String getXmlnsXsd() {
        return xmlnsXsd;
    }

    public void setXmlnsXsd(String xmlnsXsd) {
        this.xmlnsXsd = xmlnsXsd;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public List<OriginDestinationInformation_> getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    public void setOriginDestinationInformation(List<OriginDestinationInformation_> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    public TravelPreferences getTravelPreferences() {
        return travelPreferences;
    }

    public void setTravelPreferences(TravelPreferences travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    public TravelerInfoSummary getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    public void setTravelerInfoSummary(TravelerInfoSummary travelerInfoSummary) {
        this.travelerInfoSummary = travelerInfoSummary;
    }

}
