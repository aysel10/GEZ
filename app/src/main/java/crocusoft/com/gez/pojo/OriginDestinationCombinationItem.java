package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class OriginDestinationCombinationItem{

	@SerializedName("@CombinationID")
	private String combinationID;

	@SerializedName("@E_TicketEligibility")
	private String eTicketEligibility;

	@SerializedName("@ValidatingAirlineCode")
	private String validatingAirlineCode;

	@SerializedName("@IndexList")
	private String indexList;

	@SerializedName("@ServiceFeeAmount")
	private String serviceFeeAmount;

	@SerializedName("@ForceETicket")
	private String forceETicket;

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