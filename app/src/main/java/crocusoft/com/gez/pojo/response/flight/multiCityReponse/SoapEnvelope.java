package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoapEnvelope implements Parcelable{

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

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.xmlnsSoap);
		dest.writeString(this.xmlnsXsi);
		dest.writeString(this.xmlnsXsd);
		dest.writeParcelable(this.soapBody, flags);
	}

	public SoapEnvelope() {
	}

	protected SoapEnvelope(Parcel in) {
		this.xmlnsSoap = in.readString();
		this.xmlnsXsi = in.readString();
		this.xmlnsXsd = in.readString();
		this.soapBody = in.readParcelable(SoapBody.class.getClassLoader());
	}

	public static final Creator<SoapEnvelope> CREATOR = new Creator<SoapEnvelope>() {
		@Override
		public SoapEnvelope createFromParcel(Parcel source) {
			return new SoapEnvelope(source);
		}

		@Override
		public SoapEnvelope[] newArray(int size) {
			return new SoapEnvelope[size];
		}
	};
}