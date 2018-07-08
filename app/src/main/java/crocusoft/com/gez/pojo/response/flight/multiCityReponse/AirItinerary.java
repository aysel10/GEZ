package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class AirItinerary implements Parcelable{

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.originDestinationOptions, flags);
		dest.writeParcelable(this.originDestinationCombinations, flags);
	}

	public AirItinerary() {
	}

	protected AirItinerary(Parcel in) {
		this.originDestinationOptions = in.readParcelable(OriginDestinationOptions.class.getClassLoader());
		this.originDestinationCombinations = in.readParcelable(OriginDestinationCombinations.class.getClassLoader());
	}

	public static final Creator<AirItinerary> CREATOR = new Creator<AirItinerary>() {
		@Override
		public AirItinerary createFromParcel(Parcel source) {
			return new AirItinerary(source);
		}

		@Override
		public AirItinerary[] newArray(int size) {
			return new AirItinerary[size];
		}
	};
}