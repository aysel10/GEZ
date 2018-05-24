package crocusoft.com.gez.pojo.request.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

import crocusoft.com.gez.pojo.request.defaultFlight.SearchFlight;

public class SoapBody {
    @JsonProperty("SearchFlight")
    @Expose
    private SearchFlight searchFlight;

    public SoapBody(SearchFlight searchFlight) {
        this.searchFlight = searchFlight;
    }

    public SearchFlight getSearchFlight() {
        return searchFlight;
    }

    public void setSearchFlight(SearchFlight searchFlight) {
        this.searchFlight = searchFlight;
    }
}
