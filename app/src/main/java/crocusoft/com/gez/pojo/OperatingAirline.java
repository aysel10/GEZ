package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class OperatingAirline{

	@SerializedName("@Code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	@Override
 	public String toString(){
		return 
			"OperatingAirline{" + 
			"@Code = '" + code + '\'' + 
			"}";
		}
}