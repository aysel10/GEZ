package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u000245B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020(H\u0002J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010,\u001a\u00020&*\u00020\u001d2\u0006\u0010-\u001a\u00020.J\u001a\u0010/\u001a\u00020&*\u00020\u001d2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u000202J\u0012\u00103\u001a\u00020&*\u00020\u001d2\u0006\u0010-\u001a\u000202R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u0019j\b\u0012\u0004\u0012\u00020!`\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRoundTripSorted;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "adapter", "Lcrocusoft/com/gez/adapters/ReturnTicketsAdapter;", "getAdapter", "()Lcrocusoft/com/gez/adapters/ReturnTicketsAdapter;", "combId", "", "getCombId", "()Ljava/lang/String;", "setCombId", "(Ljava/lang/String;)V", "combs", "", "Lcrocusoft/com/gez/pojo/response/flight/oneWayResponse/OriginDestinationCombinationItem;", "getCombs", "()Ljava/util/List;", "setCombs", "(Ljava/util/List;)V", "filterButton", "Landroid/widget/ImageButton;", "filterSpinner", "Landroid/widget/Spinner;", "pricedItinerary", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/flight_view_model/PricedItineraryItemViewModel;", "Lkotlin/collections/ArrayList;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "ticketModel", "Lcrocusoft/com/gez/flight_view_model/TicketDataViewModel;", "tickets", "Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "dpToPx", "", "dp", "filterIsChecked", "", "initBuilder", "Landroid/app/AlertDialog$Builder;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "affectOnItemClick", "listener", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnClickListener;", "affectOnItemClicks", "onClick", "onLongClick", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnLongClickListener;", "affectOnLongItemClick", "GridSpacingItemDecoration", "VerticalSpaceItemDecoration", "app_debug"})
public final class FlightRoundTripSorted extends android.support.v7.app.AppCompatActivity {
    private final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> tickets = null;
    private android.support.v7.widget.RecyclerView recyclerView;
    private android.widget.Spinner filterSpinner;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.PricedItineraryItemViewModel> pricedItinerary;
    private android.widget.ImageButton filterButton;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> combs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String combId;
    @org.jetbrains.annotations.NotNull()
    private final crocusoft.com.gez.adapters.ReturnTicketsAdapter adapter = null;
    private crocusoft.com.gez.flight_view_model.TicketDataViewModel ticketModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> getCombs() {
        return null;
    }
    
    public final void setCombs(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCombId() {
        return null;
    }
    
    public final void setCombId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.adapters.ReturnTicketsAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final android.app.AlertDialog.Builder initBuilder() {
        return null;
    }
    
    public final void filterIsChecked() {
    }
    
    public final void affectOnItemClick(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.RecyclerItemClickListener.OnClickListener listener) {
    }
    
    public final void affectOnLongItemClick(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.RecyclerItemClickListener.OnLongClickListener listener) {
    }
    
    public final void affectOnItemClicks(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.RecyclerItemClickListener.OnClickListener onClick, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.RecyclerItemClickListener.OnLongClickListener onLongClick) {
    }
    
    /**
     * * Converting dp to pixel
     */
    private final int dpToPx(int dp) {
        return 0;
    }
    
    public FlightRoundTripSorted() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRoundTripSorted$VerticalSpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "verticalSpaceHeight", "", "(Lcrocusoft/com/gez/activities/FlightRoundTripSorted;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
    public final class VerticalSpaceItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration {
        private final int verticalSpaceHeight = 0;
        
        @java.lang.Override()
        public void getItemOffsets(@org.jetbrains.annotations.NotNull()
        android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView.State state) {
        }
        
        public VerticalSpaceItemDecoration(int verticalSpaceHeight) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRoundTripSorted$GridSpacingItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "spanCount", "", "spacing", "includeEdge", "", "(Lcrocusoft/com/gez/activities/FlightRoundTripSorted;IIZ)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
    public final class GridSpacingItemDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration {
        private final int spanCount = 0;
        private final int spacing = 0;
        private final boolean includeEdge = false;
        
        @java.lang.Override()
        public void getItemOffsets(@org.jetbrains.annotations.NotNull()
        android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView parent, @org.jetbrains.annotations.Nullable()
        android.support.v7.widget.RecyclerView.State state) {
        }
        
        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            super();
        }
    }
}