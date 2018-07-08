package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PTCFareBreakdown implements Parcelable{

	@JsonProperty("PassengerTypeQuantity")
	private PassengerTypeQuantity passengerTypeQuantity;

	@JsonProperty("TicketDesignators")
	private TicketDesignators ticketDesignators;

	@JsonProperty("PassengerFare")
	private PassengerFare passengerFare;

	public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity){
		this.passengerTypeQuantity = passengerTypeQuantity;
	}

	public PassengerTypeQuantity getPassengerTypeQuantity(){
		return passengerTypeQuantity;
	}

	public void setTicketDesignators(TicketDesignators ticketDesignators){
		this.ticketDesignators = ticketDesignators;
	}

	public TicketDesignators getTicketDesignators(){
		return ticketDesignators;
	}

	public void setPassengerFare(PassengerFare passengerFare){
		this.passengerFare = passengerFare;
	}

	public PassengerFare getPassengerFare(){
		return passengerFare;
	}

	@Override
 	public String toString(){
		return 
			"PTCFareBreakdown{" + 
			"passengerTypeQuantity = '" + passengerTypeQuantity + '\'' + 
			",ticketDesignators = '" + ticketDesignators + '\'' + 
			",passengerFare = '" + passengerFare + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.passengerTypeQuantity, flags);
		dest.writeParcelable(this.ticketDesignators, flags);
		dest.writeParcelable(this.passengerFare, flags);
	}

	public PTCFareBreakdown() {
	}

	protected PTCFareBreakdown(Parcel in) {
		this.passengerTypeQuantity = in.readParcelable(PassengerTypeQuantity.class.getClassLoader());
		this.ticketDesignators = in.readParcelable(TicketDesignators.class.getClassLoader());
		this.passengerFare = in.readParcelable(PassengerFare.class.getClassLoader());
	}

	public static final Creator<PTCFareBreakdown> CREATOR = new Creator<PTCFareBreakdown>() {
		@Override
		public PTCFareBreakdown createFromParcel(Parcel source) {
			return new PTCFareBreakdown(source);
		}

		@Override
		public PTCFareBreakdown[] newArray(int size) {
			return new PTCFareBreakdown[size];
		}
	};
}