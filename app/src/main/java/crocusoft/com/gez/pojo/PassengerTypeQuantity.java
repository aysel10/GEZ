package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class PassengerTypeQuantity{

	@SerializedName("@Quantity")
	private String quantity;

	@SerializedName("@Code")
	private String code;

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"PassengerTypeQuantity{" + 
			"@Quantity = '" + quantity + '\'' + 
			",@Code = '" + code + '\'' + 
			"}";
		}
}