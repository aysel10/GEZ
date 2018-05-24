package crocusoft.com.gez.pojo.request.defaultFlight;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;

import crocusoft.com.gez.pojo.request.defaultFlight.AuthenticationSoapHeader;

public class SoapHeader {

    @JsonProperty("AuthenticationSoapHeader")
    @Expose
    private AuthenticationSoapHeader authenticationSoapHeader;

    public SoapHeader(AuthenticationSoapHeader authenticationSoapHeader) {
        this.authenticationSoapHeader = authenticationSoapHeader;
    }

    public AuthenticationSoapHeader getAuthenticationSoapHeader() {
        return authenticationSoapHeader;
    }

    public void setAuthenticationSoapHeader(AuthenticationSoapHeader authenticationSoapHeader) {
        this.authenticationSoapHeader = authenticationSoapHeader;
    }

}