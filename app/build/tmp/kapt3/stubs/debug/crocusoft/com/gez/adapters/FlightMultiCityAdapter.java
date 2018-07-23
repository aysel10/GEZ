package crocusoft.com.gez.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0002J\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011J\b\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020(H\u0016J\u0006\u0010-\u001a\u00020\u0016J\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0005j\b\u0012\u0004\u0012\u00020\u0012`\u0007J\u0018\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u00022\u0006\u0010+\u001a\u00020(H\u0016J\u0018\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020(H\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcrocusoft/com/gez/adapters/FlightMultiCityAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcrocusoft/com/gez/adapters/FlightMultiCityAdapter$ViewHolder;", "()V", "combinationsList", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/pojo/response/flight/multiCityReponse/OriginDestinationCombinationItem;", "Lkotlin/collections/ArrayList;", "db", "Lcrocusoft/com/gez/database/AppDatabase;", "t", "Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "getT", "()Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "setT", "(Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;)V", "ticketComninationList", "", "Lcrocusoft/com/gez/models/TicketCombination;", "getTicketComninationList", "()Ljava/util/List;", "ticketModel", "Lcrocusoft/com/gez/flight_view_model/TicketDataViewModel;", "ticketsIndexList", "", "getTicketsIndexList", "setTicketsIndexList", "(Ljava/util/List;)V", "ticketsListDepart", "addViewModel", "", "ticketDataViewModel", "combinationListFill", "departTicketsListFill", "formatDate", "dateString", "getCombinationsList", "getDepartTicketsList", "getIndexList", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "getTicketViewModel", "getTickets", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FlightMultiCityAdapter extends android.support.v7.widget.RecyclerView.Adapter<crocusoft.com.gez.adapters.FlightMultiCityAdapter.ViewHolder> {
    private crocusoft.com.gez.flight_view_model.TicketDataViewModel ticketModel;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> ticketsListDepart;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<crocusoft.com.gez.models.TicketCombination> ticketComninationList = null;
    private java.util.ArrayList<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> combinationsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> ticketsIndexList;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel t;
    private crocusoft.com.gez.database.AppDatabase db;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<crocusoft.com.gez.models.TicketCombination> getTicketComninationList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTicketsIndexList() {
        return null;
    }
    
    public final void setTicketsIndexList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel getT() {
        return null;
    }
    
    public final void setT(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel p0) {
    }
    
    public final void addViewModel(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.flight_view_model.TicketDataViewModel ticketDataViewModel) {
    }
    
    private final void departTicketsListFill() {
    }
    
    private final void combinationListFill() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> getCombinationsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.models.TicketCombination> getTickets() {
        return null;
    }
    
    private final java.lang.String formatDate(java.lang.String dateString) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.adapters.FlightMultiCityAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.flight_view_model.TicketDataViewModel getTicketViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> getDepartTicketsList() {
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
    public crocusoft.com.gez.adapters.FlightMultiCityAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public FlightMultiCityAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b[\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u0011\u0010&\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000eR\u001a\u0010(\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R\u001a\u00101\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\u001a\u00104\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000e\"\u0004\b6\u0010\u0010R\u0011\u00107\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\u001a\u0010<\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\nR\u0011\u0010?\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u000eR\u001a\u0010A\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\u001a\u0010D\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010\u0010R\u001a\u0010G\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010R\u001a\u0010J\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u0010R\u001a\u0010M\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010\u0010R\u0011\u0010P\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u000eR\u001a\u0010R\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001a\"\u0004\bT\u0010\u001cR\u001a\u0010U\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R\u001a\u0010X\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\b\"\u0004\bZ\u0010\nR\u0011\u0010[\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u000eR\u001a\u0010]\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u000e\"\u0004\b_\u0010\u0010R\u001a\u0010`\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u000e\"\u0004\bb\u0010\u0010R\u001a\u0010c\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u000e\"\u0004\be\u0010\u0010R\u001a\u0010f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u000e\"\u0004\bh\u0010\u0010R\u001a\u0010i\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u000e\"\u0004\bk\u0010\u0010R\u0011\u0010l\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010\u000eR\u001a\u0010n\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u001a\"\u0004\bp\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010r\u00a8\u0006s"}, d2 = {"Lcrocusoft/com/gez/adapters/FlightMultiCityAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "airportImage", "Landroid/widget/ImageView;", "getAirportImage", "()Landroid/widget/ImageView;", "setAirportImage", "(Landroid/widget/ImageView;)V", "airportName", "Landroid/widget/TextView;", "getAirportName", "()Landroid/widget/TextView;", "setAirportName", "(Landroid/widget/TextView;)V", "arrivalAirport", "getArrivalAirport", "setArrivalAirport", "arrivalTime", "getArrivalTime", "setArrivalTime", "baggageLayout", "Landroid/widget/LinearLayout;", "getBaggageLayout", "()Landroid/widget/LinearLayout;", "setBaggageLayout", "(Landroid/widget/LinearLayout;)V", "departAirport", "getDepartAirport", "setDepartAirport", "departTime", "getDepartTime", "setDepartTime", "firstAirportImage", "getFirstAirportImage", "setFirstAirportImage", "firstAirportName", "getFirstAirportName", "firstArrivalAirport", "getFirstArrivalAirport", "setFirstArrivalAirport", "firstArrivalTime", "getFirstArrivalTime", "setFirstArrivalTime", "firstDepartAirport", "getFirstDepartAirport", "setFirstDepartAirport", "firstDepartTime", "getFirstDepartTime", "setFirstDepartTime", "firstFlightDate", "getFirstFlightDate", "setFirstFlightDate", "firstFlightTime", "getFirstFlightTime", "flightTime", "getFlightTime", "setFlightTime", "forthAirportImage", "getForthAirportImage", "setForthAirportImage", "forthAirportName", "getForthAirportName", "forthArrivalAirport", "getForthArrivalAirport", "setForthArrivalAirport", "forthArrivalTime", "getForthArrivalTime", "setForthArrivalTime", "forthDepartAirport", "getForthDepartAirport", "setForthDepartAirport", "forthDepartTime", "getForthDepartTime", "setForthDepartTime", "forthFlightDate", "getForthFlightDate", "setForthFlightDate", "forthFlightTime", "getForthFlightTime", "forthLinear", "getForthLinear", "setForthLinear", "price", "getPrice", "setPrice", "thirdAirportImage", "getThirdAirportImage", "setThirdAirportImage", "thirdAirportName", "getThirdAirportName", "thirdArrivalAirport", "getThirdArrivalAirport", "setThirdArrivalAirport", "thirdArrivalTime", "getThirdArrivalTime", "setThirdArrivalTime", "thirdDepartAirport", "getThirdDepartAirport", "setThirdDepartAirport", "thirdDepartTime", "getThirdDepartTime", "setThirdDepartTime", "thirdFlightDate", "getThirdFlightDate", "setThirdFlightDate", "thirdFlightTime", "getThirdFlightTime", "thirdLinear", "getThirdLinear", "setThirdLinear", "getView", "()Landroid/view/View;", "app_debug"})
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
        private android.widget.ImageView airportImage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout thirdLinear;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout forthLinear;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView firstAirportName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView firstFlightTime = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView firstFlightDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView firstDepartTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView firstArrivalTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView firstArrivalAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView firstDepartAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView firstAirportImage;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView thirdAirportName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView thirdFlightTime = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView thirdFlightDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView thirdDepartTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView thirdArrivalTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView thirdArrivalAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView thirdDepartAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView thirdAirportImage;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView forthAirportName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView forthFlightTime = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView forthFlightDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView forthDepartTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView forthArrivalTime;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView forthArrivalAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView forthDepartAirport;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView forthAirportImage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout baggageLayout;
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
        public final android.widget.ImageView getAirportImage() {
            return null;
        }
        
        public final void setAirportImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getThirdLinear() {
            return null;
        }
        
        public final void setThirdLinear(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getForthLinear() {
            return null;
        }
        
        public final void setForthLinear(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstAirportName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstFlightTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstFlightDate() {
            return null;
        }
        
        public final void setFirstFlightDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstDepartTime() {
            return null;
        }
        
        public final void setFirstDepartTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstArrivalTime() {
            return null;
        }
        
        public final void setFirstArrivalTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstArrivalAirport() {
            return null;
        }
        
        public final void setFirstArrivalAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getFirstDepartAirport() {
            return null;
        }
        
        public final void setFirstDepartAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFirstAirportImage() {
            return null;
        }
        
        public final void setFirstAirportImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdAirportName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdFlightTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdFlightDate() {
            return null;
        }
        
        public final void setThirdFlightDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdDepartTime() {
            return null;
        }
        
        public final void setThirdDepartTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdArrivalTime() {
            return null;
        }
        
        public final void setThirdArrivalTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdArrivalAirport() {
            return null;
        }
        
        public final void setThirdArrivalAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getThirdDepartAirport() {
            return null;
        }
        
        public final void setThirdDepartAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getThirdAirportImage() {
            return null;
        }
        
        public final void setThirdAirportImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthAirportName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthFlightTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthFlightDate() {
            return null;
        }
        
        public final void setForthFlightDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthDepartTime() {
            return null;
        }
        
        public final void setForthDepartTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthArrivalTime() {
            return null;
        }
        
        public final void setForthArrivalTime(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthArrivalAirport() {
            return null;
        }
        
        public final void setForthArrivalAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getForthDepartAirport() {
            return null;
        }
        
        public final void setForthDepartAirport(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getForthAirportImage() {
            return null;
        }
        
        public final void setForthAirportImage(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getBaggageLayout() {
            return null;
        }
        
        public final void setBaggageLayout(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
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