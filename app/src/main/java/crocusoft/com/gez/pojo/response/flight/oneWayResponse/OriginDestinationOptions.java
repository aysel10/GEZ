package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationOptions{
	@SerializedName("OriginDestinationOption")
	@JsonProperty("OriginDestinationOption")
	private Object OriginDestinationOptionItem;
	private List<OriginDestinationOptionItem> originDestinationOption;

	public Object getOriginDestinationOptionItem() {
		return OriginDestinationOptionItem;
	}

	public void setOriginDestinationOptionItem(Object originDestinationOptionItem) {
		OriginDestinationOptionItem = originDestinationOptionItem;
	}

	public List<OriginDestinationOptionItem> getOriginDestinationOption() {
		return originDestinationOption;
	}

	public void setOriginDestinationOption(List<OriginDestinationOptionItem> originDestinationOption) {
		this.originDestinationOption = originDestinationOption;
	}

	@Override
 	public String toString(){
		return 
			"OriginDestinationOptions{" + 
			"originDestinationOption = '" + originDestinationOption + '\'' + 
			"}";
		}
}