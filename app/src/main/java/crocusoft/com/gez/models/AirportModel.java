package crocusoft.com.gez.models;

public class AirportModel {
    private String airportname;
    private Boolean isCity;

    public AirportModel(String airportname, Boolean isCity) {
        this.airportname = airportname;
        this.isCity = isCity;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }

    public Boolean getIsCity() {
        return isCity;
    }

    public void setIsCity(Boolean isCity) {
        this.isCity = isCity;
    }
}
