package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"givenName","namePrefix","surname"})
public class PersonName{

	@JsonProperty("NamePrefix")
	private String namePrefix;

	@JsonProperty("GivenName")
	private String givenName;

	@JsonProperty("Surname")
	private String surname;

	public PersonName(String namePrefix, String givenName, String surname) {
		this.namePrefix = namePrefix;
		this.givenName = givenName;
		this.surname = surname;
	}

	public void setNamePrefix(String namePrefix){
		this.namePrefix = namePrefix;
	}

	public String getNamePrefix(){
		return namePrefix;
	}

	public void setGivenName(String givenName){
		this.givenName = givenName;
	}

	public String getGivenName(){
		return givenName;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	@Override
 	public String toString(){
		return 
			"PersonName{" + 
			"namePrefix = '" + namePrefix + '\'' + 
			",givenName = '" + givenName + '\'' + 
			",surname = '" + surname + '\'' + 
			"}";
		}
}