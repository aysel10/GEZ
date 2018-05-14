package crocusoft.com.gez.pojo;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;

public class Xml{

	@SerializedName("@version")
	private String version;

	@SerializedName("@encoding")
	private String encoding;

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