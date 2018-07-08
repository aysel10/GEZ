package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseFare implements Parcelable{

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
			"BaseFare{" + 
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

	public BaseFare() {
	}

	protected BaseFare(Parcel in) {
		this.amount = in.readString();
	}

	public static final Creator<BaseFare> CREATOR = new Creator<BaseFare>() {
		@Override
		public BaseFare createFromParcel(Parcel source) {
			return new BaseFare(source);
		}

		@Override
		public BaseFare[] newArray(int size) {
			return new BaseFare[size];
		}
	};
}