package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalFare implements Parcelable{

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
			"TotalFare{" + 
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

	public TotalFare() {
	}

	protected TotalFare(Parcel in) {
		this.amount = in.readString();
	}

	public static final Creator<TotalFare> CREATOR = new Creator<TotalFare>() {
		@Override
		public TotalFare createFromParcel(Parcel source) {
			return new TotalFare(source);
		}

		@Override
		public TotalFare[] newArray(int size) {
			return new TotalFare[size];
		}
	};
}