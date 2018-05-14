package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class BaggageItem{

	@SerializedName("@Quantity")
	private String quantity;

	@SerializedName("@Unit")
	private String unit;

	@SerializedName("@Index")
	private String index;

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public String getIndex(){
		return index;
	}

	@Override
 	public String toString(){
		return 
			"BaggageItem{" + 
			"@Quantity = '" + quantity + '\'' + 
			",@Unit = '" + unit + '\'' + 
			",@Index = '" + index + '\'' + 
			"}";
		}
}