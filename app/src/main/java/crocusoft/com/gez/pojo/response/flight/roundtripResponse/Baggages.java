package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Baggages implements Parcelable{

	@JsonProperty("Baggage")
	@SerializedName("Baggage")
	private Baggage baggage;
	private List<Baggage>baggageList;


	public List<Baggage> getBaggageList() {
		return baggageList;
	}

	public void setBaggageList(List<Baggage> baggageList) {
		this.baggageList = baggageList;
	}

	public void setBaggage(Baggage baggage){
		this.baggage = baggage;
	}

	public Baggage getBaggage(){
		return baggage;
	}

	public Baggages(Baggage baggage) {
		this.baggage = baggage;
	}
	public Baggages(){}
	@Override
 	public String toString(){
		return 
			"Baggages{" + 
			"baggage = '" + baggage + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.baggage, flags);
		dest.writeTypedList(this.baggageList);
	}

	protected Baggages(Parcel in) {
		this.baggage = in.readParcelable(Baggage.class.getClassLoader());
		this.baggageList = in.createTypedArrayList(Baggage.CREATOR);
	}

	public static final Creator<Baggages> CREATOR = new Creator<Baggages>() {
		@Override
		public Baggages createFromParcel(Parcel source) {
			return new Baggages(source);
		}

		@Override
		public Baggages[] newArray(int size) {
			return new Baggages[size];
		}
	};
}