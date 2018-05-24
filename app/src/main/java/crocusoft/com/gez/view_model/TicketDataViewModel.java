package crocusoft.com.gez.view_model;


import java.util.List;


public class TicketDataViewModel {

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
}
