package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Baggage{

	@JsonProperty("@Type")
	private String type;

	@JsonProperty("@Index")
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