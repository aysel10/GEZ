package crocusoft.com.gez.flight_view_model;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;


public class TicketDataViewModel implements Parcelable{

    private List<PricedItineraryItemViewModel> pricedItineraryItemList;

    public List<PricedItineraryItemViewModel> getPricedItineraryItemList() {
        return pricedItineraryItemList;
    }

    public void setPricedItineraryItemList(List<PricedItineraryItemViewModel> pricedItineraryItemList) {
        this.pricedItineraryItemList = pricedItineraryItemList;
    }

    @Override
    public String toString() {
        return "TicketDataViewModel{" +
                "pricedItineraryItemList=" + pricedItineraryItemList +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.pricedItineraryItemList);
    }

    public TicketDataViewModel() {
    }

    protected TicketDataViewModel(Parcel in) {
        this.pricedItineraryItemList = new ArrayList<PricedItineraryItemViewModel>();
        in.readList(this.pricedItineraryItemList, PricedItineraryItemViewModel.class.getClassLoader());
    }

    public static final Creator<TicketDataViewModel> CREATOR = new Creator<TicketDataViewModel>() {
        @Override
        public TicketDataViewModel createFromParcel(Parcel source) {
            return new TicketDataViewModel(source);
        }

        @Override
        public TicketDataViewModel[] newArray(int size) {
            return new TicketDataViewModel[size];
        }
    };
}
