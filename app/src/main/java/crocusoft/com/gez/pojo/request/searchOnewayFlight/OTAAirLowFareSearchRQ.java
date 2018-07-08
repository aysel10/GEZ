package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"providerType","refundableType","xmlnsXsi","xmlnsXsd","version","maxPrice"})

public class OTAAirLowFareSearchRQ{

	@JsonProperty("@Version")
	private String version;

	@JsonProperty("@MaxPrice")
	private String maxPrice;

	@JsonProperty("OriginDestinationInformation")
	private OriginDestinationInformation originDestinationInformation;

	@JsonProperty("TravelerInfoSummary")
	private TravelerInfoSummary travelerInfoSummary;

	@JsonProperty("@xmlns:xsi")
	private String xmlnsXsi;

	@JsonProperty("@ProviderType")
	private String providerType;

	@JsonProperty("@RefundableType")
	private String refundableType;

	@JsonProperty("@xmlns:xsd")
	private String xmlnsXsd;

	public OTAAirLowFareSearchRQ(OriginDestinationInformation originDestinationInformation, TravelerInfoSummary travelerInfoSummary) {
		this.originDestinationInformation = originDestinationInformation;
		this.travelerInfoSummary = travelerInfoSummary;
		this.providerType = "OnlyAmadeus";
		this.refundableType = "AllFlights";
		this.version = "0";
		this.maxPrice = "2000";
		this.xmlnsXsi = "http://www.w3.org/2001/XMLSchema-instance";
		this.xmlnsXsd = "http://www.w3.org/2001/XMLSchema";
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setMaxPrice(String maxPrice){
		this.maxPrice = maxPrice;
	}

	public String getMaxPrice(){
		return maxPrice;
	}

	public void setOriginDestinationInformation(OriginDestinationInformation originDestinationInformation){
		this.originDestinationInformation = originDestinationInformation;
	}

	public OriginDestinationInformation getOriginDestinationInformation(){
		return originDestinationInformation;
	}

	public void setTravelerInfoSummary(TravelerInfoSummary travelerInfoSummary){
		this.travelerInfoSummary = travelerInfoSummary;
	}

	public TravelerInfoSummary getTravelerInfoSummary(){
		return travelerInfoSummary;
	}

	public void setXmlnsXsi(String xmlnsXsi){
		this.xmlnsXsi = xmlnsXsi;
	}

	public String getXmlnsXsi(){
		return xmlnsXsi;
	}

	public void setProviderType(String providerType){
		this.providerType = providerType;
	}

	public String getProviderType(){
		return providerType;
	}

	public void setRefundableType(String refundableType){
		this.refundableType = refundableType;
	}

	public String getRefundableType(){
		return refundableType;
	}

	public void setXmlnsXsd(String xmlnsXsd){
		this.xmlnsXsd = xmlnsXsd;
	}

	public String getXmlnsXsd(){
		return xmlnsXsd;
	}

	@Override
 	public String toString(){
		return 
			"OTAAirLowFareSearchRQ{" + 
			"@Version = '" + version + '\'' + 
			",@MaxPrice = '" + maxPrice + '\'' + 
			",originDestinationInformation = '" + originDestinationInformation + '\'' + 
			",travelerInfoSummary = '" + travelerInfoSummary + '\'' + 
			",@xmlns:xsi = '" + xmlnsXsi + '\'' + 
			",@ProviderType = '" + providerType + '\'' + 
			",@RefundableType = '" + refundableType + '\'' + 
			",@xmlns:xsd = '" + xmlnsXsd + '\'' + 
			"}";
		}
}