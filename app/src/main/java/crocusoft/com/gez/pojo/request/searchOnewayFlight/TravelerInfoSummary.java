package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelerInfoSummary{

	@JsonProperty("AirTravelerAvail")
	private AirTravelerAvail airTravelerAvail;

	public void setAirTravelerAvail(AirTravelerAvail airTravelerAvail){
		this.airTravelerAvail = airTravelerAvail;
	}

	public AirTravelerAvail getAirTravelerAvail(){
		return airTravelerAvail;
	}

	@Override
 	public String toString(){
		return 
			"TravelerInfoSummary{" + 
			"airTravelerAvail = '" + airTravelerAvail + '\'' + 
			"}";
		}

	public TravelerInfoSummary(AirTravelerAvail airTravelerAvail) {
		this.airTravelerAvail = airTravelerAvail;
	}
}