package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class Taxes{

	@SerializedName("Tax")
	private Tax tax;

	public void setTax(Tax tax){
		this.tax = tax;
	}

	public Tax getTax(){
		return tax;
	}

	@Override
 	public String toString(){
		return 
			"Taxes{" + 
			"tax = '" + tax + '\'' + 
			"}";
		}
}