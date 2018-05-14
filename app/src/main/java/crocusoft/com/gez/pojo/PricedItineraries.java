package crocusoft.com.gez.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PricedItineraries{

	@SerializedName("PricedItinerary")
	private List<PricedItineraryItem> pricedItinerary;

	@SerializedName("PricedItineraryForOWC")
	private PricedItineraryForOWC pricedItineraryForOWC;

	@SerializedName("FreeBaggages")
	private FreeBaggages freeBaggages;

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