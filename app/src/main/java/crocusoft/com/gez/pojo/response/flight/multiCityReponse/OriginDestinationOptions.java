package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginDestinationOptions implements Parcelable{

	@JsonProperty("OriginDestinationOption")
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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeTypedList(this.originDestinationOption);
	}

	public OriginDestinationOptions() {
	}

	protected OriginDestinationOptions(Parcel in) {
		this.originDestinationOption = in.createTypedArrayList(OriginDestinationOptionItem.CREATOR);
	}

	public static final Creator<OriginDestinationOptions> CREATOR = new Creator<OriginDestinationOptions>() {
		@Override
		public OriginDestinationOptions createFromParcel(Parcel source) {
			return new OriginDestinationOptions(source);
		}

		@Override
		public OriginDestinationOptions[] newArray(int size) {
			return new OriginDestinationOptions[size];
		}
	};
}