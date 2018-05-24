package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginDestinationInformation{

	@JsonProperty("OriginLocation")
	private OriginLocation originLocation;

	@JsonProperty("DepartureDateTime")
	private String departureDateTime;

	@JsonProperty("DestinationLocation")
	private DestinationLocation destinationLocation;

	public OriginDestinationInformation(OriginLocation originLocation, String departureDateTime, DestinationLocation destinationLocation) {
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
			"OriginDestinationInformation{" + 
			"originLocation = '" + originLocation + '\'' + 
			",departureDateTime = '" + departureDateTime + '\'' + 
			",destinationLocation = '" + destinationLocation + '\'' + 
			"}";
		}
}