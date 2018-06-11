package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchFlightResponse implements Parcelable{

	@JsonProperty("@xmlns")
	private String xmlns;

	@JsonProperty("OTA_AirLowFareSearchRS")
	private OTAAirLowFareSearchRS oTAAirLowFareSearchRS;

	public SearchFlightResponse(String xmlns, OTAAirLowFareSearchRS oTAAirLowFareSearchRS) {
		this.xmlns = xmlns;
		this.oTAAirLowFareSearchRS = oTAAirLowFareSearchRS;
	}
	public SearchFlightResponse(){

	}

	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}

	public String getXmlns(){
		return xmlns;
	}

	public void setOTAAirLowFareSearchRS(OTAAirLowFareSearchRS oTAAirLowFareSearchRS){
		this.oTAAirLowFareSearchRS = oTAAirLowFareSearchRS;
	}

	public OTAAirLowFareSearchRS getOTAAirLowFareSearchRS(){
		return oTAAirLowFareSearchRS;
	}

	@Override
 	public String toString(){
		return 
			"SearchFlightResponse{" + 
			"@xmlns = '" + xmlns + '\'' + 
			",oTA_AirLowFareSearchRS = '" + oTAAirLowFareSearchRS + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.xmlns);
		dest.writeParcelable(this.oTAAirLowFareSearchRS, flags);
	}

	protected SearchFlightResponse(Parcel in) {
		this.xmlns = in.readString();
		this.oTAAirLowFareSearchRS = in.readParcelable(OTAAirLowFareSearchRS.class.getClassLoader());
	}

	public static final Creator<SearchFlightResponse> CREATOR = new Creator<SearchFlightResponse>() {
		@Override
		public SearchFlightResponse createFromParcel(Parcel source) {
			return new SearchFlightResponse(source);
		}

		@Override
		public SearchFlightResponse[] newArray(int size) {
			return new SearchFlightResponse[size];
		}
	};
}