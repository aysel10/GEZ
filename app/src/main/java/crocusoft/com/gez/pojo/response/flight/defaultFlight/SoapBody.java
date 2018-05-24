package crocusoft.com.gez.pojo.response.flight.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.response.flight.oneWayResponse.SearchFlightResponse;

public class SoapBody{

	@JsonProperty("SearchFlightResponse")
	private SearchFlightResponse searchFlightResponse;

	public void setSearchFlightResponse(SearchFlightResponse searchFlightResponse){
		this.searchFlightResponse = searchFlightResponse;
	}

	public SearchFlightResponse getSearchFlightResponse(){
		return searchFlightResponse;
	}

	@Override
 	public String toString(){
		return 
			"SoapBody{" + 
			"searchFlightResponse = '" + searchFlightResponse + '\'' + 
			"}";
		}
}