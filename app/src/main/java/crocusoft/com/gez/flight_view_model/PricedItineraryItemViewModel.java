package crocusoft.com.gez.flight_view_model;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem;


public class PricedItineraryItemViewModel implements Parcelable{

    @SerializedName("Currency")
    private String currency;

    @SerializedName("SequenceNumber")
    private String sequenceNumber;

    private List<OriginDestinationOptionItemViewModel> customOriginDestinationOptionItemList;
    private List<OriginDestinationCombinationItem> customOriginCombinationOptionItemList;

    private List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> originOneWayCombinationOptionItemList;
    private  List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> originMultiCityCombinationOptionList;
    private List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem> originOneWayDestinationOptionItems;
    private List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem> originMultiCityDestinationOptionItems;

    @SerializedName("FreeBaggages")
    @JsonProperty("FreeBaggages")
    private List<FreeBaggages> freeBaggagesList;
    private FreeBaggages freeBaggages;

    private crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages freeBaggagesOneWay;
    private List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages> freeBaggagesListOneWay;

    private crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages freeBaggagesMultiCity;
    private List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages> freeBaggagesListMultiCity;

    public crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages getFreeBaggagesOneWay() {
        return freeBaggagesOneWay;
    }


    public void setFreeBaggagesOneWay(crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages freeBaggagesOneWay) {
        this.freeBaggagesOneWay = freeBaggagesOneWay;
    }

    public List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages> getFreeBaggagesListOneWay() {
        return freeBaggagesListOneWay;
    }

    public void setFreeBaggagesListOneWay(List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages> freeBaggagesListOneWay) {
        this.freeBaggagesListOneWay = freeBaggagesListOneWay;
    }

    public crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages getFreeBaggagesMultiCity() {
        return freeBaggagesMultiCity;
    }

    public void setFreeBaggagesMultiCity(crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages freeBaggagesMultiCity) {
        this.freeBaggagesMultiCity = freeBaggagesMultiCity;
    }

    public List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages> getFreeBaggagesListMultiCity() {
        return freeBaggagesListMultiCity;
    }

    public void setFreeBaggagesListMultiCity(List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages> freeBaggagesListMultiCity) {
        this.freeBaggagesListMultiCity = freeBaggagesListMultiCity;
    }

    public List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> getOriginMultiCityCombinationOptionList() {
        return originMultiCityCombinationOptionList;
    }

    public List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem> getOriginMultiCityDestinationOptionItems() {
        return originMultiCityDestinationOptionItems;
    }

    public void setOriginMultiCityDestinationOptionItems(List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem> originMultiCityDestinationOptionItems) {
        this.originMultiCityDestinationOptionItems = originMultiCityDestinationOptionItems;
    }

    public void setOriginMultiCityCombinationOptionList(List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> originMultiCityCombinationOptionList) {
        this.originMultiCityCombinationOptionList = originMultiCityCombinationOptionList;
    }

    public FreeBaggages getFreeBaggages() {
        return freeBaggages;
    }

    public void setFreeBaggages(FreeBaggages freeBaggages) {
        this.freeBaggages = freeBaggages;
    }

    public List<FreeBaggages> getFreeBaggagesList() {
        return freeBaggagesList;
    }

    public void setFreeBaggagesList(List<FreeBaggages> freeBaggagesList) {
        this.freeBaggagesList = freeBaggagesList;
    }

    public List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem> getOriginOneWayDestinationOptionItems() {
        return originOneWayDestinationOptionItems;
    }

    public void setOriginOneWayDestinationOptionItems(List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem> originOneWayDestinationOptionItems) {
        this.originOneWayDestinationOptionItems = originOneWayDestinationOptionItems;
    }

    public List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> getOriginOneWayCombinationOptionItemList() {
        return originOneWayCombinationOptionItemList;
    }

    public void setOriginOneWayCombinationOptionItemList(List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> originOneWayCombinationOptionItemList) {
        this.originOneWayCombinationOptionItemList = originOneWayCombinationOptionItemList;
    }

