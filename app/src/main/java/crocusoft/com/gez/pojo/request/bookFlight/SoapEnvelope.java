package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"xmlnsXsi", "xmlnsXsd", "xmlnsSoap", "soapHeader", "soapBody"})

public class SoapEnvelope {

	@JsonProperty("@xmlns:soap")
	private String xmlnsSoap;

	@JsonProperty("@xmlns:xsi")
	private String xmlnsXsi;

	@JsonProperty("soap:Header")
	private SoapHeader soapHeader;

	@JsonProperty("@xmlns:xsd")
	private String xmlnsXsd;

	@JsonProperty("soap:Body")
	private SoapBody soapBody;

	public SoapEnvelope(SoapHeader soapHeader,SoapBody soapBody) {
		this.xmlnsXsi = "http://www.w3.org/2001/XMLSchema-instance";
		this.xmlnsXsd = "http://www.w3.org/2001/XMLSchema";
		this.xmlnsSoap = "http://schemas.xmlsoap.org/soap/envelope/";
		this.soapHeader = soapHeader;
		this.soapBody = soapBody;
	}
	public void setXmlnsSoap(String xmlnsSoap){
		this.xmlnsSoap = xmlnsSoap;
	}

	public String getXmlnsSoap(){
		return xmlnsSoap;
	}

	public void setXmlnsXsi(String xmlnsXsi){
		this.xmlnsXsi = xmlnsXsi;
	}

	public String getXmlnsXsi(){
		return xmlnsXsi;
	}

	public void setXmlnsXsd(String xmlnsXsd){
		this.xmlnsXsd = xmlnsXsd;
	}

	public String getXmlnsXsd(){
		return xmlnsXsd;
	}

	public void setSoapBody(SoapBody soapBody){
		this.soapBody = soapBody;
	}

	public SoapBody getSoapBody(){
		return soapBody;
	}

	@Override
 	public String toString(){
		return 
			"SoapEnvelope{" + 
			"@xmlns:soap = '" + xmlnsSoap + '\'' + 
			",@xmlns:xsi = '" + xmlnsXsi + '\'' + 
			",@xmlns:xsd = '" + xmlnsXsd + '\'' + 
			",soap:Body = '" + soapBody + '\'' + 
			"}";
		}
}