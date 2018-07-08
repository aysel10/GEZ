package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"paymentType","paymentFPType","billingAddress"})
public class PaymentDetail{

	@JsonProperty("BillingAddress")
	private BillingAddress billingAddress;

	@JsonProperty("@PaymentType")
	private String paymentType;

	@JsonProperty("@PaymentFPType")
	private String paymentFPType;

	public PaymentDetail(BillingAddress billingAddress, String paymentType, String paymentFPType) {
		this.billingAddress = billingAddress;
		this.paymentType = paymentType;
		this.paymentFPType = paymentFPType;
	}

	public void setBillingAddress(BillingAddress billingAddress){
		this.billingAddress = billingAddress;
	}

	public BillingAddress getBillingAddress(){
		return billingAddress;
	}

	public void setPaymentType(String paymentType){
		this.paymentType = paymentType;
	}

	public String getPaymentType(){
		return paymentType;
	}

	public void setPaymentFPType(String paymentFPType){
		this.paymentFPType = paymentFPType;
	}

	public String getPaymentFPType(){
		return paymentFPType;
	}

	@Override
 	public String toString(){
		return 
			"PaymentDetail{" + 
			"billingAddress = '" + billingAddress + '\'' + 
			",@PaymentType = '" + paymentType + '\'' + 
			",@PaymentFPType = '" + paymentFPType + '\'' + 
			"}";
		}
}