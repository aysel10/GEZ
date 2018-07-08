package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"recommendationID","combinationId","pOS","travelerInfo","fulfillment"})
public class OTAAirBookRQ{

	@JsonProperty("Fulfillment")
	private Fulfillment fulfillment;

	@JsonProperty("Ticketing")
	private Ticketing ticketing;

	@JsonProperty("@CombinationID")
	private String combinationID;

	@JsonProperty("POS")
	private Object pOS;

	@JsonProperty("TravelerInfo")
	private TravelerInfo travelerInfo;

	@JsonProperty("@RecommendationID")
	private String recommendationID;

	public OTAAirBookRQ(Fulfillment fulfillment, Ticketing ticketing, String combinationID, Object pOS, TravelerInfo travelerInfo, String recommendationID) {
		this.fulfillment = fulfillment;
		this.ticketing = ticketing;
		this.combinationID = combinationID;
		this.pOS = pOS;
		this.travelerInfo = travelerInfo;
		this.recommendationID = recommendationID;
	}

	public void setFulfillment(Fulfillment fulfillment){
		this.fulfillment = fulfillment;
	}

	public Fulfillment getFulfillment(){
		return fulfillment;
	}

	public void setTicketing(Ticketing ticketing){
		this.ticketing = ticketing;
	}

	public Ticketing getTicketing(){
		return ticketing;
	}

	public void setCombinationID(String combinationID){
		this.combinationID = combinationID;
	}

	public String getCombinationID(){
		return combinationID;
	}

	public void setPOS(Object pOS){
		this.pOS = pOS;
	}

	public Object getPOS(){
		return pOS;
	}

	public void setTravelerInfo(TravelerInfo travelerInfo){
		this.travelerInfo = travelerInfo;
	}

	public TravelerInfo getTravelerInfo(){
		return travelerInfo;
	}

	public void setRecommendationID(String recommendationID){
		this.recommendationID = recommendationID;
	}

	public String getRecommendationID(){
		return recommendationID;
	}

	@Override
 	public String toString(){
		return 
			"OTAAirBookRQ{" + 
			"fulfillment = '" + fulfillment + '\'' + 
			",ticketing = '" + ticketing + '\'' + 
			",@CombinationID = '" + combinationID + '\'' + 
			",pOS = '" + pOS + '\'' + 
			",travelerInfo = '" + travelerInfo + '\'' + 
			",@RecommendationID = '" + recommendationID + '\'' + 
			"}";
		}
}