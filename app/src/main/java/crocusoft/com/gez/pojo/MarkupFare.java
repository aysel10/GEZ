package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class MarkupFare{

	@SerializedName("@Amount")
	private String amount;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	@Override
 	public String toString(){
		return 
			"MarkupFare{" + 
			"@Amount = '" + amount + '\'' + 
			"}";
		}
}