package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OperatingAirline implements Parcelable{

	@JsonProperty("@Code")
	@SerializedName("@Code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public OperatingAirline(String code) {
		this.code = code;
	}
	public OperatingAirline(){

	}
	@Override
 	public String toString(){
		return 
			"OperatingAirline{" + 
			"@Code = '" + code + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.code);
	}

	protected OperatingAirline(Parcel in) {
		this.code = in.readString();
	}

	public static final Creator<OperatingAirline> CREATOR = new Creator<OperatingAirline>() {
		@Override
		public OperatingAirline createFromParcel(Parcel source) {
			return new OperatingAirline(source);
		}

		@Override
		public OperatingAirline[] newArray(int size) {
			return new OperatingAirline[size];
		}
	};
}