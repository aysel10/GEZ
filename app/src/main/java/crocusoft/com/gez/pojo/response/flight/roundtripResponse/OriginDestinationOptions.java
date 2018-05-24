package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.response.flight.defaultFlight.OriginDestinationOptionItem;

public class OriginDestinationOptions{

	@JsonProperty("OriginDestinationOption")
	private List<OriginDestinationOptionItem> originDestinationOption;

	public void setOriginDestinationOption(List<OriginDestinationOptionItem> originDestinationOption){
		this.originDestinationOption = originDestinationOption;
	}

	public OriginDestinationOptions(List<OriginDestinationOptionItem> originDestinationOption) {
		this.originDestinationOption = originDestinationOption;
	}

	public OriginDestinationOptions(){

	}
	public List<OriginDestinationOptionItem> getOriginDestinationOption(){
		return originDestinationOption;
	}

	@Override
 	public String toString(){
		return 
			"OriginDestinationOptions{" + 
			"originDestinationOption = '" + originDestinationOption + '\'' + 
			"}";
		}
}