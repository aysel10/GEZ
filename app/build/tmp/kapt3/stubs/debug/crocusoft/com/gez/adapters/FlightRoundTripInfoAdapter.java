package crocusoft.com.gez.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u0013\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcrocusoft/com/gez/adapters/FlightRoundTripInfoAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcrocusoft/com/gez/adapters/FlightRoundTripInfoAdapter$ViewHolder;", "()V", "db", "Lcrocusoft/com/gez/database/AppDatabase;", "freeBaggages", "Lcrocusoft/com/gez/pojo/response/flight/roundtripResponse/FreeBaggages;", "ticketsList", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/view_model/OriginDestinationOptionItemViewModel;", "getTicketsList", "()Ljava/util/ArrayList;", "setTicketsList", "(Ljava/util/ArrayList;)V", "addBaggage", "", "baggages", "ticketList", "addList", "formatDate", "", "dateString", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "getTickets", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FlightRoundTripInfoAdapter extends android.support.v7.widget.RecyclerView.Adapter<crocusoft.com.gez.adapters.FlightRoundTripInfoAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> ticketsList;
    private crocusoft.com.gez.database.AppDatabase db;
    private crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages freeBaggages;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> getTicketsList() {
        return null;
    }
    
    public final void setTicketsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> p0) {
    }
    
    public final void addBaggage(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages baggages) {
    }
    
    public final void addList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> ticketList) {
    }
    
    public final void addBaggage(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> ticketList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> getTickets() {
        return null;
    }
    
    private final java.lang.String formatDate(java.lang.String dateString) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.adapters.FlightRoundTripInfoAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public crocusoft.com.gez.adapters.FlightRoundTripInfoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public FlightRoundTripInfoAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u00064"}, d2 = {"Lcrocusoft/com/gez/adapters/FlightRoundTripInfoAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "airportImage", "Landroid/widget/ImageView;", "getAirportImage", "()Landroid/widget/ImageView;", "setAirportImage", "(Landroid/widget/ImageView;)V", "airportName", "Landroid/widget/TextView;", "getAirportName", "()Landroid/widget/TextView;", "setAirportName", "(Landroid/widget/TextView;)V", "arrivalAirport", "getArrivalAirport", "setArrivalAirport", "arrivalTime", "getArrivalTime", "setArrivalTime", "baggageIndex", "getBaggageIndex", "setBaggageIndex", "departAirport", "getDepartAirport", "setDepartAirport", "departTime", "getDepartTime", "setDepartTime", "flightNumber", "getFlightNumber", "setFlightNumber", "flightTime", "getFlightTime", "setFlightTime", "marketingAirline", "getMarketingAirline", "setMarketingAirline", "price", "getPrice", "setPrice", "selectButton", "Landroid/widget/Button;", "getSelectButton", "()Landroid/widget/Button;", "setSelectButton", "(Landroid/widget/Button;)V", "getView", "()Landroid/view/View;", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView airportName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView flightTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView departTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView arrivalTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView arrivalAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView departAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView price;
        @org.jetbrains.annotations.NotNull()
        private android.widget.Button selectButton;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView airportImage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView baggageIndex;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView flightNumber;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView marketingAirline;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getAirportName() {
            return null;
        }
        
        public final void setAirportName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFlightTime() {
            return null;
        }
        
        public final void setFlightTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDepartTime() {
            return null;
        }
        
        public final void setDepartTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getArrivalTime() {
            return null;
        }
        
        public final void setArrivalTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getArrivalAirport() {
            return null;
        }
        
        public final void setArrivalAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getDepartAirport() {
            return null;
        }
        
        public final void setDepartAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        public final void setPrice(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.Button getSelectButton() {
            return null;
        }
        
        public final void setSelectButton(@org.jetbrains.annotations.NotNull()
        android.widget.Button p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getAirportImage() {
            return null;
        }
        
        public final void setAirportImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBaggageIndex() {
            return null;
        }
        
        public final void setBaggageIndex(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFlightNumber() {
            return null;
        }
        
        public final void setFlightNumber(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMarketingAirline() {
            return null;
        }
        
        public final void setMarketingAirline(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}