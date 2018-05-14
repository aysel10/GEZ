package crocusoft.com.gez.pojo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TicketDesignators {

    @SerializedName("TicketDesignator")
    private Object ticketDesignator;

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
}