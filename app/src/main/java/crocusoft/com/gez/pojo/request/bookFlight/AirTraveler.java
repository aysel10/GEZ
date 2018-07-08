package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"passengerTypeCode","personName","birthDate","telephone","email","document"})
public class AirTraveler{


	@JsonProperty("PersonName")
	private PersonName personName;

	@JsonProperty("Email")
	private Email email;

	@JsonProperty("@PassengerTypeCode")
	private String passengerTypeCode;

	@JsonProperty("Telephone")
	private Telephone telephone;

	@JsonProperty("Document")
	private Document document;

	@JsonProperty("BirthDate")
	private String birthDate;

	public AirTraveler(PersonName personName, Email email, String passengerTypeCode, Telephone telephone, Document document, String birthDate) {
		this.personName = personName;
		this.email = email;
		this.passengerTypeCode = passengerTypeCode;
		this.telephone = telephone;
		this.document = document;
		this.birthDate = birthDate;
	}

	public void setPersonName(PersonName personName){
		this.personName = personName;
	}

	public PersonName getPersonName(){
		return personName;
	}

	public void setEmail(Email email){
		this.email = email;
	}

	public Email getEmail(){
		return email;
	}

	public void setPassengerTypeCode(String passengerTypeCode){
		this.passengerTypeCode = passengerTypeCode;
	}

	public String getPassengerTypeCode(){
		return passengerTypeCode;
	}

	public void setTelephone(Telephone telephone){
		this.telephone = telephone;
	}

	public Telephone getTelephone(){
		return telephone;
	}

	public void setDocument(Document document){
		this.document = document;
	}

	public Document getDocument(){
		return document;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public String getBirthDate(){
		return birthDate;
	}

	@Override
 	public String toString(){
		return 
			"AirTraveler{" + 
			"personName = '" + personName + '\'' + 
			",email = '" + email + '\'' + 
			",@PassengerTypeCode = '" + passengerTypeCode + '\'' + 
			",telephone = '" + telephone + '\'' + 
			",document = '" + document + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			"}";
		}
}