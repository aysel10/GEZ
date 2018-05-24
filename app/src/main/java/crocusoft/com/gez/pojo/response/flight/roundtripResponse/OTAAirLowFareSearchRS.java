package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OTAAirLowFareSearchRS{

	@JsonProperty("@Version")
	private String version;

	@JsonProperty("PricedItineraries")
	private PricedItineraries pricedItineraries;

	@JsonProperty("HasMoreResult")
	private String hasMoreResult;

	@JsonProperty("Success")
	private Object success;

	public OTAAirLowFareSearchRS(String version, PricedItineraries pricedItineraries, String hasMoreResult, Object success) {
		this.version = version;
		this.pricedItineraries = pricedItineraries;
		this.hasMoreResult = hasMoreResult;
		this.success = success;
	}
	public OTAAirLowFareSearchRS(){

	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setPricedItineraries(PricedItineraries pricedItineraries){
		this.pricedItineraries = pricedItineraries;
	}

	public PricedItineraries getPricedItineraries(){
		return pricedItineraries;
	}

	public void setHasMoreResult(String hasMoreResult){
		this.hasMoreResult = hasMoreResult;
	}

	public String getHasMoreResult(){
		return hasMoreResult;
	}

	public void setSuccess(Object success){
		this.success = success;
	}

	public Object getSuccess(){
		return success;
	}

	@Override
 	public String toString(){
		return 
			"OTAAirLowFareSearchRS{" + 
			"@Version = '" + version + '\'' + 
			",pricedItineraries = '" + pricedItineraries + '\'' + 
			",hasMoreResult = '" + hasMoreResult + '\'' + 
			",success = '" + success + '\'' + 
			"}";
		}
}