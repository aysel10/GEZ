package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketDesignatorItem implements Parcelable{

	@JsonProperty("@TicketDesignatorCode")
	private String ticketDesignatorCode;

	@JsonProperty("@TicketDesignatorExtension")
	private String ticketDesignatorExtension;

	public void setTicketDesignatorCode(String ticketDesignatorCode){
		this.ticketDesignatorCode = ticketDesignatorCode;
	}

	public String getTicketDesignatorCode(){
		return ticketDesignatorCode;
	}

	public void setTicketDesignatorExtension(String ticketDesignatorExtension){
		this.ticketDesignatorExtension = ticketDesignatorExtension;
	}

	public String getTicketDesignatorExtension(){
		return ticketDesignatorExtension;
	}

	@Override
 	public String toString(){
		return 
			"TicketDesignatorItem{" + 
			"@TicketDesignatorCode = '" + ticketDesignatorCode + '\'' + 
			",@TicketDesignatorExtension = '" + ticketDesignatorExtension + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.ticketDesignatorCode);
		dest.writeString(this.ticketDesignatorExtension);
	}

	public TicketDesignatorItem() {
	}

	protected TicketDesignatorItem(Parcel in) {
		this.ticketDesignatorCode = in.readString();
		this.ticketDesignatorExtension = in.readString();
	}

	public static final Creator<TicketDesignatorItem> CREATOR = new Creator<TicketDesignatorItem>() {
		@Override
		public TicketDesignatorItem createFromParcel(Parcel source) {
			return new TicketDesignatorItem(source);
		}

		@Override
		public TicketDesignatorItem[] newArray(int size) {
			return new TicketDesignatorItem[size];
		}
	};
}