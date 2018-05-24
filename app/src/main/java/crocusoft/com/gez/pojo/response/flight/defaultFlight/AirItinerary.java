package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinations;
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptions;

public class AirItinerary{

	@JsonProperty("OriginDestinationOptions")
	private OriginDestinationOptions originDestinationOptions;

	@JsonProperty("OriginDestinationCombinations")
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