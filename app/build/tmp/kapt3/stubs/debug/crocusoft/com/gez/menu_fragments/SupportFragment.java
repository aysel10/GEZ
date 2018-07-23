package crocusoft.com.gez.menu_fragments;

import java.lang.System;

/**
 * * A simple [Fragment] subclass.
 * * Activities that contain this fragment must implement the
 * * [SupportFragment.OnFragmentInteractionListener] interface
 * * to handle interaction events.
 * * Use the [SupportFragment.newInstance] factory method to
 * * create an instance of this fragment.
 * *
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002()B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\u0006\u0010\'\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcrocusoft/com/gez/menu_fragments/SupportFragment;", "Landroid/support/v4/app/Fragment;", "()V", "emailField", "Landroid/widget/EditText;", "getEmailField", "()Landroid/widget/EditText;", "setEmailField", "(Landroid/widget/EditText;)V", "listener", "Lcrocusoft/com/gez/menu_fragments/SupportFragment$OnFragmentInteractionListener;", "nameAndSurnameField", "param1", "", "param2", "phoneTextField", "sendButton", "Landroid/widget/Button;", "yourTextField", "isEmailValid", "", "email", "onAttach", "", "context", "Landroid/content/Context;", "onButtonPressed", "uri", "Landroid/net/Uri;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "validateFields", "Companion", "OnFragmentInteractionListener", "app_debug"})
public final class SupportFragment extends android.support.v4.app.Fragment {
    private java.lang.String param1;
    private java.lang.String param2;
    private crocusoft.com.gez.menu_fragments.SupportFragment.OnFragmentInteractionListener listener;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText emailField;
    private android.widget.EditText nameAndSurnameField;
    private android.widget.EditText yourTextField;
    private android.widget.EditText phoneTextField;
    private android.widget.Button sendButton;
    public static final crocusoft.com.gez.menu_fragments.SupportFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEmailField() {
        return null;
    }
    
    public final void setEmailField(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void onButtonPressed(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final boolean validateFields() {
        return false;
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public SupportFragment() {
        super();
    }
    
    /**
     * * Use this factory method to create a new instance of
     *         * this fragment using the provided parameters.
     *         *
     *         * @param param1 Parameter 1.
     *         * @param param2 Parameter 2.
     *         * @return A new instance of fragment SupportFragment.
     */
    @org.jetbrains.annotations.NotNull()
    public static final crocusoft.com.gez.menu_fragments.SupportFragment newInstance() {
        return null;
    }
    
    /**
     * * This interface must be implemented by activities that contain this
     *     * fragment to allow an interaction in this fragment to be communicated
     *     * to the activity and potentially other fragments contained in that
     *     * activity.
     *     *
     *     *
     *     * See the Android Training lesson [Communicating with Other Fragments]
     *     * (http://developer.android.com/training/basics/fragments/communicating.html)
     *     * for more information.
     */
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcrocusoft/com/gez/menu_fragments/SupportFragment$OnFragmentInteractionListener;", "", "onFragmentInteraction", "", "uri", "Landroid/net/Uri;", "app_debug"})
    public static abstract interface OnFragmentInteractionListener {
        
        public abstract void onFragmentInteraction(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcrocusoft/com/gez/menu_fragments/SupportFragment$Companion;", "", "()V", "newInstance", "Lcrocusoft/com/gez/menu_fragments/SupportFragment;", "app_debug"})
    public static final class Companion {
        
        /**
         * * Use this factory method to create a new instance of
         *         * this fragment using the provided parameters.
         *         *
         *         * @param param1 Parameter 1.
         *         * @param param2 Parameter 2.
         *         * @return A new instance of fragment SupportFragment.
         */
        @org.jetbrains.annotations.NotNull()
        public final crocusoft.com.gez.menu_fragments.SupportFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}