package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArrivalAirport implements Parcelable{

	@SerializedName("@LocationCode")
	@JsonProperty("@LocationCode")
	private String locationCode;

	@SerializedName("@Terminal")
	@JsonProperty("@Terminal")
	@Expose
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String terminal;

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
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
			"@LocationCode = '" + locationCode + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.locationCode);
		dest.writeString(this.terminal);
	}

	public ArrivalAirport() {
	}

	protected ArrivalAirport(Parcel in) {
		this.locationCode = in.readString();
		this.terminal = in.readString();
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