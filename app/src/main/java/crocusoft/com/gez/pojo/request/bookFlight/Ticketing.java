package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticketing{

	@JsonProperty("@TicketType")
	private String ticketType;

	public Ticketing(String ticketType) {
		this.ticketType = ticketType;
	}

	public void setTicketType(String ticketType){
		this.ticketType = ticketType;
	}

	public String getTicketType(){
		return ticketType;
	}

	@Override
 	public String toString(){
		return 
			"Ticketing{" + 
			"@TicketType = '" + ticketType + '\'' + 
			"}";
		}
}