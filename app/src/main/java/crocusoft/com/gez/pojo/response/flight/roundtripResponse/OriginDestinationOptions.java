package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
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
		dest.writeList(this.originDestinationOption);
	}

	public OriginDestinationOptions() {
	}

	protected OriginDestinationOptions(Parcel in) {
		this.originDestinationOption = new ArrayList<OriginDestinationOptionItem>();
		in.readList(this.originDestinationOption, OriginDestinationOptionItem.class.getClassLoader());
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