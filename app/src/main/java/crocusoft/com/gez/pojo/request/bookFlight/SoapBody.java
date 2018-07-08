package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoapBody{

	@JsonProperty("BookFlight")
	private BookFlight bookFlight;

	public SoapBody(BookFlight bookFlight) {
		this.bookFlight = bookFlight;
	}

	public void setBookFlight(BookFlight bookFlight){
		this.bookFlight = bookFlight;
	}

	public BookFlight getBookFlight(){
		return bookFlight;
	}

	@Override
 	public String toString(){
		return 
			"SoapBody{" + 
			"bookFlight = '" + bookFlight + '\'' + 
			"}";
		}
}