package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class FlightSegment implements Parcelable{

	@SerializedName("DepartureAirport")
	@JsonProperty("DepartureAirport")
	private DepartureAirport departureAirport;

	@SerializedName("@ResBookDesigCode")
	@JsonProperty("@ResBookDesigCode")
	private String resBookDesigCode;

	@SerializedName("ArrivalAirport")
	@JsonProperty("ArrivalAirport")
	private ArrivalAirport arrivalAirport;

	@SerializedName("Equipment")
	@JsonProperty("Equipment")
	private Equipment equipment;

	@SerializedName("MarketingAirline")
	@JsonProperty("MarketingAirline")
	private MarketingAirline marketingAirline;

	@SerializedName("Baggages")
	@JsonProperty("Baggages")
	private Baggages baggages;

	@JsonProperty("BookingClassAvails")
	private BookingClassAvails bookingClassAvails;

	@SerializedName("FlightDuration")
	@JsonProperty("FlightDuration")
	private String flightDuration;

	@SerializedName("@FlightNumber")
	@JsonProperty("@FlightNumber")
	private String flightNumber;

	@SerializedName("OperatingAirline")
	@JsonProperty("OperatingAirline")
	private OperatingAirline operatingAirline;

	@SerializedName("@DepartureDateTime")
	@JsonProperty("@DepartureDateTime")
	private String departureDateTime;

	@SerializedName("@ArrivalDateTime")
	@JsonProperty("@ArrivalDateTime")
	private String arrivalDateTime;

	public void setDepartureAirport(DepartureAirport departureAirport){
		this.departureAirport = departureAirport;
	}

	public DepartureAirport getDepartureAirport(){
		return departureAirport;
	}

	public void setResBookDesigCode(String resBookDesigCode){
		this.resBookDesigCode = resBookDesigCode;
	}

	public String getResBookDesigCode(){
		return resBookDesigCode;
	}

	public void setArrivalAirport(ArrivalAirport arrivalAirport){
		this.arrivalAirport = arrivalAirport;
	}

	public ArrivalAirport getArrivalAirport(){
		return arrivalAirport;
	}

	public void setEquipment(Equipment equipment){
		this.equipment = equipment;
	}

	public Equipment getEquipment(){
		return equipment;
	}

	public void setMarketingAirline(MarketingAirline marketingAirline){
		this.marketingAirline = marketingAirline;
	}

	public MarketingAirline getMarketingAirline(){
		return marketingAirline;
	}

	public void setBaggages(Baggages baggages){
		this.baggages = baggages;
	}

	public Baggages getBaggages(){
		return baggages;
	}

	public void setBookingClassAvails(BookingClassAvails bookingClassAvails){
		this.bookingClassAvails = bookingClassAvails;
	}

	public BookingClassAvails getBookingClassAvails(){
		return bookingClassAvails;
	}

	public void setFlightDuration(String flightDuration){
		this.flightDuration = flightDuration;
	}

	public String getFlightDuration(){
		return flightDuration;
	}

	public void setFlightNumber(String flightNumber){
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber(){
		return flightNumber;
	}

	public void setOperatingAirline(OperatingAirline operatingAirline){
		this.operatingAirline = operatingAirline;
	}

	public OperatingAirline getOperatingAirline(){
		return operatingAirline;
	}

	public void setDepartureDateTime(String departureDateTime){
		this.departureDateTime = departureDateTime;
	}

	public String getDepartureDateTime(){
		return departureDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime){
		this.arrivalDateTime = arrivalDateTime;
	}

	public String getArrivalDateTime(){
		return arrivalDateTime;
	}

	@Override
 	public String toString(){
		return 
			"FlightSegment{" + 
			"departureAirport = '" + departureAirport + '\'' + 
			",@ResBookDesigCode = '" + resBookDesigCode + '\'' + 
			",arrivalAirport = '" + arrivalAirport + '\'' + 
			",equipment = '" + equipment + '\'' + 
			",marketingAirline = '" + marketingAirline + '\'' + 
			",baggages = '" + baggages + '\'' + 
			",bookingClassAvails = '" + bookingClassAvails + '\'' + 
			",flightDuration = '" + flightDuration + '\'' + 
			",@FlightNumber = '" + flightNumber + '\'' + 
			",operatingAirline = '" + operatingAirline + '\'' + 
			",@DepartureDateTime = '" + departureDateTime + '\'' + 
			",@ArrivalDateTime = '" + arrivalDateTime + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.departureAirport, flags);
		dest.writeString(this.resBookDesigCode);
		dest.writeParcelable(this.arrivalAirport, flags);
		dest.writeParcelable(this.equipment, flags);
		dest.writeParcelable(this.marketingAirline, flags);
		dest.writeParcelable(this.baggages, flags);
		dest.writeParcelable(this.bookingClassAvails, flags);
		dest.writeString(this.flightDuration);
		dest.writeString(this.flightNumber);
		dest.writeParcelable(this.operatingAirline, flags);
		dest.writeString(this.departureDateTime);
		dest.writeString(this.arrivalDateTime);
	}

	public FlightSegment() {
	}

	protected FlightSegment(Parcel in) {
		this.departureAirport = in.readParcelable(DepartureAirport.class.getClassLoader());
		this.resBookDesigCode = in.readString();
		this.arrivalAirport = in.readParcelable(ArrivalAirport.class.getClassLoader());
		this.equipment = in.readParcelable(Equipment.class.getClassLoader());
		this.marketingAirline = in.readParcelable(MarketingAirline.class.getClassLoader());
		this.baggages = in.readParcelable(Baggages.class.getClassLoader());
		this.bookingClassAvails = in.readParcelable(BookingClassAvails.class.getClassLoader());
		this.flightDuration = in.readString();
		this.flightNumber = in.readString();
		this.operatingAirline = in.readParcelable(OperatingAirline.class.getClassLoader());
		this.departureDateTime = in.readString();
		this.arrivalDateTime = in.readString();
	}

	public static final Creator<FlightSegment> CREATOR = new Creator<FlightSegment>() {
		@Override
		public FlightSegment createFromParcel(Parcel source) {
			return new FlightSegment(source);
		}

		@Override
		public FlightSegment[] newArray(int size) {
			return new FlightSegment[size];
		}
	};
}