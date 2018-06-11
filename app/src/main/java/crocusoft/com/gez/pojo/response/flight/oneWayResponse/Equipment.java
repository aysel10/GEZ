package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Equipment implements Parcelable{

	@JsonProperty("@AirEquipType")
	@SerializedName("@AirEquipType")
	private String airEquipType;

	public void setAirEquipType(String airEquipType){
		this.airEquipType = airEquipType;
	}

	public String getAirEquipType(){
		return airEquipType;
	}

	public Equipment(String airEquipType) {
		this.airEquipType = airEquipType;
	}
	public Equipment(){}
	@Override
 	public String toString(){
		return 
			"Equipment{" + 
			"@AirEquipType = '" + airEquipType + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.airEquipType);
	}

	protected Equipment(Parcel in) {
		this.airEquipType = in.readString();
	}

	public static final Creator<Equipment> CREATOR = new Creator<Equipment>() {
		@Override
		public Equipment createFromParcel(Parcel source) {
			return new Equipment(source);
		}

		@Override
		public Equipment[] newArray(int size) {
			return new Equipment[size];
		}
	};
}