package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CabinPref {
    @JsonProperty("@Cabin")
    @Expose
    private String cabin;
    @JsonProperty("@MajorityCabin")
    @Expose
    private String majorityCabin;
    @JsonProperty("@MandatoryCabin")
    @Expose
    private String mandatoryCabin;

    public CabinPref() {
        this.cabin = "Economy";
        this.majorityCabin = "true";
        this.mandatoryCabin = "false";
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getMajorityCabin() {
        return majorityCabin;
    }

    public void setMajorityCabin(String majorityCabin) {
        this.majorityCabin = majorityCabin;
    }

    public String getMandatoryCabin() {
        return mandatoryCabin;
    }

    public void setMandatoryCabin(String mandatoryCabin) {
        this.mandatoryCabin = mandatoryCabin;
    }
}
