package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class OTAAirLowFareSearchRS{

	@SerializedName("@Version")
	private String version;

	@SerializedName("PricedItineraries")
	private PricedItineraries pricedItineraries;

	@SerializedName("HasMoreResult")
	private String hasMoreResult;

	@SerializedName("Success")
	private Object success;

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