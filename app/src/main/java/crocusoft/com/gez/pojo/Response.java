package az.seyidkanan.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("?xml")
	private Xml xml;

	@SerializedName("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public void setXml(Xml xml){
		this.xml = xml;
	}

	public Xml getXml(){
		return xml;
	}

	public void setSoapEnvelope(SoapEnvelope soapEnvelope){
		this.soapEnvelope = soapEnvelope;
	}

	public SoapEnvelope getSoapEnvelope(){
		return soapEnvelope;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"?xml = '" + xml + '\'' + 
			",soap:Envelope = '" + soapEnvelope + '\'' + 
			"}";
		}
}