package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerFare{

	@JsonProperty("TotalFare")
	private TotalFare totalFare;

	@JsonProperty("Taxes")
	private Taxes taxes;

	@JsonProperty("BaseFare")
	private BaseFare baseFare;

	@JsonProperty("MarkupFare")
	private MarkupFare markupFare;

	public PassengerFare(TotalFare totalFare, Taxes taxes, BaseFare baseFare, MarkupFare markupFare) {
		this.totalFare = totalFare;
		this.taxes = taxes;
		this.baseFare = baseFare;
		this.markupFare = markupFare;
	}
 	public PassengerFare(){

	}
	public void setTotalFare(TotalFare totalFare){
		this.totalFare = totalFare;
	}

	public TotalFare getTotalFare(){
		return totalFare;
	}

	public void setTaxes(Taxes taxes){
		this.taxes = taxes;
	}

	public Taxes getTaxes(){
		return taxes;
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
			"PassengerFare{" + 
			"totalFare = '" + totalFare + '\'' + 
			",taxes = '" + taxes + '\'' + 
			",baseFare = '" + baseFare + '\'' + 
			",markupFare = '" + markupFare + '\'' + 
			"}";
		}
}