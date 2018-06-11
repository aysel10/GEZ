package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tax implements Parcelable{

	@JsonProperty("@Amount")
	private String amount;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	@Override
 	public String toString(){
		return 
			"Tax{" + 
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

	public Tax() {
	}

	protected Tax(Parcel in) {
		this.amount = in.readString();
	}

	public static final Creator<Tax> CREATOR = new Creator<Tax>() {
		@Override
		public Tax createFromParcel(Parcel source) {
			return new Tax(source);
		}

		@Override
		public Tax[] newArray(int size) {
			return new Tax[size];
		}
	};
}