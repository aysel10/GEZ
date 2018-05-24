package crocusoft.com.gez.view_model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class PricedItineraryItemViewModel {

    @SerializedName("Currency")
    private String currency;

    @SerializedName("SequenceNumber")
    private String sequenceNumber;

    private List<OriginDestinationOptionItemViewModel> customOriginDestinationOptionItemList;

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
}
