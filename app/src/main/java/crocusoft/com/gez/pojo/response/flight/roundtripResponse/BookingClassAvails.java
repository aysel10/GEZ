package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class BookingClassAvails implements Parcelable{

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.bookingClassAvail, flags);
	}

	protected BookingClassAvails(Parcel in) {
		this.bookingClassAvail = in.readParcelable(BookingClassAvail.class.getClassLoader());
	}

	public static final Creator<BookingClassAvails> CREATOR = new Creator<BookingClassAvails>() {
		@Override
		public BookingClassAvails createFromParcel(Parcel source) {
			return new BookingClassAvails(source);
		}

		@Override
		public BookingClassAvails[] newArray(int size) {
			return new BookingClassAvails[size];
		}
	};
}