package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcrocusoft/com/gez/activities/RecyclerItemClickListener;", "Landroid/support/v7/widget/RecyclerView$OnChildAttachStateChangeListener;", "mRecycler", "Landroid/support/v7/widget/RecyclerView;", "clickListener", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnClickListener;", "longClickListener", "Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnLongClickListener;", "(Landroid/support/v7/widget/RecyclerView;Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnClickListener;Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnLongClickListener;)V", "onChildViewAttachedToWindow", "", "view", "Landroid/view/View;", "onChildViewDetachedFromWindow", "setOnChildAttachedToWindow", "v", "OnClickListener", "OnLongClickListener", "app_debug"})
public final class RecyclerItemClickListener implements android.support.v7.widget.RecyclerView.OnChildAttachStateChangeListener {
    private final android.support.v7.widget.RecyclerView mRecycler = null;
    private final crocusoft.com.gez.activities.RecyclerItemClickListener.OnClickListener clickListener = null;
    private final crocusoft.com.gez.activities.RecyclerItemClickListener.OnLongClickListener longClickListener = null;
    
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
    crocusoft.com.gez.activities.RecyclerItemClickListener.OnClickListener clickListener, @org.jetbrains.annotations.Nullable()
    crocusoft.com.gez.activities.RecyclerItemClickListener.OnLongClickListener longClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnClickListener;", "", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/RecyclerItemClickListener$OnLongClickListener;", "", "onLongItemClick", "", "position", "", "view", "Landroid/view/View;", "app_debug"})
    public static abstract interface OnLongClickListener {
        
        public abstract void onLongItemClick(int position, @org.jetbrains.annotations.NotNull()
        android.view.View view);
    }
}