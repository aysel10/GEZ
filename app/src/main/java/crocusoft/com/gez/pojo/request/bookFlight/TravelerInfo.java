package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelerInfo{

	@JsonProperty("AirTraveler")
	private AirTraveler airTraveler;

	public TravelerInfo(AirTraveler airTraveler) {
		this.airTraveler = airTraveler;
	}

	public void setAirTraveler(AirTraveler airTraveler){
		this.airTraveler = airTraveler;
	}

	public AirTraveler getAirTraveler(){
		return airTraveler;
	}

	@Override
 	public String toString(){
		return 
			"TravelerInfo{" + 
			"airTraveler = '" + airTraveler + '\'' + 
			"}";
		}
}