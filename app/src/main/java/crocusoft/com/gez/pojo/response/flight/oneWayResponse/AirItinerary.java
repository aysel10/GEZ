package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;


public class AirItinerary {

	@SerializedName("OriginDestinationOptions")
	@JsonProperty("OriginDestinationOptions")
	private OriginDestinationOptions originDestinationOptions;

	@SerializedName("OriginDestinationCombinations")
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