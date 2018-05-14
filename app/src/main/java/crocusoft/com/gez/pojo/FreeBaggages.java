package crocusoft.com.gez.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FreeBaggages{

	@SerializedName("Baggage")
	private List<BaggageItem> baggage;

	public void setBaggage(List<BaggageItem> baggage){
		this.baggage = baggage;
	}

	public List<BaggageItem> getBaggage(){
		return baggage;
	}

	@Override
 	public String toString(){
		return 
			"FreeBaggages{" + 
			"baggage = '" + baggage + '\'' + 
			"}";
		}
}