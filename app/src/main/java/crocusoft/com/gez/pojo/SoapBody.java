package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

import crocusoft.com.gez.pojo.SearchFlightResponse;

public class SoapBody{

	@SerializedName("SearchFlightResponse")
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