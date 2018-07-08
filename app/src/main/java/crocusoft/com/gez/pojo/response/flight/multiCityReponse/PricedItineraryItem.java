package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricedItineraryItem implements Parcelable{

	@JsonProperty("AirItinerary")
	private AirItinerary airItinerary;

	@JsonProperty("@Currency")
	private String currency;

	@JsonProperty("@SequenceNumber")
	private String sequenceNumber;

	@JsonProperty("AirItineraryPricingInfo")
	private AirItineraryPricingInfo airItineraryPricingInfo;

	@JsonProperty("@ProviderType")
	private String providerType;

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

	public void setAirItineraryPricingInfo(AirItineraryPricingInfo airItineraryPricingInfo){
		this.airItineraryPricingInfo = airItineraryPricingInfo;
	}

	public AirItineraryPricingInfo getAirItineraryPricingInfo(){
		return airItineraryPricingInfo;
	}

	public void setProviderType(String providerType){
		this.providerType = providerType;
	}

	public String getProviderType(){
		return providerType;
	}

	@Override
 	public String toString(){
		return 
			"PricedItineraryItem{" + 
			"airItinerary = '" + airItinerary + '\'' + 
			",@Currency = '" + currency + '\'' + 
			",@SequenceNumber = '" + sequenceNumber + '\'' + 
			",airItineraryPricingInfo = '" + airItineraryPricingInfo + '\'' + 
			",@ProviderType = '" + providerType + '\'' + 
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
		dest.writeParcelable(this.airItineraryPricingInfo, flags);
		dest.writeString(this.providerType);
	}

	public PricedItineraryItem() {
	}

	protected PricedItineraryItem(Parcel in) {
		this.airItinerary = in.readParcelable(AirItinerary.class.getClassLoader());
		this.currency = in.readString();
		this.sequenceNumber = in.readString();
		this.airItineraryPricingInfo = in.readParcelable(AirItineraryPricingInfo.class.getClassLoader());
		this.providerType = in.readString();
	}

	public static final Creator<PricedItineraryItem> CREATOR = new Creator<PricedItineraryItem>() {
		@Override
		public PricedItineraryItem createFromParcel(Parcel source) {
			return new PricedItineraryItem(source);
		}

		@Override
		public PricedItineraryItem[] newArray(int size) {
			return new PricedItineraryItem[size];
		}
	};
}