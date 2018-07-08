package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OptionPricingInfo;

public class OriginDestinationOptionItem implements Parcelable{

	@SerializedName("@ElapsedTime")
	@JsonProperty("@ElapsedTime")
	private String elapsedTime;

	@JsonProperty("OptionPricingInfo")
	@SerializedName("OptionPricingInfo")
	private OptionPricingInfo optionPricingInfo;

	@SerializedName("FlightSegment")
	@JsonProperty("FlightSegment")
	private Object flightSegment;
	private List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> flightSegmentList;

	@SerializedName("@DirectionId")
	@JsonProperty("@DirectionId")
	private String directionId;

	@SerializedName("@RefNumber")
	@JsonProperty("@RefNumber")
	private String refNumber;

	public void setElapsedTime(String elapsedTime){
		this.elapsedTime = elapsedTime;
	}

	public String getElapsedTime(){
		return elapsedTime;
	}

	public Object getFlightSegment() {
		return flightSegment;
	}

	public void setFlightSegment(Object flightSegment) {
		this.flightSegment = flightSegment;
	}

	public OptionPricingInfo getOptionPricingInfo() {
		return optionPricingInfo;
	}

	public void setOptionPricingInfo(OptionPricingInfo optionPricingInfo) {
		this.optionPricingInfo = optionPricingInfo;
	}

	public List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> getFlightSegmentList() {
		return flightSegmentList;
	}

	public void setFlightSegmentList(List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> flightSegmentList) {
		this.flightSegmentList = flightSegmentList;
	}

	public void setDirectionId(String directionId){
		this.directionId = directionId;
	}

	public String getDirectionId(){
		return directionId;
	}

	public void setRefNumber(String refNumber){
		this.refNumber = refNumber;
	}

	public String getRefNumber(){
		return refNumber;
	}

	@Override
 	public String toString(){
		return 
			"OriginDestinationOptionItem{" + 
			"@ElapsedTime = '" + elapsedTime + '\'' + 
			",flightSegment = '" + flightSegment + '\'' + 
			",@DirectionId = '" + directionId + '\'' + 
			",@RefNumber = '" + refNumber + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.elapsedTime);
		dest.writeParcelable(this.optionPricingInfo, flags);
		dest.writeParcelable((Parcelable) this.flightSegment, flags);
		dest.writeTypedList(this.flightSegmentList);
		dest.writeString(this.directionId);
		dest.writeString(this.refNumber);
	}

	public OriginDestinationOptionItem() {
	}

	protected OriginDestinationOptionItem(Parcel in) {
		this.elapsedTime = in.readString();
		this.optionPricingInfo = in.readParcelable(OptionPricingInfo.class.getClassLoader());
		this.flightSegment = in.readParcelable(Object.class.getClassLoader());
		this.flightSegmentList = in.createTypedArrayList(FlightSegment.CREATOR);
		this.directionId = in.readString();
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