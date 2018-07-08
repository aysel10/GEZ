package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name","text"})
public class PaymentTextItem{

	@JsonProperty("@Text")
	private String text;

	@JsonProperty("@Name")
	private String name;

	public PaymentTextItem(String text, String name) {
		this.text = text;
		this.name = name;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"PaymentTextItem{" + 
			"@Text = '" + text + '\'' + 
			",@Name = '" + name + '\'' + 
			"}";
		}
}