package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerTypeQuantity implements Parcelable{

	@JsonProperty("@Quantity")
	private String quantity;

	@JsonProperty("@Code")
	private String code;

	public PassengerTypeQuantity(String quantity, String code) {
		this.quantity = quantity;
		this.code = code;
	}
	public PassengerTypeQuantity(){

	}
	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"PassengerTypeQuantity{" + 
			"@Quantity = '" + quantity + '\'' + 
			",@Code = '" + code + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.quantity);
		dest.writeString(this.code);
	}

	protected PassengerTypeQuantity(Parcel in) {
		this.quantity = in.readString();
		this.code = in.readString();
	}

	public static final Creator<PassengerTypeQuantity> CREATOR = new Creator<PassengerTypeQuantity>() {
		@Override
		public PassengerTypeQuantity createFromParcel(Parcel source) {
			return new PassengerTypeQuantity(source);
		}

		@Override
		public PassengerTypeQuantity[] newArray(int size) {
			return new PassengerTypeQuantity[size];
		}
	};
}