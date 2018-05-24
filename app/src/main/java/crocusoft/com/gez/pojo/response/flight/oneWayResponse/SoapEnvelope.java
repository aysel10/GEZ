package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoapEnvelope{

	@JsonProperty("@xmlns:soap")
	private String xmlnsSoap;

	@JsonProperty("@xmlns:xsi")
	private String xmlnsXsi;

	@JsonProperty("@xmlns:xsd")
	private String xmlnsXsd;

	@JsonProperty("soap:Body")
	private SoapBody soapBody;

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