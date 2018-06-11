package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

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

	public List<FreeBaggages> getFreeBaggagesList() {
		return freeBaggagesList;
	}

	public void setFreeBaggagesList(List<FreeBaggages> freeBaggagesList) {
		this.freeBaggagesList = freeBaggagesList;
	}

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeList(this.pricedItinerary);
		dest.writeParcelable(this.freeBaggages, flags);
	}

	public PricedItineraries() {
	}

	protected PricedItineraries(Parcel in) {
		this.pricedItinerary = new ArrayList<PricedItineraryItem>();
		in.readList(this.pricedItinerary, PricedItineraryItem.class.getClassLoader());
		this.freeBaggages = in.readParcelable(FreeBaggages.class.getClassLoader());
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