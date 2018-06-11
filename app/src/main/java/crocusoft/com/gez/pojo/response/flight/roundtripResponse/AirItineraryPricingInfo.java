package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AirItineraryPricingInfo implements Parcelable{

	@JsonProperty("PTC_FareBreakdowns")
	private PTCFareBreakdowns pTCFareBreakdowns;

	@JsonProperty("ItinTotalFare")
	private ItinTotalFare itinTotalFare;

	public void setPTCFareBreakdowns(PTCFareBreakdowns pTCFareBreakdowns){
		this.pTCFareBreakdowns = pTCFareBreakdowns;
	}

	public PTCFareBreakdowns getPTCFareBreakdowns(){
		return pTCFareBreakdowns;
	}

	public void setItinTotalFare(ItinTotalFare itinTotalFare){
		this.itinTotalFare = itinTotalFare;
	}

	public ItinTotalFare getItinTotalFare(){
		return itinTotalFare;
	}

	@Override
 	public String toString(){
		return 
			"AirItineraryPricingInfo{" + 
			"pTC_FareBreakdowns = '" + pTCFareBreakdowns + '\'' + 
			",itinTotalFare = '" + itinTotalFare + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.pTCFareBreakdowns, flags);
		dest.writeParcelable(this.itinTotalFare, flags);
	}

	public AirItineraryPricingInfo() {
	}

	protected AirItineraryPricingInfo(Parcel in) {
		this.pTCFareBreakdowns = in.readParcelable(PTCFareBreakdowns.class.getClassLoader());
		this.itinTotalFare = in.readParcelable(ItinTotalFare.class.getClassLoader());
	}

	public static final Creator<AirItineraryPricingInfo> CREATOR = new Creator<AirItineraryPricingInfo>() {
		@Override
		public AirItineraryPricingInfo createFromParcel(Parcel source) {
			return new AirItineraryPricingInfo(source);
		}

		@Override
		public AirItineraryPricingInfo[] newArray(int size) {
			return new AirItineraryPricingInfo[size];
		}
	};
}