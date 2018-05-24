package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BookingClassAvails{

	@JsonProperty("BookingClassAvail")
	@SerializedName("BookingClassAvail")
	private BookingClassAvail bookingClassAvail;

	public void setBookingClassAvail(BookingClassAvail bookingClassAvail){
		this.bookingClassAvail = bookingClassAvail;
	}

	public BookingClassAvail getBookingClassAvail(){
		return bookingClassAvail;
	}

	public BookingClassAvails(BookingClassAvail bookingClassAvail) {
		this.bookingClassAvail = bookingClassAvail;
	}
	public BookingClassAvails(){}
	@Override
 	public String toString(){
		return 
			"BookingClassAvails{" + 
			"bookingClassAvail = '" + bookingClassAvail + '\'' + 
			"}";
		}
}