package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PTCFareBreakdowns implements Parcelable{

	@JsonProperty("PTC_FareBreakdown")
	private PTCFareBreakdown pTCFareBreakdown;

	public void setPTCFareBreakdown(PTCFareBreakdown pTCFareBreakdown){
		this.pTCFareBreakdown = pTCFareBreakdown;
	}

	public PTCFareBreakdown getPTCFareBreakdown(){
		return pTCFareBreakdown;
	}

	@Override
 	public String toString(){
		return 
			"PTCFareBreakdowns{" + 
			"pTC_FareBreakdown = '" + pTCFareBreakdown + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.pTCFareBreakdown, flags);
	}

	public PTCFareBreakdowns() {
	}

	protected PTCFareBreakdowns(Parcel in) {
		this.pTCFareBreakdown = in.readParcelable(PTCFareBreakdown.class.getClassLoader());
	}

	public static final Creator<PTCFareBreakdowns> CREATOR = new Creator<PTCFareBreakdowns>() {
		@Override
		public PTCFareBreakdowns createFromParcel(Parcel source) {
			return new PTCFareBreakdowns(source);
		}

		@Override
		public PTCFareBreakdowns[] newArray(int size) {
			return new PTCFareBreakdowns[size];
		}
	};
}