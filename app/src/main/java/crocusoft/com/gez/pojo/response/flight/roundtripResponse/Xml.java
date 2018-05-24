package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Xml{

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
}