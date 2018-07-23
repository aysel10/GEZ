package crocusoft.com.gez.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rJ\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020$H\u0016J\u0010\u0010(\u001a\u00020$2\u0006\u0010\'\u001a\u00020$H\u0016J\u0006\u0010)\u001a\u00020\rJ\b\u0010*\u001a\u00020\u0017H\u0002J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020$H\u0016J\u0018\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020$H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcrocusoft/com/gez/adapters/FlightRoundtripTicketsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcrocusoft/com/gez/adapters/FlightRoundtripTicketsAdapter$ViewHolder;", "()V", "allTicketsListDepart", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "combinationsList", "Lcrocusoft/com/gez/pojo/response/flight/roundtripResponse/OriginDestinationCombinationItem;", "db", "Lcrocusoft/com/gez/database/AppDatabase;", "ticketListArrive", "ticketModel", "Lcrocusoft/com/gez/flight_view_model/TicketDataViewModel;", "ticketsIndexList", "", "", "getTicketsIndexList", "()Ljava/util/List;", "setTicketsIndexList", "(Ljava/util/List;)V", "ticketsListDepart", "addViewModel", "", "ticketDataViewModel", "arriveTicketsListFill", "combinationListFill", "departTicketsListFill", "formatDate", "dateString", "getAllDepartTicketsList", "getArriveTicketsList", "getCombinationsList", "getDepartTicketsList", "getIndexList", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "getTicketViewModel", "indexListFill", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FlightRoundtripTicketsAdapter extends android.support.v7.widget.RecyclerView.Adapter<crocusoft.com.gez.adapters.FlightRoundtripTicketsAdapter.ViewHolder> {
    private crocusoft.com.gez.flight_view_model.TicketDataViewModel ticketModel;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> ticketsListDepart;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> ticketListArrive;
    private java.util.ArrayList<crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem> combinationsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> ticketsIndexList;
    private crocusoft.com.gez.database.AppDatabase db;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> allTicketsListDepart;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTicketsIndexList() {
        return null;
    }
    
    public final void setTicketsIndexList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final void addViewModel(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.flight_view_model.TicketDataViewModel ticketDataViewModel) {
    }
    
    private final void departTicketsListFill() {
    }
    
    private final void arriveTicketsListFill() {
    }
    
    private final void combinationListFill() {
    }
    
    private final void indexListFill() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem> getCombinationsList() {
        return null;
    }
    
    private final java.lang.String formatDate(java.lang.String dateString) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.adapters.FlightRoundtripTicketsAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.flight_view_model.TicketDataViewModel getTicketViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> getArriveTicketsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> getDepartTicketsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> getAllDepartTicketsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getIndexList() {
        return null;
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
    public crocusoft.com.gez.adapters.FlightRoundtripTicketsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public FlightRoundtripTicketsAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-\u00a8\u0006."}, d2 = {"Lcrocusoft/com/gez/adapters/FlightRoundtripTicketsAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "airportImage", "Landroid/widget/ImageView;", "getAirportImage", "()Landroid/widget/ImageView;", "setAirportImage", "(Landroid/widget/ImageView;)V", "airportName", "Landroid/widget/TextView;", "getAirportName", "()Landroid/widget/TextView;", "setAirportName", "(Landroid/widget/TextView;)V", "arrivalAirport", "getArrivalAirport", "setArrivalAirport", "arrivalTime", "getArrivalTime", "setArrivalTime", "baggageIndex", "getBaggageIndex", "setBaggageIndex", "departAirport", "getDepartAirport", "setDepartAirport", "departTime", "getDepartTime", "setDepartTime", "flightNumber", "getFlightNumber", "setFlightNumber", "flightTime", "getFlightTime", "setFlightTime", "marketingAirline", "getMarketingAirline", "setMarketingAirline", "price", "getPrice", "setPrice", "getView", "()Landroid/view/View;", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView airportName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView airportImage;
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
        public final android.widget.ImageView getAirportImage() {
            return null;
        }
        
        public final void setAirportImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
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