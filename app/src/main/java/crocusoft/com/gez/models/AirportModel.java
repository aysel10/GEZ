package crocusoft.com.gez.models;

public class AirportModel {
    private String airportname;
    private String cityName;
    private Boolean isCity;

    public AirportModel(String airportname, String cityName, Boolean isCity) {
        this.airportname = airportname;
        this.cityName = cityName;
        this.isCity = isCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Boolean getCity() {
        return isCity;
    }

    public void setCity(Boolean city) {
        isCity = city;
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
