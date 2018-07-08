package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcrocusoft/com/gez/activities/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcrocusoft/com/gez/fragments/MenuFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/TrainFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/CarsFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/HotelFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/TransferFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/FlightFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/menu_fragments/ProfileFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/menu_fragments/SupportFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/menu_fragments/AboutFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/menu_fragments/BonusFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/menu_fragments/ContactsFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/ContentFragment$OnFragmentInteractionListener;", "Lcrocusoft/com/gez/fragments/GezAzFragment$OnFragmentInteractionListener;", "()V", "mDrawer", "Landroid/support/v4/widget/DrawerLayout;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "onContextItemSelected", "", "item", "Landroid/view/MenuItem;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentInteraction", "uri", "Landroid/net/Uri;", "onOptionsItemSelected", "selectDrawerItem", "menuItem", "Companion", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements crocusoft.com.gez.fragments.MenuFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.TrainFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.CarsFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.HotelFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.TransferFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.FlightFragment.OnFragmentInteractionListener, crocusoft.com.gez.menu_fragments.ProfileFragment.OnFragmentInteractionListener, crocusoft.com.gez.menu_fragments.SupportFragment.OnFragmentInteractionListener, crocusoft.com.gez.menu_fragments.AboutFragment.OnFragmentInteractionListener, crocusoft.com.gez.menu_fragments.BonusFragment.OnFragmentInteractionListener, crocusoft.com.gez.menu_fragments.ContactsFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.ContentFragment.OnFragmentInteractionListener, crocusoft.com.gez.fragments.GezAzFragment.OnFragmentInteractionListener {
    private android.support.v4.widget.DrawerLayout mDrawer;
    private android.support.v7.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.Object currentFragment;
    public static final crocusoft.com.gez.activities.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onFragmentInteraction(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void selectDrawerItem(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
    }
    
    @java.lang.Override()
    public boolean onContextItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcrocusoft/com/gez/activities/MainActivity$Companion;", "", "()V", "currentFragment", "getCurrentFragment", "()Ljava/lang/Object;", "setCurrentFragment", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object getCurrentFragment() {
            return null;
        }
        
        public final void setCurrentFragment(@org.jetbrains.annotations.NotNull()
        java.lang.Object p0) {
        }
        
        private Companion() {
            super();
        }
    }
}