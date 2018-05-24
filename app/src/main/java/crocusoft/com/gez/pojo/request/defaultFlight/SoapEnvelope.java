package crocusoft.com.gez.pojo.request.defaultFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@JsonPropertyOrder({"xmlnsXsi", "xmlnsXsd", "xmlnsSoap", "soapHeader", "soapBody"})
public class SoapEnvelope {


    @SerializedName("@xmlns:xsd")
    @JsonProperty("@xmlns:xsd")
    @Expose
    private String xmlnsXsd;
    @SerializedName("@xmlns:soap")
    @JsonProperty("@xmlns:soap")
    @Expose
    private String xmlnsSoap;
    @JsonProperty("soap:Header")
    @SerializedName("soap:Header")
    @Expose
    private SoapHeader soapHeader;
    @JsonProperty("soap:Body")
    @Expose
    private SoapBody soapBody;
    @JsonProperty("@xmlns:xsi")
    @Expose
    private String xmlnsXsi;


    public SoapEnvelope(SoapHeader soapHeader, SoapBody soapBody) {
        this.xmlnsXsi = "http://www.w3.org/2001/XMLSchema-instance";
        this.xmlnsXsd = "http://www.w3.org/2001/XMLSchema";
        this.xmlnsSoap = "http://schemas.xmlsoap.org/soap/envelope/";
        this.soapHeader = soapHeader;
        this.soapBody = soapBody;
    }

    public SoapEnvelope( String xmlnsXsi, String xmlnsXsd,String xmlnsSoap, SoapHeader soapHeader ,SoapBody soapBody){
        this.xmlnsXsi = xmlnsXsi;
        this.xmlnsXsd = xmlnsXsd;
        this.xmlnsSoap = xmlnsSoap;
        this.soapHeader = soapHeader;
        this.soapBody = soapBody;
    }


    public String getXmlnsXsi() {
        return xmlnsXsi;
    }

    public void setXmlnsXsi(String xmlnsXsi) {
        this.xmlnsXsi = xmlnsXsi;
    }

    public String getXmlnsXsd() {
        return xmlnsXsd;
    }

    public void setXmlnsXsd(String xmlnsXsd) {
        this.xmlnsXsd = xmlnsXsd;
    }

    public String getXmlnsSoap() {
        return xmlnsSoap;
    }

    public void setXmlnsSoap(String xmlnsSoap) {
        this.xmlnsSoap = xmlnsSoap;
    }

    public SoapHeader getSoapHeader() {
        return soapHeader;
    }

    public void setSoapHeader(SoapHeader soapHeader) {
        this.soapHeader = soapHeader;
    }

    public SoapBody getSoapBody() {
        return soapBody;
    }

    public void setSoapBody(SoapBody soapBody) {
        this.soapBody = soapBody;
    }

    @Override
    public String toString() {
        return "SoapEnvelope{" +
                "xmlnsXsi='" + xmlnsXsi + '\'' +
                ", xmlnsXsd='" + xmlnsXsd + '\'' +
                ", xmlnsSoap='" + xmlnsSoap + '\'' +
                ", soapHeader=" + soapHeader +
                ", soapBody=" + soapBody +
                '}';
    }
}

