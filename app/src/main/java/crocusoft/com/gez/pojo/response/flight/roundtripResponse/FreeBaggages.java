package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FreeBaggages implements Parcelable{

	@SerializedName("Baggage")
	@JsonProperty("Baggage")
	private Object baggageItem;
	private List<BaggageItem> baggage;



	public void setBaggage(List<BaggageItem> baggage){
		this.baggage = baggage;
	}

	public Object getBaggageItem() {
		return baggageItem;
	}

	public void setBaggageItem(Object baggageItem) {
		this.baggageItem = baggageItem;
	}

	public List<BaggageItem> getBaggage(){
		return baggage;
	}
	public FreeBaggages(){}
	public FreeBaggages(List<BaggageItem> baggage) {
		this.baggage = baggage;
	}

	@Override
 	public String toString(){
		return 
			"OneWayFreeBaggages{" +
			"baggage = '" + baggage + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable((Parcelable) this.baggageItem, flags);
		dest.writeTypedList(this.baggage);
	}

	protected FreeBaggages(Parcel in) {
		this.baggageItem = in.readParcelable(BaggageItem.class.getClassLoader());
		this.baggage = in.createTypedArrayList(BaggageItem.CREATOR);
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