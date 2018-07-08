package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010$\u001a\u00020%J\u001a\u0010&\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)J\u0012\u0010*\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010$\u001a\u00020)R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWayActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "afch", "Lcrocusoft/com/gez/adapters/FlightOneWayAdapter;", "getAfch", "()Lcrocusoft/com/gez/adapters/FlightOneWayAdapter;", "combId", "", "getCombId", "()Ljava/lang/String;", "setCombId", "(Ljava/lang/String;)V", "combs", "", "Lcrocusoft/com/gez/pojo/response/flight/oneWayResponse/OriginDestinationCombinationItem;", "getCombs", "()Ljava/util/List;", "setCombs", "(Ljava/util/List;)V", "filterButton", "Landroid/widget/ImageButton;", "filterSpinner", "Landroid/widget/Spinner;", "linearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "listOfPrices", "Ljava/util/ArrayList;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "filterIsChecked", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "affectOnItemClick", "listener", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnClickListener;", "affectOnItemClicks", "onClick", "onLongClick", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnLongClickListener;", "affectOnLongItemClick", "VerticalSpaceItemDecoration", "app_debug"})
public final class FlightOneWayActivity extends android.support.v7.app.AppCompatActivity {
    private android.support.v7.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> combs;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String combId;
    @org.jetbrains.annotations.NotNull()
    private final crocusoft.com.gez.adapters.FlightOneWayAdapter afch = null;
    private android.widget.Spinner filterSpinner;
    private android.widget.ImageButton filterButton;
    private java.util.ArrayList<java.lang.String> listOfPrices;
    private android.support.v7.widget.LinearLayoutManager linearLayoutManager;
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
    public final crocusoft.com.gez.adapters.FlightOneWayAdapter getAfch() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    public FlightOneWayActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcrocusoft/com/gez/activities/FlightOneWayActivity$VerticalSpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "verticalSpaceHeight", "", "(Lcrocusoft/com/gez/activities/FlightOneWayActivity;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
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
}