package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DestinationLocation {
    @JsonProperty("@LocationCode")
    @Expose
    private String locationCode;
    @JsonProperty("@MultiAirportCityInd")
    @Expose
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String multiAirportCityInd;

    public DestinationLocation(String locationCode, String multiAirportCityInd) {
        this.locationCode = locationCode;
        this.multiAirportCityInd = multiAirportCityInd;
    }
    public DestinationLocation(){}
    public DestinationLocation(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getMultiAirportCityInd() {
        return multiAirportCityInd;
    }

    public void setMultiAirportCityInd(String multiAirportCityInd) {
        this.multiAirportCityInd = multiAirportCityInd;
    }

    @Override
    public String toString() {
        return "{" +
                "locationCode='" + locationCode + '\'' +
                ", multiAirportCityInd='" + multiAirportCityInd + '\'' +
                '}';
    }
}
