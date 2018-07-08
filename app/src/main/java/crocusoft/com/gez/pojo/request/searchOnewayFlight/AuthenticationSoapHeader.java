package crocusoft.com.gez.pojo.request.searchOnewayFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"xmlns", "wSUserName", "wSPassword"})

public class AuthenticationSoapHeader{

	@JsonProperty("@xmlns")
	private String xmlns;

	@JsonProperty("WSUserName")
	private String wSUserName;

	@JsonProperty("WSPassword")
	private String wSPassword;

	public void setXmlns(String xmlns){
		this.xmlns = xmlns;
	}

	public String getXmlns(){
		return xmlns;
	}
	public AuthenticationSoapHeader() {
		this.xmlns = "http://epowerv5.amadeus.com.tr/WS";
		this.wSUserName = "wsgezzaz";
		this.wSPassword = "Amadeus1!";
	}

	public void setWSUserName(String wSUserName){
		this.wSUserName = wSUserName;
	}

	public String getWSUserName(){
		return wSUserName;
	}

	public void setWSPassword(String wSPassword){
		this.wSPassword = wSPassword;
	}

	public String getWSPassword(){
		return wSPassword;
	}

	@Override
 	public String toString(){
		return 
			"AuthenticationSoapHeader{" + 
			"@xmlns = '" + xmlns + '\'' + 
			",wSUserName = '" + wSUserName + '\'' + 
			",wSPassword = '" + wSPassword + '\'' + 
			"}";
		}
}