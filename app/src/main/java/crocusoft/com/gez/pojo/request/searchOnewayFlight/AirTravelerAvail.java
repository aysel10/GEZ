package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirTravelerAvail{

	@JsonProperty("PassengerTypeQuantity")
	private PassengerTypeQuantity passengerTypeQuantity;

	public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity){
		this.passengerTypeQuantity = passengerTypeQuantity;
	}

	public AirTravelerAvail(PassengerTypeQuantity passengerTypeQuantity) {
		this.passengerTypeQuantity = passengerTypeQuantity;
	}

	public PassengerTypeQuantity getPassengerTypeQuantity(){
		return passengerTypeQuantity;
	}

	@Override
 	public String toString(){
		return 
			"AirTravelerAvail{" + 
			"passengerTypeQuantity = '" + passengerTypeQuantity + '\'' + 
			"}";
		}
}