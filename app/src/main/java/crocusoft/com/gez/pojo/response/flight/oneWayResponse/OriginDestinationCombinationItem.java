package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationCombinationItem implements Parcelable{

	@SerializedName("@CombinationID")
	@JsonProperty("@CombinationID")
	private String combinationID;

	@SerializedName("@E_TicketEligibility")
	@JsonProperty("@E_TicketEligibility")
	private String eTicketEligibility;

	@SerializedName("@ValidatingAirlineCode")
	@JsonProperty("@ValidatingAirlineCode")
	private String validatingAirlineCode;

	@SerializedName("@IndexList")
	@JsonProperty("@IndexList")
	private String indexList;

	@SerializedName("@ServiceFeeAmount")
	@JsonProperty("@ServiceFeeAmount")
	private String serviceFeeAmount;

	@SerializedName("@ForceETicket")
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
			"OriginDestinationCombinationItemViewModel{" +
			"@CombinationID = '" + combinationID + '\'' + 
			",@E_TicketEligibility = '" + eTicketEligibility + '\'' + 
			",@ValidatingAirlineCode = '" + validatingAirlineCode + '\'' + 
			",@IndexList = '" + indexList + '\'' + 
			",@ServiceFeeAmount = '" + serviceFeeAmount + '\'' + 
			",@ForceETicket = '" + forceETicket + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.combinationID);
		dest.writeString(this.eTicketEligibility);
		dest.writeString(this.validatingAirlineCode);
		dest.writeString(this.indexList);
		dest.writeString(this.serviceFeeAmount);
		dest.writeString(this.forceETicket);
	}

	protected OriginDestinationCombinationItem(Parcel in) {
		this.combinationID = in.readString();
		this.eTicketEligibility = in.readString();
		this.validatingAirlineCode = in.readString();
		this.indexList = in.readString();
		this.serviceFeeAmount = in.readString();
		this.forceETicket = in.readString();
	}

	public static final Creator<OriginDestinationCombinationItem> CREATOR = new Creator<OriginDestinationCombinationItem>() {
		@Override
		public OriginDestinationCombinationItem createFromParcel(Parcel source) {
			return new OriginDestinationCombinationItem(source);
		}

		@Override
		public OriginDestinationCombinationItem[] newArray(int size) {
			return new OriginDestinationCombinationItem[size];
		}
	};
}