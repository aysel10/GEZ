package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
@JsonPropertyOrder({"xmlns", "wSUserName", "wSPassword"})
public class AuthenticationSoapHeader {
    @JsonProperty("@xmlns")
    @Expose
    private String xmlns;
    @JsonProperty("WSUserName")
    @Expose
    private String wSUserName;
    @JsonProperty("WSPassword")
    @Expose
    private String wSPassword;


    public AuthenticationSoapHeader() {
        this.xmlns = "http://epowerv5.amadeus.com.tr/WS";
        this.wSUserName = "wsgezzaz";
        this.wSPassword = "Amadeus1!";
    }



    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getWSUserName() {
        return wSUserName;
    }

    public void setWSUserName(String wSUserName) {
        this.wSUserName = wSUserName;
    }

    public String getWSPassword() {
        return wSPassword;
    }

    public void setWSPassword(String wSPassword) {
        this.wSPassword = wSPassword;
    }

}
