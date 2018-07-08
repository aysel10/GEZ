package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoapBody implements Parcelable{

	@JsonProperty("SearchFlightResponse")
	private SearchFlightResponse searchFlightResponse;

	public void setSearchFlightResponse(SearchFlightResponse searchFlightResponse){
		this.searchFlightResponse = searchFlightResponse;
	}

	public SearchFlightResponse getSearchFlightResponse(){
		return searchFlightResponse;
	}

	@Override
 	public String toString(){
		return 
			"SoapBody{" + 
			"searchFlightResponse = '" + searchFlightResponse + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.searchFlightResponse, flags);
	}

	public SoapBody() {
	}

	protected SoapBody(Parcel in) {
		this.searchFlightResponse = in.readParcelable(SearchFlightResponse.class.getClassLoader());
	}

	public static final Creator<SoapBody> CREATOR = new Creator<SoapBody>() {
		@Override
		public SoapBody createFromParcel(Parcel source) {
			return new SoapBody(source);
		}

		@Override
		public SoapBody[] newArray(int size) {
			return new SoapBody[size];
		}
	};
}