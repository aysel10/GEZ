package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class OptionPricingInfo implements  Parcelable{

	@SerializedName("PTC_FareBreakdowns")
	@JsonProperty("PTC_FareBreakdowns")
	private PTCFareBreakdowns pTCFareBreakdowns;

	@SerializedName("ItinTotalFare")
	@JsonProperty("ItinTotalFare")
	private ItinTotalFare itinTotalFare;


	public OptionPricingInfo(PTCFareBreakdowns pTCFareBreakdowns, ItinTotalFare itinTotalFare) {
		this.pTCFareBreakdowns = pTCFareBreakdowns;
		this.itinTotalFare = itinTotalFare;
	}
	public OptionPricingInfo(){

	}
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
			"OptionPricingInfo{" + 
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

	protected OptionPricingInfo(Parcel in) {
		this.pTCFareBreakdowns = in.readParcelable(PTCFareBreakdowns.class.getClassLoader());
		this.itinTotalFare = in.readParcelable(ItinTotalFare.class.getClassLoader());
	}

	public static final Creator<OptionPricingInfo> CREATOR = new Creator<OptionPricingInfo>() {
		@Override
		public OptionPricingInfo createFromParcel(Parcel source) {
			return new OptionPricingInfo(source);
		}

		@Override
		public OptionPricingInfo[] newArray(int size) {
			return new OptionPricingInfo[size];
		}
	};
}