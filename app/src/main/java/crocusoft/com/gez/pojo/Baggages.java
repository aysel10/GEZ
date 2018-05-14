package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class Baggages{

	@SerializedName("Baggage")
	private Baggage baggage;

	public void setBaggage(Baggage baggage){
		this.baggage = baggage;
	}

	public Baggage getBaggage(){
		return baggage;
	}

	@Override
 	public String toString(){
		return 
			"Baggages{" + 
			"baggage = '" + baggage + '\'' + 
			"}";
		}
}