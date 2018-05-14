package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class PricedItineraryForOWC{

	@SerializedName("AirItinerary")
	private AirItinerary airItinerary;

	@SerializedName("@Currency")
	private String currency;

	@SerializedName("@SequenceNumber")
	private String sequenceNumber;

	@SerializedName("@IsOneWayCombinable")
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
}