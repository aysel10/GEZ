package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PricedItineraryItem{

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

	public PricedItineraryItem(AirItinerary airItinerary, String currency, String sequenceNumber, List<OriginDestinationOptionItem> customOriginDestinationOptionItemList, AirItineraryPricingInfo airItineraryPricingInfo, String providerType) {
		this.airItinerary = airItinerary;
		this.currency = currency;
		this.sequenceNumber = sequenceNumber;
		this.customOriginDestinationOptionItemList = customOriginDestinationOptionItemList;
		this.airItineraryPricingInfo = airItineraryPricingInfo;
		this.providerType = providerType;
	}
	public PricedItineraryItem(){

	}

	private List<OriginDestinationOptionItem> customOriginDestinationOptionItemList;


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