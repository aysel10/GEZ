package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PTCFareBreakdown{

	@JsonProperty("PassengerTypeQuantity")
	private PassengerTypeQuantity passengerTypeQuantity;

	@JsonProperty("TicketDesignators")
	private TicketDesignators ticketDesignators;

	@JsonProperty("PassengerFare")
	private PassengerFare passengerFare;

	public PTCFareBreakdown(PassengerTypeQuantity passengerTypeQuantity, TicketDesignators ticketDesignators, PassengerFare passengerFare) {
		this.passengerTypeQuantity = passengerTypeQuantity;
		this.ticketDesignators = ticketDesignators;
		this.passengerFare = passengerFare;
	}
	public PTCFareBreakdown(){

	}

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
}