package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class MarketingAirline implements Parcelable{

	@SerializedName("@Code")
	@JsonProperty("@Code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"MarketingAirline{" + 
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

	public MarketingAirline() {
	}

	protected MarketingAirline(Parcel in) {
		this.code = in.readString();
	}

	public static final Creator<MarketingAirline> CREATOR = new Creator<MarketingAirline>() {
		@Override
		public MarketingAirline createFromParcel(Parcel source) {
			return new MarketingAirline(source);
		}

		@Override
		public MarketingAirline[] newArray(int size) {
			return new MarketingAirline[size];
		}
	};
}