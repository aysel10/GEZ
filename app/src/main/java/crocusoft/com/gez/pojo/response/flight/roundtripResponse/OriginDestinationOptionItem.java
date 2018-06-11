package crocusoft.com.gez.pojo.response.flight.roundtripResponse;


import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OriginDestinationOptionItem implements Parcelable{

    @JsonProperty("@ElapsedTime")
    private String elapsedTime;

    @JsonProperty("FlightSegment")
    private Object flightSegment;
    private List<FlightSegment> flightSegmentList;

    @JsonProperty("@SequenceNumber")
    @JsonIgnore
    private String sequenceNumber;


    @JsonProperty("@DirectionId")
    private String directionId;

    @JsonProperty("OptionPricingInfo")
    private OptionPricingInfo optionPricingInfo;

    @JsonProperty("@ProviderType")
    private String providerType;

    @JsonProperty("@RefNumber")
    private String refNumber;

    public OriginDestinationOptionItem(String elapsedTime, Object flightSegment, String directionId, OptionPricingInfo optionPricingInfo, String providerType, String refNumber) {
        this.elapsedTime = elapsedTime;
        this.flightSegment = flightSegment;
        this.directionId = directionId;
        this.optionPricingInfo = optionPricingInfo;
        this.providerType = providerType;
        this.refNumber = refNumber;
        this.sequenceNumber = "";
    }
    public OriginDestinationOptionItem(){
        this.sequenceNumber = "";

    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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


    @Override
    public String toString() {
        return "OriginDestinationOptionItem{" +
                "elapsedTime='" + elapsedTime + '\'' +
                ", flightSegment=" + flightSegment +
                ", directionId='" + directionId + '\'' +
                ", optionPricingInfo=" + optionPricingInfo +
                ", providerType='" + providerType + '\'' +
                ", refNumber='" + refNumber + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.elapsedTime);
        dest.writeParcelable((Parcelable) this.flightSegment, flags);
        dest.writeTypedList(this.flightSegmentList);
        dest.writeString(this.sequenceNumber);
        dest.writeString(this.directionId);
        dest.writeParcelable(this.optionPricingInfo, flags);
        dest.writeString(this.providerType);
        dest.writeString(this.refNumber);
    }

    protected OriginDestinationOptionItem(Parcel in) {
        this.elapsedTime = in.readString();
        this.flightSegment = in.readParcelable(Object.class.getClassLoader());
        this.flightSegmentList = in.createTypedArrayList(FlightSegment.CREATOR);
        this.sequenceNumber = in.readString();
        this.directionId = in.readString();
        this.optionPricingInfo = in.readParcelable(OptionPricingInfo.class.getClassLoader());
        this.providerType = in.readString();
        this.refNumber = in.readString();
    }

    public static final Creator<OriginDestinationOptionItem> CREATOR = new Creator<OriginDestinationOptionItem>() {
        @Override
        public OriginDestinationOptionItem createFromParcel(Parcel source) {
            return new OriginDestinationOptionItem(source);
        }

        @Override
        public OriginDestinationOptionItem[] newArray(int size) {
            return new OriginDestinationOptionItem[size];
        }
    };
}