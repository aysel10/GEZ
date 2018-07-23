package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginLocation implements Parcelable{

	@JsonProperty("@LocationCode")
	private String locationCode;

	@JsonProperty("@MultiAirportCityInd")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String multiAirportCityInd;

	public OriginLocation(String locationCode, String multiAirportCityInd) {
		this.locationCode = locationCode;
		this.multiAirportCityInd = multiAirportCityInd;
	}

	public OriginLocation(String locationCode) {
		this.locationCode = locationCode;
	}
	public  OriginLocation(){}
	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}

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
			"OriginLocation{" + 
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

	protected OriginLocation(Parcel in) {
		this.locationCode = in.readString();
		this.multiAirportCityInd = in.readString();
	}

	public static final Creator<OriginLocation> CREATOR = new Creator<OriginLocation>() {
		@Override
		public OriginLocation createFromParcel(Parcel source) {
			return new OriginLocation(source);
		}

		@Override
		public OriginLocation[] newArray(int size) {
			return new OriginLocation[size];
		}
	};
}