package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class MarkupFare implements Parcelable{

	@JsonProperty("@Amount")
	private String amount;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}
	public MarkupFare(){}

	public MarkupFare(String amount) {
		this.amount = amount;
	}

	@Override
 	public String toString(){
		return 
			"MarkupFare{" + 
			"@Amount = '" + amount + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.amount);
	}

	protected MarkupFare(Parcel in) {
		this.amount = in.readString();
	}

	public static final Creator<MarkupFare> CREATOR = new Creator<MarkupFare>() {
		@Override
		public MarkupFare createFromParcel(Parcel source) {
			return new MarkupFare(source);
		}

		@Override
		public MarkupFare[] newArray(int size) {
			return new MarkupFare[size];
		}
	};
}