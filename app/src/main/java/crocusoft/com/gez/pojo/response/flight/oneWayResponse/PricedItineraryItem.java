package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PricedItineraryItem {

	@SerializedName("AirItinerary")
	@JsonProperty("AirItinerary")
	private AirItinerary airItinerary;

	@SerializedName("@Currency")
	@JsonProperty("@Currency")
	private String currency;

	@SerializedName("@SequenceNumber")
	@JsonProperty("@SequenceNumber")
	private String sequenceNumber;

	@SerializedName("AirItineraryPricingInfo")
	@JsonProperty("AirItineraryPricingInfo")
	private AirItineraryPricingInfo airItineraryPricingInfo;

	@SerializedName("@ProviderType")
	@JsonProperty("@ProviderType")
	private String providerType;


	public PricedItineraryItem(AirItinerary airItinerary, String currency, String sequenceNumber,  AirItineraryPricingInfo airItineraryPricingInfo, String providerType) {
		this.airItinerary = airItinerary;
		this.currency = currency;
		this.sequenceNumber = sequenceNumber;
		this.airItineraryPricingInfo = airItineraryPricingInfo;
		this.providerType = providerType;
	}
	public PricedItineraryItem(){

	}



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
	public String toString() {
		return "PricedItineraryItem{" +
				"airItinerary=" + airItinerary +
				", currency='" + currency + '\'' +
				", sequenceNumber='" + sequenceNumber + '\'' +
				", airItineraryPricingInfo=" + airItineraryPricingInfo +
				", providerType='" + providerType + '\'' +
				'}';
	}


}