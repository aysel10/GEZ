package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PricedItineraries implements Parcelable{

	@JsonProperty("PricedItinerary")
	private List<PricedItineraryItem> pricedItinerary;

	@JsonProperty("FreeBaggages")
	private FreeBaggages freeBaggages;
	private List<FreeBaggages> freeBaggagesList;

	@JsonProperty("PricedItineraryForOWC")
	private PricedItineraryForOWC pricedItineraryForOWC;

	public PricedItineraryForOWC getPricedItineraryForOWC() {
		return pricedItineraryForOWC;
	}

	public void setPricedItineraryForOWC(PricedItineraryForOWC pricedItineraryForOWC) {
		this.pricedItineraryForOWC = pricedItineraryForOWC;
	}

	public void setPricedItinerary(List<PricedItineraryItem> pricedItinerary){
		this.pricedItinerary = pricedItinerary;
	}

	public List<PricedItineraryItem> getPricedItinerary(){
		return pricedItinerary;
	}

	public FreeBaggages getFreeBaggages() {
		return freeBaggages;
	}

	public void setFreeBaggages(FreeBaggages freeBaggages) {
		this.freeBaggages = freeBaggages;
	}

	public List<FreeBaggages> getFreeBaggagesList() {
		return freeBaggagesList;
	}

	public void setFreeBaggagesList(List<FreeBaggages> freeBaggagesList) {
		this.freeBaggagesList = freeBaggagesList;
	}

	@Override
 	public String toString(){
		return 
			"PricedItineraries{" + 
			"pricedItinerary = '" + pricedItinerary + '\'' + 
			",freeBaggages = '" + freeBaggages + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeTypedList(this.pricedItinerary);
		dest.writeParcelable(this.freeBaggages, flags);
		dest.writeTypedList(this.freeBaggagesList);
		dest.writeParcelable(this.pricedItineraryForOWC, flags);
	}

	public PricedItineraries() {
	}

	protected PricedItineraries(Parcel in) {
		this.pricedItinerary = in.createTypedArrayList(PricedItineraryItem.CREATOR);
		this.freeBaggages = in.readParcelable(FreeBaggages.class.getClassLoader());
		this.freeBaggagesList = in.createTypedArrayList(FreeBaggages.CREATOR);
		this.pricedItineraryForOWC = in.readParcelable(PricedItineraryForOWC.class.getClassLoader());
	}

	public static final Creator<PricedItineraries> CREATOR = new Creator<PricedItineraries>() {
		@Override
		public PricedItineraries createFromParcel(Parcel source) {
			return new PricedItineraries(source);
		}

		@Override
		public PricedItineraries[] newArray(int size) {
			return new PricedItineraries[size];
		}
	};
}