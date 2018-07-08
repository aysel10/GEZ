package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Baggage implements Parcelable {

	@SerializedName("@Quantity")
	@JsonProperty("@Quantity")
	private String quantity;

	@SerializedName("@Unit")
	@JsonProperty("@Unit")
	private String unit;

	@SerializedName("@Index")
	@JsonProperty("@Index")
	private String index;

	@SerializedName("@Type")
	@JsonProperty("@Type")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
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
			"@Quantity = '" + quantity + '\'' + 
			",@Unit = '" + unit + '\'' + 
			",@Index = '" + index + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.quantity);
		dest.writeString(this.unit);
		dest.writeString(this.index);
	}

	public Baggage() {
	}

	protected Baggage(Parcel in) {
		this.quantity = in.readString();
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