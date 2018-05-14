package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class Baggage{

	@SerializedName("@Type")
	private String type;

	@SerializedName("@Index")
	private String index;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
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
			"Baggage{" + 
			"@Type = '" + type + '\'' + 
			",@Index = '" + index + '\'' + 
			"}";
		}
}