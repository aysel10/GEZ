package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.response.flight.defaultFlight.FreeBaggages;
import crocusoft.com.gez.pojo.response.flight.defaultFlight.PricedItineraryItem;

public class PricedItineraries{

	@JsonProperty("PricedItinerary")
	private List<PricedItineraryItem> pricedItinerary;

	@JsonProperty("FreeBaggages")
	private FreeBaggages freeBaggages;

	public void setPricedItinerary(List<PricedItineraryItem> pricedItinerary){
		this.pricedItinerary = pricedItinerary;
	}

	public List<PricedItineraryItem> getPricedItinerary(){
		return pricedItinerary;
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
			",freeBaggages = '" + freeBaggages + '\'' + 
			"}";
		}
}