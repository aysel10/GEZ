package crocusoft.com.gez.pojo.request.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

import crocusoft.com.gez.pojo.request.defaultFlight.AirTravelerAvail;

public class TravelerInfoSummary{

	@JsonProperty("AirTravelerAvail")
	private AirTravelerAvail airTravelerAvail;

	public void setAirTravelerAvail(AirTravelerAvail airTravelerAvail){
		this.airTravelerAvail = airTravelerAvail;
	}

	public TravelerInfoSummary(AirTravelerAvail airTravelerAvail) {
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
}