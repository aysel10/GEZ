package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PricedItineraryForOWC implements Parcelable {

	@JsonProperty("AirItinerary")
	private AirItinerary airItinerary;

	@JsonProperty("@Currency")
	private String currency;

	@JsonProperty("@SequenceNumber")
	private String sequenceNumber;

	@JsonProperty("@IsOneWayCombinable")
	private String isOneWayCombinable;

	public void setAirItinerary(AirItinerary airItinerary){
		this.airItinerary = airItinerary;
	}

	public AirItinerary getAirItinerary(){
		return airItinerary;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setSequenceNumber(String sequenceNumber){
		this.sequenceNumber = sequenceNumber;
	}

	public String getSequenceNumber(){
		return sequenceNumber;
	}

	public void setIsOneWayCombinable(String isOneWayCombinable){
		this.isOneWayCombinable = isOneWayCombinable;
	}

	public String getIsOneWayCombinable(){
		return isOneWayCombinable;
	}

	@Override
 	public String toString(){
		return 
			"PricedItineraryForOWC{" + 
			"airItinerary = '" + airItinerary + '\'' + 
			",@Currency = '" + currency + '\'' + 
			",@SequenceNumber = '" + sequenceNumber + '\'' + 
			",@IsOneWayCombinable = '" + isOneWayCombinable + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.airItinerary, flags);
		dest.writeString(this.currency);
		dest.writeString(this.sequenceNumber);
		dest.writeString(this.isOneWayCombinable);
	}

	public PricedItineraryForOWC() {
	}

	protected PricedItineraryForOWC(Parcel in) {
		this.airItinerary = in.readParcelable(AirItinerary.class.getClassLoader());
		this.currency = in.readString();
		this.sequenceNumber = in.readString();
		this.isOneWayCombinable = in.readString();
	}

	public static final Creator<PricedItineraryForOWC> CREATOR = new Creator<PricedItineraryForOWC>() {
		@Override
		public PricedItineraryForOWC createFromParcel(Parcel source) {
			return new PricedItineraryForOWC(source);
		}

		@Override
		public PricedItineraryForOWC[] newArray(int size) {
			return new PricedItineraryForOWC[size];
		}
	};
}