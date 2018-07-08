package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class PaymentDetails{

	@JsonProperty("PaymentDetail")
	private PaymentDetail paymentDetail;

	public PaymentDetails(PaymentDetail paymentDetail) {
		this.paymentDetail = paymentDetail;
	}

	public void setPaymentDetail(PaymentDetail paymentDetail){
		this.paymentDetail = paymentDetail;
	}

	public PaymentDetail getPaymentDetail(){
		return paymentDetail;
	}

	@Override
 	public String toString(){
		return 
			"PaymentDetails{" + 
			"paymentDetail = '" + paymentDetail + '\'' + 
			"}";
		}
}