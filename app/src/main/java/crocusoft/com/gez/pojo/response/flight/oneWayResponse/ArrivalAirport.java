package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

public class ArrivalAirport{

	@JsonProperty("@LocationCode")
	private String locationCode;

	@JsonProperty("@Terminal")
	@Expose
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String terminal;

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public void setLocationCode(String locationCode){
		this.locationCode = locationCode;
	}

	public String getLocationCode(){
		return locationCode;
	}

	@Override
 	public String toString(){
		return 
			"ArrivalAirport{" + 
			"@LocationCode = '" + locationCode + '\'' + 
			"}";
		}
}