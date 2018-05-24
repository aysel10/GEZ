package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.response.flight.defaultFlight.AirItinerary;

public class PricedItineraryForOWC{

	@JsonProperty("AirItinerary")
	private AirItinerary airItinerary;

	@JsonProperty("@Currency")
	private String currency;

	@JsonProperty("@SequenceNumber")
	private String sequenceNumber;

	@JsonProperty("@IsOneWayCombinable")
	private String isOneWayCombinable;

	public PricedItineraryForOWC(AirItinerary airItinerary, String currency, String sequenceNumber, String isOneWayCombinable) {
		this.airItinerary = airItinerary;
		this.currency = currency;
		this.sequenceNumber = sequenceNumber;
		this.isOneWayCombinable = isOneWayCombinable;
	}
	public PricedItineraryForOWC(){

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