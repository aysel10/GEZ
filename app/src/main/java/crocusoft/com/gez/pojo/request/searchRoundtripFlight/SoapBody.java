package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

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
