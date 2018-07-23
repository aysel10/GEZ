package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002+,B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020\u001d*\u00020\u00192\u0006\u0010$\u001a\u00020%J\u001a\u0010&\u001a\u00020\u001d*\u00020\u00192\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)J\u0012\u0010*\u001a\u00020\u001d*\u00020\u00192\u0006\u0010$\u001a\u00020)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0015j\b\u0012\u0004\u0012\u00020\u001b`\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWaySorted;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "adapter", "Lcrocusoft/com/gez/adapters/FlightOneWaySortAdapter;", "combId", "", "getCombId", "()Ljava/lang/String;", "setCombId", "(Ljava/lang/String;)V", "combs", "", "Lcrocusoft/com/gez/pojo/response/flight/oneWayResponse/OriginDestinationCombinationItem;", "getCombs", "()Ljava/util/List;", "setCombs", "(Ljava/util/List;)V", "filterSpinner", "Landroid/widget/Spinner;", "pricedItinerary", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/flight_view_model/PricedItineraryItemViewModel;", "Lkotlin/collections/ArrayList;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "tickets", "Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "filterIsChecked", "", "initBuilder", "Landroid/app/AlertDialog$Builder;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "affectOnItemClick", "listener", "Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnClickListener;", "affectOnItemClicks", "onClick", "onLongClick", "Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnLongClickListener;", "affectOnLongItemClick", "RecyclerItemClickListener", "VerticalSpaceItemDecoration", "app_debug"})
public final class FlightOneWaySorted extends android.support.v7.app.AppCompatActivity {
    private final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> tickets = null;
    private android.support.v7.widget.RecyclerView recyclerView;
    private android.widget.Spinner filterSpinner;
    private final crocusoft.com.gez.adapters.FlightOneWaySortAdapter adapter = null;
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.PricedItineraryItemViewModel> pricedItinerary;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> combs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String combId;
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
    crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnClickListener listener) {
    }
    
    public final void affectOnLongItemClick(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnLongClickListener listener) {
    }
    
    public final void affectOnItemClicks(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnClickListener onClick, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnLongClickListener onLongClick) {
    }
    
    public FlightOneWaySorted() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWaySorted$VerticalSpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "verticalSpaceHeight", "", "(Lcrocusoft/com/gez/activities/FlightOneWaySorted;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener;", "Landroid/support/v7/widget/RecyclerView$OnChildAttachStateChangeListener;", "mRecycler", "Landroid/support/v7/widget/RecyclerView;", "clickListener", "Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnClickListener;", "longClickListener", "Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnLongClickListener;", "(Landroid/support/v7/widget/RecyclerView;Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnClickListener;Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnLongClickListener;)V", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "setOnChildAttachedToWindow", "v", "OnClickListener", "OnLongClickListener", "app_debug"})
    public static final class RecyclerItemClickListener implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener {
        private final android.support.v7.widget.RecyclerView mRecycler = null;
        private final crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnClickListener clickListener = null;
        private final crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnLongClickListener longClickListener = null;
        
        @java.lang.Override()
        public void onChildViewDetachedFromWindow(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onChildViewAttachedToWindow(@org.jetbrains.annotations.Nullable()
        android.view.View view) {
        }
        
        private final void setOnChildAttachedToWindow(android.view.View v) {
        }
        
        public RecyclerItemClickListener(@org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView mRecycler, @org.jetbrains.annotations.Nullable()
        crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnClickListener clickListener, @org.jetbrains.annotations.Nullable()
        crocusoft.com.gez.activities.FlightOneWaySorted.RecyclerItemClickListener.OnLongClickListener longClickListener) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnClickListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
        public static abstract interface OnClickListener {
            
            public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
            android.view.View view);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWaySorted$RecyclerItemClickListener$OnLongClickListener;", "", "onLongItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
        public static abstract interface OnLongClickListener {
            
            public abstract void onLongItemClick(int position, @org.jetbrains.annotations.NotNull()
            android.view.View view);
        }
    }
}