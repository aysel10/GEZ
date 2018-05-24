package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.response.flight.defaultFlight.OriginDestinationCombinationItem;

public class OriginDestinationCombinations{

	@JsonProperty("OriginDestinationCombination")
	private Object OriginDestinationCombination;
	private List<OriginDestinationCombinationItem> originDestinationCombinationList;


	public Object getOriginDestinationCombination() {
		return OriginDestinationCombination;
	}

	public void setOriginDestinationCombination(Object originDestinationCombination) {
		OriginDestinationCombination = originDestinationCombination;
	}

	public List<OriginDestinationCombinationItem> getOriginDestinationCombinationList() {
		return originDestinationCombinationList;
	}

	public void setOriginDestinationCombinationList(List<OriginDestinationCombinationItem> originDestinationCombinationList) {
		this.originDestinationCombinationList = originDestinationCombinationList;
	}

	@Override
 	public String toString(){
		return 
			"OriginDestinationCombinations{" + 
			"originDestinationCombination = '" + originDestinationCombinationList + '\'' +
			"}";
		}
}