package crocusoft.com.gez.pojo.response.flight.oneWayResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class OriginDestinationOptionItem {

    @JsonProperty("@ElapsedTime")
    private String elapsedTime;

    @JsonProperty("FlightSegment")
    private Object flightSegment;
    private List<FlightSegment> flightSegmentList;


    @JsonProperty("@DirectionId")
    private String directionId;


    @JsonProperty("@ProviderType")
    private String providerType;

    @JsonProperty("@RefNumber")
    private String refNumber;

    public OriginDestinationOptionItem(String elapsedTime, Object flightSegment, String directionId, String providerType, String refNumber) {
        this.elapsedTime = elapsedTime;
        this.flightSegment = flightSegment;
        this.directionId = directionId;
        this.providerType = providerType;
        this.refNumber = refNumber;
    }
    public OriginDestinationOptionItem(){

    }

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


    public List<FlightSegment> getFlightSegmentList() {
        return flightSegmentList;
    }

    public void setFlightSegmentList(List<FlightSegment> flightSegmentList) {
        this.flightSegmentList = flightSegmentList;
    }

    public void setDirectionId(String directionId) {
        this.directionId = directionId;
    }

    public String getDirectionId() {
        return directionId;
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


    @Override
    public String toString() {
        return "OriginDestinationOptionItem{" +
                "elapsedTime='" + elapsedTime + '\'' +
                ", flightSegment=" + flightSegment +
                ", directionId='" + directionId + '\'' +
                ", providerType='" + providerType + '\'' +
                ", refNumber='" + refNumber + '\'' +
                '}';
    }

}