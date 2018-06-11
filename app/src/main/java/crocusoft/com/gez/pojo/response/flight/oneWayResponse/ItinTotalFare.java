package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItinTotalFare implements Parcelable{

	@JsonProperty("TotalFare")
	private TotalFare totalFare;

	@JsonProperty("BaseFare")
	private BaseFare baseFare;

	@JsonProperty("MarkupFare")
	private MarkupFare markupFare;


	public ItinTotalFare(TotalFare totalFare, BaseFare baseFare, MarkupFare markupFare) {
		this.totalFare = totalFare;
		this.baseFare = baseFare;
		this.markupFare = markupFare;
	}
	public ItinTotalFare(){

	}

	public void setTotalFare(TotalFare totalFare){
		this.totalFare = totalFare;
	}

	public TotalFare getTotalFare(){
		return totalFare;
	}

	public void setBaseFare(BaseFare baseFare){
		this.baseFare = baseFare;
	}

	public BaseFare getBaseFare(){
		return baseFare;
	}

	public void setMarkupFare(MarkupFare markupFare){
		this.markupFare = markupFare;
	}

	public MarkupFare getMarkupFare(){
		return markupFare;
	}

	@Override
 	public String toString(){
		return 
			"ItinTotalFare{" + 
			"totalFare = '" + totalFare + '\'' + 
			",baseFare = '" + baseFare + '\'' + 
			",markupFare = '" + markupFare + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.totalFare, flags);
		dest.writeParcelable(this.baseFare, flags);
		dest.writeParcelable(this.markupFare, flags);
	}

	protected ItinTotalFare(Parcel in) {
		this.totalFare = in.readParcelable(TotalFare.class.getClassLoader());
		this.baseFare = in.readParcelable(BaseFare.class.getClassLoader());
		this.markupFare = in.readParcelable(MarkupFare.class.getClassLoader());
	}

	public static final Creator<ItinTotalFare> CREATOR = new Creator<ItinTotalFare>() {
		@Override
		public ItinTotalFare createFromParcel(Parcel source) {
			return new ItinTotalFare(source);
		}

		@Override
		public ItinTotalFare[] newArray(int size) {
			return new ItinTotalFare[size];
		}
	};
}