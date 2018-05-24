package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationCombinationItem{

	@JsonProperty("@CombinationID")
	private String combinationID;

	@JsonProperty("@E_TicketEligibility")
	private String eTicketEligibility;

	@JsonProperty("@ValidatingAirlineCode")
	private String validatingAirlineCode;

	@JsonProperty("@IndexList")
	private String indexList;

	@JsonProperty("@ServiceFeeAmount")
	private String serviceFeeAmount;

	@JsonProperty("@ForceETicket")
	private String forceETicket;

	public OriginDestinationCombinationItem(String combinationID, String eTicketEligibility, String validatingAirlineCode, String indexList, String serviceFeeAmount, String forceETicket) {
		this.combinationID = combinationID;
		this.eTicketEligibility = eTicketEligibility;
		this.validatingAirlineCode = validatingAirlineCode;
		this.indexList = indexList;
		this.serviceFeeAmount = serviceFeeAmount;
		this.forceETicket = forceETicket;
	}
	public OriginDestinationCombinationItem(){

	}

	public void setCombinationID(String combinationID){
		this.combinationID = combinationID;
	}

	public String getCombinationID(){
		return combinationID;
	}

	public void setETicketEligibility(String eTicketEligibility){
		this.eTicketEligibility = eTicketEligibility;
	}

	public String getETicketEligibility(){
		return eTicketEligibility;
	}

	public void setValidatingAirlineCode(String validatingAirlineCode){
		this.validatingAirlineCode = validatingAirlineCode;
	}

	public String getValidatingAirlineCode(){
		return validatingAirlineCode;
	}

	public void setIndexList(String indexList){
		this.indexList = indexList;
	}

	public String getIndexList(){
		return indexList;
	}

	public void setServiceFeeAmount(String serviceFeeAmount){
		this.serviceFeeAmount = serviceFeeAmount;
	}

	public String getServiceFeeAmount(){
		return serviceFeeAmount;
	}

	public void setForceETicket(String forceETicket){
		this.forceETicket = forceETicket;
	}

	public String getForceETicket(){
		return forceETicket;
	}

	@Override
 	public String toString(){
		return 
			"OriginDestinationCombinationItem{" + 
			"@CombinationID = '" + combinationID + '\'' + 
			",@E_TicketEligibility = '" + eTicketEligibility + '\'' + 
			",@ValidatingAirlineCode = '" + validatingAirlineCode + '\'' + 
			",@IndexList = '" + indexList + '\'' + 
			",@ServiceFeeAmount = '" + serviceFeeAmount + '\'' + 
			",@ForceETicket = '" + forceETicket + '\'' + 
			"}";
		}
}