package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"emailType","text"})
public class Email{

	@JsonProperty("#text")
	private String text;

	@JsonProperty("@EmailType")
	private String emailType;

	public Email(String text, String emailType) {
		this.text = text;
		this.emailType = emailType;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setEmailType(String emailType){
		this.emailType = emailType;
	}

	public String getEmailType(){
		return emailType;
	}

	@Override
 	public String toString(){
		return 
			"Email{" + 
			"#text = '" + text + '\'' + 
			",@EmailType = '" + emailType + '\'' + 
			"}";
		}
}