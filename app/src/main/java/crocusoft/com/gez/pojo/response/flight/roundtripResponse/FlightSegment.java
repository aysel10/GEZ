package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class FlightSegment{

	@JsonProperty("DepartureAirport")

	@SerializedName("DepartureAirport")
	private DepartureAirport departureAirport;

	@SerializedName("@ResBookDesigCode")
	@JsonProperty("@ResBookDesigCode")
	private String resBookDesigCode;

	@JsonProperty("ArrivalAirport")
	@SerializedName("ArrivalAirport")
	private ArrivalAirport arrivalAirport;

	@JsonProperty("Equipment")
	@SerializedName("Equipment")
	private Equipment equipment;

	@JsonProperty("MarketingAirline")
	@SerializedName("MarketingAirline")
	private MarketingAirline marketingAirline;

	@SerializedName("Baggages")
	@JsonProperty("Baggages")
	private Baggages baggages;

	@SerializedName("BookingClassAvails")
	@JsonProperty("BookingClassAvails")
	private BookingClassAvails bookingClassAvails;

	@JsonProperty("FlightDuration")
	@SerializedName("FlightDuration")
	private String flightDuration;

	@JsonProperty("@FlightNumber")
	@SerializedName("@FlightNumber")
	private String flightNumber;

	@JsonProperty("OperatingAirline")
	@SerializedName("OperatingAirline")
	private OperatingAirline operatingAirline;

	@JsonProperty("@DepartureDateTime")
	@SerializedName("@DepartureDateTime")
	private String departureDateTime;

	@JsonProperty("@ArrivalDateTime")
	@SerializedName("@ArrivalDateTime")
	private String arrivalDateTime;

	public FlightSegment(DepartureAirport departureAirport, String resBookDesigCode, ArrivalAirport arrivalAirport, Equipment equipment, MarketingAirline marketingAirline, Baggages baggages, BookingClassAvails bookingClassAvails, String flightDuration, String flightNumber, OperatingAirline operatingAirline, String departureDateTime, String arrivalDateTime) {
		this.departureAirport = departureAirport;
		this.resBookDesigCode = resBookDesigCode;
		this.arrivalAirport = arrivalAirport;
		this.equipment = equipment;
		this.marketingAirline = marketingAirline;
		this.baggages = baggages;
		this.bookingClassAvails = bookingClassAvails;
		this.flightDuration = flightDuration;
		this.flightNumber = flightNumber;
		this.operatingAirline = operatingAirline;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
	}

	public FlightSegment() {
	}

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
}