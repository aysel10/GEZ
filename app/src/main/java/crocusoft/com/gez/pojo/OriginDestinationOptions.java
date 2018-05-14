package crocusoft.com.gez.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationOptions{

	@SerializedName("OriginDestinationOption")
	private List<OriginDestinationOptionItem> originDestinationOption;

	public void setOriginDestinationOption(List<OriginDestinationOptionItem> originDestinationOption){
		this.originDestinationOption = originDestinationOption;
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