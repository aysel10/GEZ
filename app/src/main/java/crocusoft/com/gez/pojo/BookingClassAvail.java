package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class BookingClassAvail{

	@SerializedName("@ResBookDesigCode")
	private String resBookDesigCode;

	@SerializedName("@ResBookDesigQuantity")
	private String resBookDesigQuantity;

	@SerializedName("@RPH")
	private String rPH;

	@SerializedName("@FareBasis")
	private String fareBasis;

	@SerializedName("@AvailablePTC")
	private String availablePTC;

	@SerializedName("@ResBookDesigCabinCode")
	private String resBookDesigCabinCode;

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