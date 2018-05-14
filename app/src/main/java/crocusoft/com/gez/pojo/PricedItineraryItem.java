package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PricedItineraryItem{

	@SerializedName("AirItinerary")
	private AirItinerary airItinerary;

	@SerializedName("@Currency")
	private String currency;

	@SerializedName("@SequenceNumber")
	private String sequenceNumber;

	private List<OriginDestinationOptionItem> customOriginDestinationOptionItemList;

	@SerializedName("AirItineraryPricingInfo")
	private AirItineraryPricingInfo airItineraryPricingInfo;

	@SerializedName("@ProviderType")
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

	public List<OriginDestinationOptionItem> getCustomOriginDestinationOptionItemList() {
		return customOriginDestinationOptionItemList;
	}

	public void setCustomOriginDestinationOptionItemList(List<OriginDestinationOptionItem> customOriginDestinationOptionItemList) {
		this.customOriginDestinationOptionItemList = customOriginDestinationOptionItemList;
	}

	@Override
	public String toString() {
		return "PricedItineraryItem{" +
				"airItinerary=" + airItinerary +
				", currency='" + currency + '\'' +
				", sequenceNumber='" + sequenceNumber + '\'' +
				", customOriginDestinationOptionItemList=" + customOriginDestinationOptionItemList +
				", airItineraryPricingInfo=" + airItineraryPricingInfo +
				", providerType='" + providerType + '\'' +
				'}';
	}
}