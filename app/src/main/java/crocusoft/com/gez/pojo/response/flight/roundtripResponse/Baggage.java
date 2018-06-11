package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Baggage implements Parcelable{

	@SerializedName("@Type")
	@JsonProperty("@Type")
	private String type;

	@SerializedName("@Unit")
	@JsonProperty("@Unit")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String unit;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@SerializedName("@Index")
	@JsonProperty("@Index")
	private String index;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setIndex(String index){
		this.index = index;
	}

	public String getIndex(){
		return index;
	}

	@Override
 	public String toString(){
		return 
			"Baggage{" + 
			"@Type = '" + type + '\'' + 
			",@Index = '" + index + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.type);
		dest.writeString(this.unit);
		dest.writeString(this.index);
	}

	public Baggage() {
	}

	protected Baggage(Parcel in) {
		this.type = in.readString();
		this.unit = in.readString();
		this.index = in.readString();
	}

	public static final Creator<Baggage> CREATOR = new Creator<Baggage>() {
		@Override
		public Baggage createFromParcel(Parcel source) {
			return new Baggage(source);
		}

		@Override
		public Baggage[] newArray(int size) {
			return new Baggage[size];
		}
	};
}