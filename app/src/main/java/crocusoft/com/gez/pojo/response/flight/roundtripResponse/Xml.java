package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Xml implements Parcelable{

	@JsonProperty("@version")
	private String version;

	@JsonProperty("@encoding")
	private String encoding;

	public Xml(String version, String encoding) {
		this.version = version;
		this.encoding = encoding;
	}
	public Xml(){

	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setEncoding(String encoding){
		this.encoding = encoding;
	}

	public String getEncoding(){
		return encoding;
	}

	@Override
 	public String toString(){
		return 
			"Xml{" + 
			"@version = '" + version + '\'' + 
			",@encoding = '" + encoding + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.version);
		dest.writeString(this.encoding);
	}

	protected Xml(Parcel in) {
		this.version = in.readString();
		this.encoding = in.readString();
	}

	public static final Creator<Xml> CREATOR = new Creator<Xml>() {
		@Override
		public Xml createFromParcel(Parcel source) {
			return new Xml(source);
		}

		@Override
		public Xml[] newArray(int size) {
			return new Xml[size];
		}
	};
}