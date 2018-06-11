package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;


public class PricedItineraries implements Parcelable{

	@JsonProperty("PricedItinerary")
	private List<PricedItineraryItem> pricedItinerary;

	@JsonProperty("PricedItineraryForOWC")
	private PricedItineraryForOWC pricedItineraryForOWC;

	@SerializedName("FreeBaggages")
	@JsonProperty("FreeBaggages")
	private FreeBaggages freeBaggages;
	private List<FreeBaggages> freeBaggagesList;


	public List<FreeBaggages> getFreeBaggagesList() {
		return freeBaggagesList;
	}

	public void setFreeBaggagesList(List<FreeBaggages> freeBaggagesList) {
		this.freeBaggagesList = freeBaggagesList;
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


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeTypedList(this.pricedItinerary);
		dest.writeParcelable(this.pricedItineraryForOWC, flags);
		dest.writeParcelable(this.freeBaggages, flags);
		dest.writeTypedList(this.freeBaggagesList);
	}

	protected PricedItineraries(Parcel in) {
		this.pricedItinerary = in.createTypedArrayList(PricedItineraryItem.CREATOR);
		this.pricedItineraryForOWC = in.readParcelable(PricedItineraryForOWC.class.getClassLoader());
		this.freeBaggages = in.readParcelable(FreeBaggages.class.getClassLoader());
		this.freeBaggagesList = in.createTypedArrayList(FreeBaggages.CREATOR);
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