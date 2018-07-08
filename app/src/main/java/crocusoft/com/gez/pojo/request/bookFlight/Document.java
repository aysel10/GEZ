package crocusoft.com.gez.pojo.request.bookFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"docType","docId","docIssueCountry","expireDate"})
public class Document{

	@JsonProperty("@DocIssueCountry")
	private String docIssueCountry;

	@JsonProperty("@DocType")
	private String docType;

	@JsonProperty("@DocID")
	private String docID;

	@JsonProperty("@ExpireDate")
	private String expireDate;

	public Document(String docIssueCountry, String docType, String docID, String expireDate) {
		this.docIssueCountry = docIssueCountry;
		this.docType = docType;
		this.docID = docID;
		this.expireDate = expireDate;
	}

	public void setDocIssueCountry(String docIssueCountry){
		this.docIssueCountry = docIssueCountry;
	}

	public String getDocIssueCountry(){
		return docIssueCountry;
	}

	public void setDocType(String docType){
		this.docType = docType;
	}

	public String getDocType(){
		return docType;
	}

	public void setDocID(String docID){
		this.docID = docID;
	}

	public String getDocID(){
		return docID;
	}

	public void setExpireDate(String expireDate){
		this.expireDate = expireDate;
	}

	public String getExpireDate(){
		return expireDate;
	}

	@Override
 	public String toString(){
		return 
			"Document{" + 
			"@DocIssueCountry = '" + docIssueCountry + '\'' + 
			",@DocType = '" + docType + '\'' + 
			",@DocID = '" + docID + '\'' + 
			",@ExpireDate = '" + expireDate + '\'' + 
			"}";
		}
}