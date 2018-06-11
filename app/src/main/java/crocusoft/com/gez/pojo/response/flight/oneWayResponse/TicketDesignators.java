package crocusoft.com.gez.pojo.response.flight.oneWayResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class TicketDesignators implements Parcelable{

    @JsonProperty("TicketDesignator")
    private Object ticketDesignator;

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
    }

    protected TicketDesignators(Parcel in) {
        this.ticketDesignator = in.readParcelable(Object.class.getClassLoader());
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