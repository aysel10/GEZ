package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class TicketDesignators implements Parcelable{

    @JsonProperty("TicketDesignator")
    private Object ticketDesignator;
    private List<TicketDesignatorItem> ticketDesignatorItems;
    public TicketDesignators(Object ticketDesignator) {
        this.ticketDesignator = ticketDesignator;
    }
    public TicketDesignators(){

    }

    public Object getTicketDesignator() {
        return ticketDesignator;
    }

    public void setTicketDesignator(Object ticketDesignator) {
        this.ticketDesignator = ticketDesignator;
    }

    public List<TicketDesignatorItem> getTicketDesignatorItems() {
        return ticketDesignatorItems;
    }

    public void setTicketDesignatorItems(List<TicketDesignatorItem> ticketDesignatorItems) {
        this.ticketDesignatorItems = ticketDesignatorItems;
    }

    @Override
    public String toString() {
        return
                "TicketDesignators{" +
                        "ticketDesignator = '" + ticketDesignator + '\'' +
                        "}";
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable((Parcelable) this.ticketDesignator, flags);
        dest.writeTypedList(this.ticketDesignatorItems);
    }

    protected TicketDesignators(Parcel in) {
        this.ticketDesignator = in.readParcelable(Object.class.getClassLoader());
        this.ticketDesignatorItems = in.createTypedArrayList(TicketDesignatorItem.CREATOR);
    }

    public static final Creator<TicketDesignators> CREATOR = new Creator<TicketDesignators>() {
        @Override
        public TicketDesignators createFromParcel(Parcel source) {
            return new TicketDesignators(source);
        }

        @Override
        public TicketDesignators[] newArray(int size) {
            return new TicketDesignators[size];
        }
    };
}