    public List<OriginDestinationCombinationItem> getCustomOriginCombinationOptionItemList() {
        return customOriginCombinationOptionItemList;
    }

    public void setCustomOriginCombinationOptionItemList(List<OriginDestinationCombinationItem> customOriginCombinationOptionItemList) {
        this.customOriginCombinationOptionItemList = customOriginCombinationOptionItemList;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public List<OriginDestinationOptionItemViewModel> getCustomOriginDestinationOptionItemList() {
        return customOriginDestinationOptionItemList;
    }

    public void setCustomOriginDestinationOptionItemList(List<OriginDestinationOptionItemViewModel> customOriginDestinationOptionItemList) {
        this.customOriginDestinationOptionItemList = customOriginDestinationOptionItemList;
    }

    @Override
    public String toString() {
        return "PricedItineraryItemViewModel{" +
                "currency='" + currency + '\'' +
                ", sequenceNumber='" + sequenceNumber + '\'' +
                ", customOriginDestinationOptionItemList=" + customOriginDestinationOptionItemList +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currency);
        dest.writeString(this.sequenceNumber);
        dest.writeTypedList(this.customOriginDestinationOptionItemList);
        dest.writeTypedList(this.customOriginCombinationOptionItemList);
        dest.writeTypedList(this.originOneWayCombinationOptionItemList);
        dest.writeTypedList(this.originMultiCityCombinationOptionList);
        dest.writeList(this.originOneWayDestinationOptionItems);
        dest.writeTypedList(this.originMultiCityDestinationOptionItems);
        dest.writeTypedList(this.freeBaggagesList);
        dest.writeParcelable(this.freeBaggages, flags);
        dest.writeParcelable(this.freeBaggagesOneWay, flags);
        dest.writeTypedList(this.freeBaggagesListOneWay);
        dest.writeParcelable(this.freeBaggagesMultiCity, flags);
        dest.writeTypedList(this.freeBaggagesListMultiCity);
    }

    public PricedItineraryItemViewModel() {
    }

    protected PricedItineraryItemViewModel(Parcel in) {
        this.currency = in.readString();
        this.sequenceNumber = in.readString();
        this.customOriginDestinationOptionItemList = in.createTypedArrayList(OriginDestinationOptionItemViewModel.CREATOR);
        this.customOriginCombinationOptionItemList = in.createTypedArrayList(OriginDestinationCombinationItem.CREATOR);
        this.originOneWayCombinationOptionItemList = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem.CREATOR);
        this.originMultiCityCombinationOptionList = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem.CREATOR);
        this.originOneWayDestinationOptionItems = new ArrayList<OriginDestinationOptionItem>();
        in.readList(this.originOneWayDestinationOptionItems, OriginDestinationOptionItem.class.getClassLoader());
        this.originMultiCityDestinationOptionItems = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem.CREATOR);
        this.freeBaggagesList = in.createTypedArrayList(FreeBaggages.CREATOR);
        this.freeBaggages = in.readParcelable(FreeBaggages.class.getClassLoader());
        this.freeBaggagesOneWay = in.readParcelable(crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages.class.getClassLoader());
        this.freeBaggagesListOneWay = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.oneWayResponse.FreeBaggages.CREATOR);
        this.freeBaggagesMultiCity = in.readParcelable(crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages.class.getClassLoader());
        this.freeBaggagesListMultiCity = in.createTypedArrayList(crocusoft.com.gez.pojo.response.flight.multiCityReponse.FreeBaggages.CREATOR);
    }

    public static final Creator<PricedItineraryItemViewModel> CREATOR = new Creator<PricedItineraryItemViewModel>() {
        @Override
        public PricedItineraryItemViewModel createFromParcel(Parcel source) {
            return new PricedItineraryItemViewModel(source);
        }

        @Override
        public PricedItineraryItemViewModel[] newArray(int size) {
            return new PricedItineraryItemViewModel[size];
        }
    };
}
