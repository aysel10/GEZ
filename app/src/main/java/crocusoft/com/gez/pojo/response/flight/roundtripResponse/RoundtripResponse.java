package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoundtripResponse implements Parcelable{

	@JsonProperty("?xml")
	private Xml xml;

	@JsonProperty("soap:Envelope")
	private SoapEnvelope soapEnvelope;

	public RoundtripResponse(Xml xml, SoapEnvelope soapEnvelope) {
		this.xml = xml;
		this.soapEnvelope = soapEnvelope;
	}
	public RoundtripResponse(){

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

	protected RoundtripResponse(Parcel in) {
		this.xml = in.readParcelable(Xml.class.getClassLoader());
		this.soapEnvelope = in.readParcelable(SoapEnvelope.class.getClassLoader());
	}

	public static final Creator<RoundtripResponse> CREATOR = new Creator<RoundtripResponse>() {
		@Override
		public RoundtripResponse createFromParcel(Parcel source) {
			return new RoundtripResponse(source);
		}

		@Override
		public RoundtripResponse[] newArray(int size) {
			return new RoundtripResponse[size];
		}
	};
}