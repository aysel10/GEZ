package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;

public class PassengerFare{

	@SerializedName("TotalFare")
	private TotalFare totalFare;

	@SerializedName("Taxes")
	private Taxes taxes;

	@SerializedName("BaseFare")
	private BaseFare baseFare;

	@SerializedName("MarkupFare")
	private MarkupFare markupFare;

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