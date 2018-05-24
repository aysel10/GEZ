package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;


public class OneWayOriginDestinationInformation {

	@SerializedName("OriginLocation")
	@JsonProperty("OriginLocation")
	private OriginLocation originLocation;

	@SerializedName("DepartureDateTime")
	@JsonProperty("DepartureDateTime")
	private String departureDateTime;

	@JsonProperty("DestinationLocation")
	@SerializedName("DestinationLocation")
	private DestinationLocation destinationLocation;

	public OneWayOriginDestinationInformation(OriginLocation originLocation, DestinationLocation destinationLocation, String departureDateTime) {
		this.originLocation = originLocation;
		this.departureDateTime = departureDateTime;
		this.destinationLocation = destinationLocation;
	}

	public void setOriginLocation(OriginLocation originLocation){
		this.originLocation = originLocation;
	}

	public OriginLocation getOriginLocation(){
		return originLocation;
	}

	public void setDepartureDateTime(String departureDateTime){
		this.departureDateTime = departureDateTime;
	}

	public String getDepartureDateTime(){
		return departureDateTime;
	}

	public void setDestinationLocation(DestinationLocation destinationLocation){
		this.destinationLocation = destinationLocation;
	}

	public DestinationLocation getDestinationLocation(){
		return destinationLocation;
	}

	@Override
 	public String toString(){
		return 
			"OneWayOriginDestinationInformation{" +
			"originLocation = '" + originLocation + '\'' + 
			",departureDateTime = '" + departureDateTime + '\'' + 
			",destinationLocation = '" + destinationLocation + '\'' + 
			"}";
		}
}