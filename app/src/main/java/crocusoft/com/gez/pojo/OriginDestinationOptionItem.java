package crocusoft.com.gez.pojo;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OriginDestinationOptionItem {

    @SerializedName("@ElapsedTime")
    private String elapsedTime;

    @SerializedName("FlightSegment")
    private Object flightSegment;

    private List<FlightSegment> flightSegmentList;

    @SerializedName("@DirectionId")
    private String directionId;

    @SerializedName("OptionPricingInfo")
    private OptionPricingInfo optionPricingInfo;

    @SerializedName("@ProviderType")
    private String providerType;

    @SerializedName("@RefNumber")
    private String refNumber;

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getElapsedTime() {
        return elapsedTime;
    }

    public Object getFlightSegment() {
        return flightSegment;
    }

    public void setFlightSegment(Object flightSegment) {
        this.flightSegment = flightSegment;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public String getDirectionId() {
        return directionId;
    }

    public void setOptionPricingInfo(OptionPricingInfo optionPricingInfo) {
        this.optionPricingInfo = optionPricingInfo;
    }

    public OptionPricingInfo getOptionPricingInfo() {
        return optionPricingInfo;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public List<FlightSegment> getFlightSegmentList() {
        return flightSegmentList;
    }

    public void setFlightSegmentList(List<FlightSegment> flightSegmentList) {
        this.flightSegmentList = flightSegmentList;
    }

    @Override
    public String toString() {
        return "OriginDestinationOptionItem{" +
                "elapsedTime='" + elapsedTime + '\'' +
                ", flightSegment=" + flightSegment +
                ", flightSegmentList=" + flightSegmentList +
                ", directionId='" + directionId + '\'' +
                ", optionPricingInfo=" + optionPricingInfo +
                ", providerType='" + providerType + '\'' +
                ", refNumber='" + refNumber + '\'' +
                '}';
    }

}