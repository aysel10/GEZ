package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationLocation implements Parcelable{

	@JsonProperty("@LocationCode")
	private String locationCode;

	@JsonProperty("@MultiAirportCityInd")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String multiAirportCityInd;

	public DestinationLocation(String locationCode, String multiAirportCityInd) {
		this.locationCode = locationCode;
		this.multiAirportCityInd = multiAirportCityInd;
	}

	public DestinationLocation(String locationCode) {
		this.locationCode = locationCode;
	}

	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}
	public DestinationLocation(){}
	public String getLocationCode(){
		return locationCode;
	}

	public void setMultiAirportCityInd(String multiAirportCityInd){
		this.multiAirportCityInd = multiAirportCityInd;
	}

	public String getMultiAirportCityInd(){
		return multiAirportCityInd;
	}

	@Override
 	public String toString(){
		return 
			"DestinationLocation{" + 
			"@LocationCode = '" + locationCode + '\'' + 
			",@MultiAirportCityInd = '" + multiAirportCityInd + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.locationCode);
		dest.writeString(this.multiAirportCityInd);
	}

	protected DestinationLocation(Parcel in) {
		this.locationCode = in.readString();
		this.multiAirportCityInd = in.readString();
	}

	public static final Creator<DestinationLocation> CREATOR = new Creator<DestinationLocation>() {
		@Override
		public DestinationLocation createFromParcel(Parcel source) {
			return new DestinationLocation(source);
		}

		@Override
		public DestinationLocation[] newArray(int size) {
			return new DestinationLocation[size];
		}
	};
}