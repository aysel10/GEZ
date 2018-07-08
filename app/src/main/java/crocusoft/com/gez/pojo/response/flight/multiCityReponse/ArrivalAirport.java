package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ArrivalAirport implements Parcelable{

	@SerializedName("@Terminal")
	@JsonProperty("@Terminal")
	private String terminal;

	@SerializedName("@LocationCode")
	@JsonProperty("@LocationCode")
	private String locationCode;

	public void setTerminal(String terminal){
		this.terminal = terminal;
	}

	public String getTerminal(){
		return terminal;
	}

	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}

	public String getLocationCode(){
		return locationCode;
	}

	@Override
 	public String toString(){
		return 
			"ArrivalAirport{" + 
			"@Terminal = '" + terminal + '\'' + 
			",@LocationCode = '" + locationCode + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.terminal);
		dest.writeString(this.locationCode);
	}

	public ArrivalAirport() {
	}

	protected ArrivalAirport(Parcel in) {
		this.terminal = in.readString();
		this.locationCode = in.readString();
	}

	public static final Creator<ArrivalAirport> CREATOR = new Creator<ArrivalAirport>() {
		@Override
		public ArrivalAirport createFromParcel(Parcel source) {
			return new ArrivalAirport(source);
		}

		@Override
		public ArrivalAirport[] newArray(int size) {
			return new ArrivalAirport[size];
		}
	};
}