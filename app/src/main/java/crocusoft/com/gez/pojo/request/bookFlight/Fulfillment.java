package crocusoft.com.gez.pojo.request.bookFlight;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"deliveryAddress","paymentDetails","paymentText"})
public class Fulfillment{

	@JsonProperty("DeliveryAddress")
	private DeliveryAddress deliveryAddress;

	@JsonProperty("PaymentDetails")
	private PaymentDetails paymentDetails;

	@JsonProperty("PaymentText")
	private List<PaymentTextItem> paymentText;

	public Fulfillment(DeliveryAddress deliveryAddress, PaymentDetails paymentDetails, List<PaymentTextItem> paymentText) {
		this.deliveryAddress = deliveryAddress;
		this.paymentDetails = paymentDetails;
		this.paymentText = paymentText;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress){
		this.deliveryAddress = deliveryAddress;
	}

	public DeliveryAddress getDeliveryAddress(){
		return deliveryAddress;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails){
		this.paymentDetails = paymentDetails;
	}

	public PaymentDetails getPaymentDetails(){
		return paymentDetails;
	}

	public void setPaymentText(List<PaymentTextItem> paymentText){
		this.paymentText = paymentText;
	}

	public List<PaymentTextItem> getPaymentText(){
		return paymentText;
	}

	@Override
 	public String toString(){
		return 
			"Fulfillment{" + 
			"deliveryAddress = '" + deliveryAddress + '\'' + 
			",paymentDetails = '" + paymentDetails + '\'' + 
			",paymentText = '" + paymentText + '\'' + 
			"}";
		}
}