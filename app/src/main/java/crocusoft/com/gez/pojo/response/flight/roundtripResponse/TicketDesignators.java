package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketDesignators {

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
}