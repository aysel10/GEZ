package crocusoft.com.gez.view_model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import crocusoft.com.gez.pojo.response.flight.defaultFlight.FlightSegment;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OptionPricingInfo;


public class OriginDestinationOptionItemViewModel {

    @SerializedName("ElapsedTime")
    private String elapsedTime;

    private List<FlightSegment> flightSegmentList;

    @SerializedName("DirectionId")
    private String directionId;

    @SerializedName("OptionPricingInfo")
    private OptionPricingInfo optionPricingInfo;

    @SerializedName("ProviderType")
    private String providerType;

    @SerializedName("RefNumber")
    private String refNumber;

    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public List<FlightSegment> getFlightSegmentList() {
        return flightSegmentList;
    }

    public void setFlightSegmentList(List<FlightSegment> flightSegmentList) {
        this.flightSegmentList = flightSegmentList;
    }

    public String getDirectionId() {
        return directionId;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public OptionPricingInfo getOptionPricingInfo() {
        return optionPricingInfo;
    }

    public void setOptionPricingInfo(OptionPricingInfo optionPricingInfo) {
        this.optionPricingInfo = optionPricingInfo;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    @Override
    public String toString() {
        return "OriginDestinationOptionItemViewModel{" +
                "elapsedTime='" + elapsedTime + '\'' +
                ", flightSegmentList=" + flightSegmentList +
                ", directionId='" + directionId + '\'' +
                ", optionPricingInfo=" + optionPricingInfo +
                ", providerType='" + providerType + '\'' +
                ", refNumber='" + refNumber + '\'' +
                '}';
    }
}
