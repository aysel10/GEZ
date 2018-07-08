package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRDReturnActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "filterButton", "Landroid/widget/ImageButton;", "filterSpinner", "Landroid/widget/Spinner;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "returnTicketsList", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/view_model/OriginDestinationOptionItemViewModel;", "getReturnTicketsList", "()Ljava/util/ArrayList;", "setReturnTicketsList", "(Ljava/util/ArrayList;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "affectOnItemClick", "listener", "Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnClickListener;", "affectOnItemClicks", "onClick", "onLongClick", "Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnLongClickListener;", "affectOnLongItemClick", "RecyclerItemClickListener", "VerticalSpaceItemDecoration", "app_debug"})
public final class FlightRDReturnActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> returnTicketsList;
    private android.support.v7.widget.RecyclerView recyclerView;
    private android.widget.Spinner filterSpinner;
    private android.widget.ImageButton filterButton;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> getReturnTicketsList() {
        return null;
    }
    
    public final void setReturnTicketsList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void affectOnItemClick(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnClickListener listener) {
    }
    
    public final void affectOnLongItemClick(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnLongClickListener listener) {
    }
    
    public final void affectOnItemClicks(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView $receiver, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnClickListener onClick, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnLongClickListener onLongClick) {
    }
    
    public FlightRDReturnActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRDReturnActivity$VerticalSpaceItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "verticalSpaceHeight", "", "(Lcrocusoft/com/gez/activities/FlightRDReturnActivity;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener;", "Landroid/support/v7/widget/RecyclerView$OnChildAttachStateChangeListener;", "mRecycler", "Landroid/support/v7/widget/RecyclerView;", "clickListener", "Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnClickListener;", "longClickListener", "Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnLongClickListener;", "(Landroid/support/v7/widget/RecyclerView;Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnClickListener;Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnLongClickListener;)V", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "setOnChildAttachedToWindow", "v", "OnClickListener", "OnLongClickListener", "app_debug"})
    public static final class RecyclerItemClickListener implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener {
        private final android.support.v7.widget.RecyclerView mRecycler = null;
        private final crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnClickListener clickListener = null;
        private final crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnLongClickListener longClickListener = null;
        
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
        crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnClickListener clickListener, @org.jetbrains.annotations.Nullable()
        crocusoft.com.gez.activities.FlightRDReturnActivity.RecyclerItemClickListener.OnLongClickListener longClickListener) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnClickListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
        public static abstract interface OnClickListener {
            
            public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
            android.view.View view);
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/FlightRDReturnActivity$RecyclerItemClickListener$OnLongClickListener;", "", "onLongItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
        public static abstract interface OnLongClickListener {
            
            public abstract void onLongItemClick(int position, @org.jetbrains.annotations.NotNull()
            android.view.View view);
        }
    }
}