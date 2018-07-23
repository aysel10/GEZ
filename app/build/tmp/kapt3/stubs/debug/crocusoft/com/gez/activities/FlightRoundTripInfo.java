package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eJ\u001a\u0010\u001f\u001a\u00020\u0019*\u00020\f2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\u0012\u0010#\u001a\u00020\u0019*\u00020\f2\u0006\u0010\u001d\u001a\u00020\"R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006&"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRoundTripInfo;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "adapter", "Lcrocusoft/com/gez/adapters/FlightRoundTripInfoAdapter;", "getAdapter", "()Lcrocusoft/com/gez/adapters/FlightRoundTripInfoAdapter;", "continueBookingButton", "Landroid/widget/Button;", "mLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "tickets", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/flight_view_model/OriginDestinationOptionItemViewModel;", "Lkotlin/collections/ArrayList;", "getTickets", "()Ljava/util/ArrayList;", "setTickets", "(Ljava/util/ArrayList;)V", "dpToPx", "", "dp", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "affectOnItemClick", "listener", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnClickListener;", "affectOnItemClicks", "onClick", "onLongClick", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnLongClickListener;", "affectOnLongItemClick", "GridSpacingItemDecoration", "VerticalSpaceItemDecoration", "app_debug"})
public final class FlightRoundTripInfo extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> tickets;
    private android.support.v7.widget.RecyclerView recyclerView;
    private android.widget.Button continueBookingButton;
    @org.jetbrains.annotations.NotNull()
    private final crocusoft.com.gez.adapters.FlightRoundTripInfoAdapter adapter = null;
    private android.support.v7.widget.LinearLayoutManager mLayoutManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> getTickets() {
        return null;
    }
    
    public final void setTickets(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.adapters.FlightRoundTripInfoAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    public FlightRoundTripInfo() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRoundTripInfo$VerticalSpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "verticalSpaceHeight", "", "(Lcrocusoft/com/gez/activities/FlightRoundTripInfo;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRoundTripInfo$GridSpacingItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "spanCount", "", "spacing", "includeEdge", "", "(Lcrocusoft/com/gez/activities/FlightRoundTripInfo;IIZ)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
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