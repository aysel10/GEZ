package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\b\u0010+\u001a\u00020)H\u0002J\b\u0010,\u001a\u00020)H\u0002J\u0018\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006H\u0002J\u0018\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020)H\u0002J\u0012\u00102\u001a\u00020)2\b\u00103\u001a\u0004\u0018\u000104H\u0014J0\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u00062\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J0\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u00062\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0004j\b\u0012\u0004\u0012\u00020\u001b`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcrocusoft/com/gez/activities/FlightFilterActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "airlineList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAirlineList", "()Ljava/util/ArrayList;", "setAirlineList", "(Ljava/util/ArrayList;)V", "airlineNames", "airlinesCheckBoxLinearLayout", "Landroid/widget/LinearLayout;", "arrivalAirportCheckBoxLinearLayout", "arrivalAirportNames", "checkBox", "Landroid/widget/CheckBox;", "checkedAirlineList", "checkedArrivalAirportList", "db", "Lcrocusoft/com/gez/database/AppDatabase;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "newRoundtripReturnTicketsListDepart", "Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "newRoundtripTicketsListDepart", "newTicketsListDepart", "onePlusStopCheckBox", "oneStopCheckBox", "roundtripReturnTicketsListDepart", "roundtripTicketsListDepart", "sendButton", "Landroid/widget/Button;", "stopCheckBoxLinearLayout", "ticketModel", "Lcrocusoft/com/gez/flight_view_model/TicketDataViewModel;", "ticketsListDepart", "addStopCheckBoxView", "", "arriveTicketsListFill", "checkBoxOneWay", "checkBoxRoundtrip", "departTicketsList", "departTicketsListFill", "initBuilder", "Landroid/app/AlertDialog$Builder;", "listOfCheckedBox", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "oneWayAirlineFilter", "checkedList", "roundtripAirlineFilter", "app_debug"})
public final class FlightFilterActivity extends android.support.v7.app.AppCompatActivity {
    private android.widget.CheckBox checkBox;
    private android.widget.CheckBox oneStopCheckBox;
    private android.widget.CheckBox onePlusStopCheckBox;
    private android.widget.LinearLayout stopCheckBoxLinearLayout;
    private android.widget.LinearLayout arrivalAirportCheckBoxLinearLayout;
    private crocusoft.com.gez.flight_view_model.TicketDataViewModel ticketModel;
    private crocusoft.com.gez.database.AppDatabase db;
    private android.widget.Button sendButton;
    private android.widget.LinearLayout airlinesCheckBoxLinearLayout;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> ticketsListDepart;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> newTicketsListDepart;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> roundtripTicketsListDepart;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> roundtripReturnTicketsListDepart;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> newRoundtripTicketsListDepart;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> newRoundtripReturnTicketsListDepart;
    private java.util.ArrayList<java.lang.String> airlineNames;
    private java.util.ArrayList<java.lang.String> arrivalAirportNames;
    private java.util.ArrayList<java.lang.String> checkedAirlineList;
    private java.util.ArrayList<java.lang.String> checkedArrivalAirportList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> airlineList;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getAirlineList() {
        return null;
    }
    
    public final void setAirlineList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void listOfCheckedBox() {
    }
    
    private final void addStopCheckBoxView() {
    }
    
    private final void checkBoxOneWay() {
    }
    
    private final void checkBoxRoundtrip() {
    }
    
    private final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> oneWayAirlineFilter(java.util.ArrayList<java.lang.String> checkedList) {
        return null;
    }
    
    private final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> roundtripAirlineFilter(java.util.ArrayList<java.lang.String> checkedList) {
        return null;
    }
    
    private final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> departTicketsList() {
        return null;
    }
    
    private final android.app.AlertDialog.Builder initBuilder() {
        return null;
    }
    
    private final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> departTicketsListFill() {
        return null;
    }
    
    private final void arriveTicketsListFill() {
    }
    
    public FlightFilterActivity() {
        super();
    }
}