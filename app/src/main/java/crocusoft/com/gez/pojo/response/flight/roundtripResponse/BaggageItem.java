package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaggageItem{

	@JsonProperty("@Quantity")
	private String quantity;

	@JsonProperty("@Unit")
	private String unit;

	@JsonProperty("@Index")
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