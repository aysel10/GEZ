package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response implements Parcelable{

	@JsonProperty("?xml")
	private Xml xml;

	@JsonProperty("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public Response(Xml xml, SoapEnvelope soapEnvelope) {
		this.xml = xml;
		this.soapEnvelope = soapEnvelope;
	}
	public Response(){

	}


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
			"OneWayRequest{" +
			"?xml = '" + xml + '\'' + 
			",soap:Envelope = '" + soapEnvelope + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable(this.xml, flags);
		dest.writeParcelable(this.soapEnvelope, flags);
	}

	protected Response(Parcel in) {
		this.xml = in.readParcelable(Xml.class.getClassLoader());
		this.soapEnvelope = in.readParcelable(SoapEnvelope.class.getClassLoader());
	}

	public static final Creator<Response> CREATOR = new Creator<Response>() {
		@Override
		public Response createFromParcel(Parcel source) {
			return new Response(source);
		}

		@Override
		public Response[] newArray(int size) {
			return new Response[size];
		}
	};
}