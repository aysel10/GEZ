package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class TicketDesignatorItem{

	@SerializedName("@TicketDesignatorCode")
	private String ticketDesignatorCode;

	@SerializedName("@TicketDesignatorExtension")
	private String ticketDesignatorExtension;

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