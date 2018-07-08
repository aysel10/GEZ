package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Baggages implements Parcelable{

	@SerializedName("Baggage")
	@JsonProperty("Baggage")
	private Baggage baggage;


	public void setBaggage(Baggage baggage){
		this.baggage = baggage;
	}

	public Baggage getBaggage(){
		return baggage;
	}

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
	}

	public Baggages() {
	}

	protected Baggages(Parcel in) {
		this.baggage = in.readParcelable(Baggage.class.getClassLoader());
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