package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BookingClassAvail implements Parcelable{

	@JsonProperty("@ResBookDesigCode")
	private String resBookDesigCode;

	@JsonProperty("@ResBookDesigQuantity")
	private String resBookDesigQuantity;

	@JsonProperty("@RPH")
	private String rPH;

	@JsonProperty("@FareBasis")
	private String fareBasis;

	@JsonProperty("@AvailablePTC")
	private String availablePTC;

	@JsonProperty("@ResBookDesigCabinCode")
	private String resBookDesigCabinCode;


	public BookingClassAvail(String resBookDesigCode, String resBookDesigQuantity, String rPH, String fareBasis, String availablePTC, String resBookDesigCabinCode) {
		this.resBookDesigCode = resBookDesigCode;
		this.resBookDesigQuantity = resBookDesigQuantity;
		this.rPH = rPH;
		this.fareBasis = fareBasis;
		this.availablePTC = availablePTC;
		this.resBookDesigCabinCode = resBookDesigCabinCode;
	}
	public BookingClassAvail(){}

	public void setResBookDesigCode(String resBookDesigCode){
		this.resBookDesigCode = resBookDesigCode;
	}

	public String getResBookDesigCode(){
		return resBookDesigCode;
	}

	public void setResBookDesigQuantity(String resBookDesigQuantity){
		this.resBookDesigQuantity = resBookDesigQuantity;
	}

	public String getResBookDesigQuantity(){
		return resBookDesigQuantity;
	}

	public void setRPH(String rPH){
		this.rPH = rPH;
	}

	public String getRPH(){
		return rPH;
	}

	public void setFareBasis(String fareBasis){
		this.fareBasis = fareBasis;
	}

	public String getFareBasis(){
		return fareBasis;
	}

	public void setAvailablePTC(String availablePTC){
		this.availablePTC = availablePTC;
	}

	public String getAvailablePTC(){
		return availablePTC;
	}

	public void setResBookDesigCabinCode(String resBookDesigCabinCode){
		this.resBookDesigCabinCode = resBookDesigCabinCode;
	}

	public String getResBookDesigCabinCode(){
		return resBookDesigCabinCode;
	}

	@Override
 	public String toString(){
		return 
			"BookingClassAvail{" + 
			"@ResBookDesigCode = '" + resBookDesigCode + '\'' + 
			",@ResBookDesigQuantity = '" + resBookDesigQuantity + '\'' + 
			",@RPH = '" + rPH + '\'' + 
			",@FareBasis = '" + fareBasis + '\'' + 
			",@AvailablePTC = '" + availablePTC + '\'' + 
			",@ResBookDesigCabinCode = '" + resBookDesigCabinCode + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.resBookDesigCode);
		dest.writeString(this.resBookDesigQuantity);
		dest.writeString(this.rPH);
		dest.writeString(this.fareBasis);
		dest.writeString(this.availablePTC);
		dest.writeString(this.resBookDesigCabinCode);
	}

	protected BookingClassAvail(Parcel in) {
		this.resBookDesigCode = in.readString();
		this.resBookDesigQuantity = in.readString();
		this.rPH = in.readString();
		this.fareBasis = in.readString();
		this.availablePTC = in.readString();
		this.resBookDesigCabinCode = in.readString();
	}

	public static final Creator<BookingClassAvail> CREATOR = new Creator<BookingClassAvail>() {
		@Override
		public BookingClassAvail createFromParcel(Parcel source) {
			return new BookingClassAvail(source);
		}

		@Override
		public BookingClassAvail[] newArray(int size) {
			return new BookingClassAvail[size];
		}
	};
}