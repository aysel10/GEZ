package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class AirItinerary{

	@SerializedName("OriginDestinationOptions")
	private OriginDestinationOptions originDestinationOptions;

	@SerializedName("OriginDestinationCombinations")
	private OriginDestinationCombinations originDestinationCombinations;

	public void setOriginDestinationOptions(OriginDestinationOptions originDestinationOptions){
		this.originDestinationOptions = originDestinationOptions;
	}

	public OriginDestinationOptions getOriginDestinationOptions(){
		return originDestinationOptions;
	}

	public void setOriginDestinationCombinations(OriginDestinationCombinations originDestinationCombinations){
		this.originDestinationCombinations = originDestinationCombinations;
	}

	public OriginDestinationCombinations getOriginDestinationCombinations(){
		return originDestinationCombinations;
	}

	@Override
 	public String toString(){
		return 
			"AirItinerary{" + 
			"originDestinationOptions = '" + originDestinationOptions + '\'' + 
			",originDestinationCombinations = '" + originDestinationCombinations + '\'' + 
			"}";
		}
}