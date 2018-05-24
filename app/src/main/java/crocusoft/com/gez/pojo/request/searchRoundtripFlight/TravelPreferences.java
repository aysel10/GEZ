package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TravelPreferences {
    @JsonProperty("CabinPref")
    @Expose
    private CabinPref cabinPref;

    public TravelPreferences(CabinPref cabinPref) {
        this.cabinPref = cabinPref;
    }

    public CabinPref getCabinPref() {
        return cabinPref;
    }

    public void setCabinPref(CabinPref cabinPref) {
        this.cabinPref = cabinPref;
    }
}
