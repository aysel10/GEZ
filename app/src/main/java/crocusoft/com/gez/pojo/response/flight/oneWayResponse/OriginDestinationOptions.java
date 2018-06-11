package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationOptions{


	@SerializedName("OriginDestinationOption")
	@JsonProperty("OriginDestinationOption")
	private Object originDeationationOption;

	private List<OriginDestinationOptionItem> originDestinationOption;
	public Object getOriginDeationationOption() {
		return originDeationationOption;
	}

	public void setOriginDeationationOption(Object originDeationationOption) {
		this.originDeationationOption = originDeationationOption;
	}
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