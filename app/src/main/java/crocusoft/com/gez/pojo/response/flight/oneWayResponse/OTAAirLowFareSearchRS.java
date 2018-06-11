package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OTAAirLowFareSearchRS implements Parcelable{

	@JsonProperty("@Version")
	private String version;

	@JsonProperty("PricedItineraries")
	private PricedItineraries pricedItineraries;

	@JsonProperty("HasMoreResult")
	private String hasMoreResult;

	@JsonProperty("Success")
	private Object success;

	public OTAAirLowFareSearchRS(String version, PricedItineraries pricedItineraries, String hasMoreResult, Object success) {
		this.version = version;
		this.pricedItineraries = pricedItineraries;
		this.hasMoreResult = hasMoreResult;
		this.success = success;
	}
	public OTAAirLowFareSearchRS(){

	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setPricedItineraries(PricedItineraries pricedItineraries){
		this.pricedItineraries = pricedItineraries;
	}

	public PricedItineraries getPricedItineraries(){
		return pricedItineraries;
	}

	public void setHasMoreResult(String hasMoreResult){
		this.hasMoreResult = hasMoreResult;
	}

	public String getHasMoreResult(){
		return hasMoreResult;
	}

	public void setSuccess(Object success){
		this.success = success;
	}

	public Object getSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"OTAAirLowFareSearchRS{" + 
			"@Version = '" + version + '\'' + 
			",pricedItineraries = '" + pricedItineraries + '\'' + 
			",hasMoreResult = '" + hasMoreResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.version);
		dest.writeParcelable(this.pricedItineraries, flags);
		dest.writeString(this.hasMoreResult);
		dest.writeParcelable((Parcelable) this.success, flags);
	}

	private OTAAirLowFareSearchRS(Parcel in) {
		this.version = in.readString();
		this.pricedItineraries = in.readParcelable(PricedItineraries.class.getClassLoader());
		this.hasMoreResult = in.readString();
		this.success = in.readParcelable(Object.class.getClassLoader());
	}

	public static final Creator<OTAAirLowFareSearchRS> CREATOR = new Creator<OTAAirLowFareSearchRS>() {
		@Override
		public OTAAirLowFareSearchRS createFromParcel(Parcel source) {
			return new OTAAirLowFareSearchRS(source);
		}

		@Override
		public OTAAirLowFareSearchRS[] newArray(int size) {
			return new OTAAirLowFareSearchRS[size];
		}
	};
}