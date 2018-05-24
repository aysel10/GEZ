package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BookingClassAvail{

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
}