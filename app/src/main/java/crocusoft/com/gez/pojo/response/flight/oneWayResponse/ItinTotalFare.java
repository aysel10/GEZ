package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItinTotalFare{

	@JsonProperty("TotalFare")
	private TotalFare totalFare;

	@JsonProperty("BaseFare")
	private BaseFare baseFare;

	@JsonProperty("MarkupFare")
	private MarkupFare markupFare;


	public ItinTotalFare(TotalFare totalFare, BaseFare baseFare, MarkupFare markupFare) {
		this.totalFare = totalFare;
		this.baseFare = baseFare;
		this.markupFare = markupFare;
	}
	public ItinTotalFare(){

	}

	public void setTotalFare(TotalFare totalFare){
		this.totalFare = totalFare;
	}

	public TotalFare getTotalFare(){
		return totalFare;
	}

	public void setBaseFare(BaseFare baseFare){
		this.baseFare = baseFare;
	}

	public BaseFare getBaseFare(){
		return baseFare;
	}

	public void setMarkupFare(MarkupFare markupFare){
		this.markupFare = markupFare;
	}

	public MarkupFare getMarkupFare(){
		return markupFare;
	}

	@Override
 	public String toString(){
		return 
			"ItinTotalFare{" + 
			"totalFare = '" + totalFare + '\'' + 
			",baseFare = '" + baseFare + '\'' + 
			",markupFare = '" + markupFare + '\'' + 
			"}";
		}
}