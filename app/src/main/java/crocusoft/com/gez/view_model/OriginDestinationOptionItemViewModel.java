package crocusoft.com.gez.view_model;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import crocusoft.com.gez.pojo.response.flight.oneWayResponse.AirItinerary;
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.AirItineraryPricingInfo;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FlightSegment;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OptionPricingInfo;


public class OriginDestinationOptionItemViewModel implements Parcelable{

    @SerializedName("ElapsedTime")
    private String elapsedTime;

    @SerializedName("@SequenceNumber")
    @JsonProperty("@SequenceNumber")
    private String sequenceNumber;

    @SerializedName("DirectionId")
    private String directionId;

    @SerializedName("OptionPricingInfo")
    @JsonIgnore
    private OptionPricingInfo optionPricingInfo;

    @SerializedName("ProviderType")
    private String providerType;

    @SerializedName("RefNumber")
    private String refNumber;

    @SerializedName("AirItinerary")
    @JsonProperty("AirItinerary")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AirItineraryPricingInfo airItineraryPricingInfo;
    private crocusoft.com.gez.pojo.response.flight.roundtripResponse.AirItineraryPricingInfo roundtripAirItineraryPricingInfo;
    private crocusoft.com.gez.pojo.response.flight.multiCityReponse.AirItineraryPricingInfo multiAirItineraryPricingInfo;

    private List<FlightSegment> flightSegmentList;
    private List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> flighTSegmentList;

    private List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment> multiCityFlightSegment;

    public List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment> getMultiCityFlightSegment() {
        return multiCityFlightSegment;
    }

    public crocusoft.com.gez.pojo.response.flight.roundtripResponse.AirItineraryPricingInfo getRoundtripAirItineraryPricingInfo() {
        return roundtripAirItineraryPricingInfo;
    }

    public void setRoundtripAirItineraryPricingInfo(crocusoft.com.gez.pojo.response.flight.roundtripResponse.AirItineraryPricingInfo roundtripAirItineraryPricingInfo) {
        this.roundtripAirItineraryPricingInfo = roundtripAirItineraryPricingInfo;
    }

    public crocusoft.com.gez.pojo.response.flight.multiCityReponse.AirItineraryPricingInfo getMultiAirItineraryPricingInfo() {
        return multiAirItineraryPricingInfo;
    }

    public void setMultiAirItineraryPricingInfo(crocusoft.com.gez.pojo.response.flight.multiCityReponse.AirItineraryPricingInfo multiAirItineraryPricingInfo) {
        this.multiAirItineraryPricingInfo = multiAirItineraryPricingInfo;
    }

    public void setMultiCityFlightSegment(List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment> multiCityFlightSegment) {
        this.multiCityFlightSegment = multiCityFlightSegment;
    }

    public AirItineraryPricingInfo getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }

    public void setAirItineraryPricingInfo(AirItineraryPricingInfo airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }

    public List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> getFlighTSegmentList() {
        return flighTSegmentList;
    }

    public void setFlighTSegmentList(List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> flighTSegmentList) {
        this.flighTSegmentList = flighTSegmentList;
    }


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

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
                ", flightOne=" + flighTSegmentList +
                ", flightMulti=" + multiCityFlightSegment +
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
        dest.writeString(this.sequenceNumber);
        dest.writeString(this.directionId);
        dest.writeParcelable(this.optionPricingInfo, flags);
        dest.writeString(this.providerType);
        dest.writeString(this.refNumber);
        dest.writeParcelable(this.airItineraryPricingInfo, flags);
        dest.writeParcelable(this.multiAirItineraryPricingInfo, flags);
        dest.writeTypedList(this.flightSegmentList);
        dest.writeTypedList(this.flighTSegmentList);
        dest.writeTypedList(this.multiCityFlightSegment);
    }

    public OriginDestinationOptionItemViewModel() {
    }

    protected OriginDestinationOptionItemViewModel(Parcel in) {
        this.elapsedTime = in.readString();
        this.sequenceNumber = in.readString();
        this.directionId = in.readString();
        this.optionPricingInfo = in.readParcelable(OptionPricingInfo.class.getClassLoader());
        this.providerType = in.readString();
        this.refNumber = in.readString();
        this.airItineraryPricingInfo = in.readParcelable(AirItineraryPricingInfo.class.getClassLoader());
        this.multiAirItineraryPricingInfo = in.readParcelable(crocusoft.com.gez.pojo.response.flight.multiCityReponse.AirItineraryPricingInfo.class.getClassLoader());
        this.flightSegmentList = in.createTypedArrayList(FlightSegment.CREATOR);
        this.flighTSegmentList = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment.CREATOR);
        this.multiCityFlightSegment = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment.CREATOR);
    }

    public static final Creator<OriginDestinationOptionItemViewModel> CREATOR = new Creator<OriginDestinationOptionItemViewModel>() {
        @Override
        public OriginDestinationOptionItemViewModel createFromParcel(Parcel source) {
            return new OriginDestinationOptionItemViewModel(source);
        }

        @Override
        public OriginDestinationOptionItemViewModel[] newArray(int size) {
            return new OriginDestinationOptionItemViewModel[size];
        }
    };
}
