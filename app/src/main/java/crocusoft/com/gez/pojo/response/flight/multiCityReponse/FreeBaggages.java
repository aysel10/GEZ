package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FreeBaggages implements Parcelable{

	@SerializedName("Baggage")
	@JsonProperty("Baggage")
	private Object baggage;
	private List<BaggageItem>baggageItems;

	public void setBaggage(Object baggage) {
		this.baggage = baggage;
	}

	public List<BaggageItem> getBaggageItems() {
		return baggageItems;
	}

	public void setBaggageItems(List<BaggageItem> baggageItems) {
		this.baggageItems = baggageItems;
	}

	public Object getBaggage() {
		return baggage;
	}

	@Override
 	public String toString(){
		return 
			"FreeBaggages{" + 
			"baggage = '" + baggage + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable((Parcelable) this.baggage, flags);
		dest.writeTypedList(this.baggageItems);
	}

	public FreeBaggages() {
	}

	protected FreeBaggages(Parcel in) {
		this.baggage = in.readParcelable(Object.class.getClassLoader());
		this.baggageItems = in.createTypedArrayList(BaggageItem.CREATOR);
	}

	public static final Creator<FreeBaggages> CREATOR = new Creator<FreeBaggages>() {
		@Override
		public FreeBaggages createFromParcel(Parcel source) {
			return new FreeBaggages(source);
		}

		@Override
		public FreeBaggages[] newArray(int size) {
			return new FreeBaggages[size];
		}
	};
}