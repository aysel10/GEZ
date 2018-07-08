package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoapBody{

	@JsonProperty("SearchFlight")
	private SearchFlight searchFlight;

	public void setSearchFlight(SearchFlight searchFlight){
		this.searchFlight = searchFlight;
	}

	public SearchFlight getSearchFlight(){
		return searchFlight;
	}

	public SoapBody(SearchFlight searchFlight) {
		this.searchFlight = searchFlight;
	}

	@Override
 	public String toString(){
		return 
			"SoapBody{" + 
			"searchFlight = '" + searchFlight + '\'' + 
			"}";
		}
}