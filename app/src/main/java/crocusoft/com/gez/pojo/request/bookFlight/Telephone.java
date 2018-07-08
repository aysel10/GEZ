package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"areaCityCode","countryCode","phoneNumber"})
public class Telephone{

	@JsonProperty("@PhoneNumber")
	private String phoneNumber;

	@JsonProperty("@AreaCityCode")
	private String areaCityCode;

	@JsonProperty("@CountryCode")
	private String countryCode;

	public Telephone(String phoneNumber, String areaCityCode, String countryCode) {
		this.phoneNumber = phoneNumber;
		this.areaCityCode = areaCityCode;
		this.countryCode = countryCode;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setAreaCityCode(String areaCityCode){
		this.areaCityCode = areaCityCode;
	}

	public String getAreaCityCode(){
		return areaCityCode;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	@Override
 	public String toString(){
		return 
			"Telephone{" + 
			"@PhoneNumber = '" + phoneNumber + '\'' + 
			",@AreaCityCode = '" + areaCityCode + '\'' + 
			",@CountryCode = '" + countryCode + '\'' + 
			"}";
		}
}