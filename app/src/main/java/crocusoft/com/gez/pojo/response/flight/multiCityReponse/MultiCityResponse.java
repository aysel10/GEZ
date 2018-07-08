package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiCityResponse implements Parcelable{

	@JsonProperty("?xml")
	private Xml xml;

	@JsonProperty("soap:Envelope")
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
			"MultiCityResponse{" + 
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

	public MultiCityResponse() {
	}

	protected MultiCityResponse(Parcel in) {
		this.xml = in.readParcelable(Xml.class.getClassLoader());
		this.soapEnvelope = in.readParcelable(SoapEnvelope.class.getClassLoader());
	}

	public static final Creator<MultiCityResponse> CREATOR = new Creator<MultiCityResponse>() {
		@Override
		public MultiCityResponse createFromParcel(Parcel source) {
			return new MultiCityResponse(source);
		}

		@Override
		public MultiCityResponse[] newArray(int size) {
			return new MultiCityResponse[size];
		}
	};
}