package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerFare implements Parcelable{

	@JsonProperty("TotalFare")
	private TotalFare totalFare;

	@JsonProperty("Taxes")
	private Taxes taxes;

	@JsonProperty("BaseFare")
	private BaseFare baseFare;

	@JsonProperty("MarkupFare")
	private MarkupFare markupFare;

	public PassengerFare(TotalFare totalFare, Taxes taxes, BaseFare baseFare, MarkupFare markupFare) {
		this.totalFare = totalFare;
		this.taxes = taxes;
		this.baseFare = baseFare;
		this.markupFare = markupFare;
	}
 	public PassengerFare(){

	}
	public void setTotalFare(TotalFare totalFare){
		this.totalFare = totalFare;
	}

	public TotalFare getTotalFare(){
		return totalFare;
	}

	public void setTaxes(Taxes taxes){
		this.taxes = taxes;
	}

	public Taxes getTaxes(){
		return taxes;
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
			"PassengerFare{" + 
			"totalFare = '" + totalFare + '\'' + 
			",taxes = '" + taxes + '\'' + 
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
		dest.writeParcelable(this.taxes, flags);
		dest.writeParcelable(this.baseFare, flags);
		dest.writeParcelable(this.markupFare, flags);
	}

	protected PassengerFare(Parcel in) {
		this.totalFare = in.readParcelable(TotalFare.class.getClassLoader());
		this.taxes = in.readParcelable(Taxes.class.getClassLoader());
		this.baseFare = in.readParcelable(BaseFare.class.getClassLoader());
		this.markupFare = in.readParcelable(MarkupFare.class.getClassLoader());
	}

	public static final Creator<PassengerFare> CREATOR = new Creator<PassengerFare>() {
		@Override
		public PassengerFare createFromParcel(Parcel source) {
			return new PassengerFare(source);
		}

		@Override
		public PassengerFare[] newArray(int size) {
			return new PassengerFare[size];
		}
	};
}