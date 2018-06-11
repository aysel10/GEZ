package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FreeBaggages implements Parcelable{

	@JsonProperty("Baggage")
	private List<BaggageItem> baggage;

	public void setBaggage(List<BaggageItem> baggage){
		this.baggage = baggage;
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
		dest.writeTypedList(this.baggage);
	}

	protected FreeBaggages(Parcel in) {
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