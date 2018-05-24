package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PricedItineraries{

	@JsonProperty("PricedItinerary")
	private List<PricedItineraryItem> pricedItinerary;

	@JsonProperty("PricedItineraryForOWC")
	private PricedItineraryForOWC pricedItineraryForOWC;

	@JsonProperty("FreeBaggages")
	private FreeBaggages freeBaggages;

	public PricedItineraries(List<PricedItineraryItem> pricedItinerary, PricedItineraryForOWC pricedItineraryForOWC, FreeBaggages freeBaggages) {
		this.pricedItinerary = pricedItinerary;
		this.pricedItineraryForOWC = pricedItineraryForOWC;
		this.freeBaggages = freeBaggages;
	}
	public PricedItineraries(){

	}

	public void setPricedItinerary(List<PricedItineraryItem> pricedItinerary){
		this.pricedItinerary = pricedItinerary;
	}

	public List<PricedItineraryItem> getPricedItinerary(){
		return pricedItinerary;
	}

	public void setPricedItineraryForOWC(PricedItineraryForOWC pricedItineraryForOWC){
		this.pricedItineraryForOWC = pricedItineraryForOWC;
	}

	public PricedItineraryForOWC getPricedItineraryForOWC(){
		return pricedItineraryForOWC;
	}

	public void setFreeBaggages(FreeBaggages freeBaggages){
		this.freeBaggages = freeBaggages;
	}

	public FreeBaggages getFreeBaggages(){
		return freeBaggages;
	}

	@Override
 	public String toString(){
		return 
			"PricedItineraries{" + 
			"pricedItinerary = '" + pricedItinerary + '\'' + 
			",pricedItineraryForOWC = '" + pricedItineraryForOWC + '\'' + 
			",freeBaggages = '" + freeBaggages + '\'' + 
			"}";
		}
}