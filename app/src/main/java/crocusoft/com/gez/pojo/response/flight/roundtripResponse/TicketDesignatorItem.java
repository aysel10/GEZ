package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketDesignatorItem{

	@JsonProperty("@TicketDesignatorCode")
	private String ticketDesignatorCode;

	@JsonProperty("@TicketDesignatorExtension")
	private String ticketDesignatorExtension;

	public TicketDesignatorItem(String ticketDesignatorCode, String ticketDesignatorExtension) {
		this.ticketDesignatorCode = ticketDesignatorCode;
		this.ticketDesignatorExtension = ticketDesignatorExtension;
	}
	public TicketDesignatorItem(){

	}

	public void setTicketDesignatorCode(String ticketDesignatorCode){
		this.ticketDesignatorCode = ticketDesignatorCode;
	}

	public String getTicketDesignatorCode(){
		return ticketDesignatorCode;
	}

	public void setTicketDesignatorExtension(String ticketDesignatorExtension){
		this.ticketDesignatorExtension = ticketDesignatorExtension;
	}

	public String getTicketDesignatorExtension(){
		return ticketDesignatorExtension;
	}

	@Override
 	public String toString(){
		return 
			"TicketDesignatorItem{" + 
			"@TicketDesignatorCode = '" + ticketDesignatorCode + '\'' + 
			",@TicketDesignatorExtension = '" + ticketDesignatorExtension + '\'' + 
			"}";
		}
}