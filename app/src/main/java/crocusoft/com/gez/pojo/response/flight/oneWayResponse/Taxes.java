package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxes implements Parcelable{

	@JsonProperty("Tax")
	private Tax tax;

	public void setTax(Tax tax){
		this.tax = tax;
	}

	public Tax getTax(){
		return tax;
	}

	@Override
 	public String toString(){
		return 
			"Taxes{" + 
			"tax = '" + tax + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.tax, flags);
	}

	public Taxes() {
	}

	protected Taxes(Parcel in) {
		this.tax = in.readParcelable(Tax.class.getClassLoader());
	}

	public static final Creator<Taxes> CREATOR = new Creator<Taxes>() {
		@Override
		public Taxes createFromParcel(Parcel source) {
			return new Taxes(source);
		}

		@Override
		public Taxes[] newArray(int size) {
			return new Taxes[size];
		}
	};
}