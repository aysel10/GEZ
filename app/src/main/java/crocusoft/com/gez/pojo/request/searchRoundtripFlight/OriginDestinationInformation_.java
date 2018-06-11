package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
@JsonPropertyOrder({"originLocation","destinationLocation","departureDateTime"})
public class OriginDestinationInformation_ {

    @JsonProperty("OriginLocation")
    @Expose
    private OriginLocation originLocation;
    @JsonProperty("DestinationLocation")
    @Expose
    private DestinationLocation destinationLocation;
    @JsonProperty("DepartureDateTime")
    @Expose
    private String departureDateTime;

    public OriginDestinationInformation_(OriginLocation originLocation, DestinationLocation destinationLocation, String departureDateTime) {
        this.originLocation = originLocation;
        this.destinationLocation = destinationLocation;
        this.departureDateTime = departureDateTime;
    }
    public OriginDestinationInformation_(){}

    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @Override
    public String toString() {
        return "OriginDestinationInformation_{" +
                "originLocation=" + originLocation +
                ", destinationLocation=" + destinationLocation +
                ", departureDateTime='" + departureDateTime + '\'' +
                '}';
    }
}
