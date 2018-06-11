package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoapHeader{

	@JsonProperty("AuthenticationSoapHeader")
	private AuthenticationSoapHeader authenticationSoapHeader;

	public void setAuthenticationSoapHeader(AuthenticationSoapHeader authenticationSoapHeader){
		this.authenticationSoapHeader = authenticationSoapHeader;
	}

	public SoapHeader(AuthenticationSoapHeader authenticationSoapHeader) {
		this.authenticationSoapHeader = authenticationSoapHeader;
	}

	public AuthenticationSoapHeader getAuthenticationSoapHeader(){
		return authenticationSoapHeader;
	}

	@Override
 	public String toString(){
		return 
			"SoapHeader{" + 
			"authenticationSoapHeader = '" + authenticationSoapHeader + '\'' + 
			"}";
		}
}