package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BaggageItem implements Parcelable{

	@SerializedName("@Quantity")
	@JsonProperty("@Quantity")
	private String quantity;

	@SerializedName("@Unit")
	@JsonProperty("@Unit")
	private String unit;

	@SerializedName("@Index")
	@JsonProperty("@Index")
	private String index;

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
			"BaggageItem{" + 
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

	public BaggageItem() {
	}

	protected BaggageItem(Parcel in) {
		this.quantity = in.readString();
		this.unit = in.readString();
		this.index = in.readString();
	}

	public static final Creator<BaggageItem> CREATOR = new Creator<BaggageItem>() {
		@Override
		public BaggageItem createFromParcel(Parcel source) {
			return new BaggageItem(source);
		}

		@Override
		public BaggageItem[] newArray(int size) {
			return new BaggageItem[size];
		}
	};
}