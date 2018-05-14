package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class BookingClassAvails{

	@SerializedName("BookingClassAvail")
	private BookingClassAvail bookingClassAvail;

	public void setBookingClassAvail(BookingClassAvail bookingClassAvail){
		this.bookingClassAvail = bookingClassAvail;
	}

	public BookingClassAvail getBookingClassAvail(){
		return bookingClassAvail;
	}

	@Override
 	public String toString(){
		return 
			"BookingClassAvails{" + 
			"bookingClassAvail = '" + bookingClassAvail + '\'' + 
			"}";
		}
}