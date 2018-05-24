package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.Nullable;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY,
        getterVisibility=JsonAutoDetect.Visibility.NONE,
        setterVisibility= JsonAutoDetect.Visibility.NONE,
        creatorVisibility=JsonAutoDetect.Visibility.NONE)

public class OriginLocation {

    @JsonProperty("@LocationCode")
    @Expose
    private String locationCode;

    @JsonProperty("@MultiAirportCityInd")
    @Expose
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String multiAirportCityInd;

    public OriginLocation(String locationCode, String multiAirportCityInd) {
        this.locationCode = locationCode;
        this.multiAirportCityInd = multiAirportCityInd;
    }

    public OriginLocation(String locationCode) {
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
