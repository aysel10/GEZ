package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class PTCFareBreakdown{

	@SerializedName("PassengerTypeQuantity")
	private PassengerTypeQuantity passengerTypeQuantity;

	@SerializedName("TicketDesignators")
	private TicketDesignators ticketDesignators;

	@SerializedName("PassengerFare")
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
}