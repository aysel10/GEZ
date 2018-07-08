package crocusoft.com.gez.pojo.request.bookFlight;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"addressLine","cityName","postalCode"})
public class BillingAddress{

	@JsonProperty("AddressLine")
	private List<String> addressLine;

	@JsonProperty("PostalCode")
	private String postalCode;

	@JsonProperty("CityName")
	private String cityName;

	public BillingAddress(List<String> addressLine, String postalCode, String cityName) {
		this.addressLine = addressLine;
		this.postalCode = postalCode;
		this.cityName = cityName;
	}

	public void setAddressLine(List<String> addressLine){
		this.addressLine = addressLine;
	}

	public List<String> getAddressLine(){
		return addressLine;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public String getCityName(){
		return cityName;
	}

	@Override
 	public String toString(){
		return 
			"BillingAddress{" + 
			"addressLine = '" + addressLine + '\'' + 
			",postalCode = '" + postalCode + '\'' + 
			",cityName = '" + cityName + '\'' + 
			"}";
		}
}