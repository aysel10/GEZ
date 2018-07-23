package crocusoft.com.gez.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u009d\u00012\u00020\u0001:\u0004\u009d\u0001\u009e\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010c\u001a\u00020dH\u0002J\u001a\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\b\u0010j\u001a\u00020dH\u0002J\u0010\u0010k\u001a\u00020d2\u0006\u0010l\u001a\u00020mH\u0002J\u0010\u0010n\u001a\u00020d2\u0006\u0010o\u001a\u00020pH\u0002J\b\u0010q\u001a\u00020dH\u0002J\u0010\u0010r\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020\u000fH\u0002J\u0016\u0010t\u001a\u00020d2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\u0006J\u000e\u0010x\u001a\u00020d2\u0006\u0010y\u001a\u00020zJ\b\u0010{\u001a\u00020|H\u0002J\"\u0010}\u001a\u00020d2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010w\u001a\u00020\u0006H\u0002J\u001a\u0010~\u001a\u00020d2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\u001a\u0010\u007f\u001a\u00020#2\u0007\u0010\u0080\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u000fH\u0002J%\u0010\u0082\u0001\u001a\u00020d2\u0006\u0010l\u001a\u00020m2\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\u0011\u0010\u0087\u0001\u001a\u00020d2\u0006\u0010u\u001a\u00020vH\u0016J\u0011\u0010\u0088\u0001\u001a\u00020d2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\u0014\u0010\u008b\u0001\u001a\u00020d2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010pH\u0016J(\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010i2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010pH\u0016J\t\u0010\u008e\u0001\u001a\u00020dH\u0016J%\u0010\u008f\u0001\u001a\u00020d2\u0006\u0010l\u001a\u00020m2\b\u0010\u0083\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0002J\t\u0010\u0093\u0001\u001a\u00020dH\u0002J%\u0010\u0094\u0001\u001a\u00020d2\u0006\u0010l\u001a\u00020m2\b\u0010\u0083\u0001\u001a\u00030\u0095\u00012\b\u0010\u0085\u0001\u001a\u00030\u0096\u0001H\u0002J\t\u0010\u0097\u0001\u001a\u00020dH\u0002J\u001b\u0010\u0098\u0001\u001a\u00020d2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010iH\u0002J\t\u0010\u0099\u0001\u001a\u00020#H\u0002J\t\u0010\u009a\u0001\u001a\u00020#H\u0002J\t\u0010\u009b\u0001\u001a\u00020#H\u0002J\u000b\u0010\u009c\u0001\u001a\u00020#*\u00020vR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0012\u0012\u0004\u0012\u00020302j\b\u0012\u0004\u0012\u000203`4X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0010\u0010H\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020KX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020KX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0019\"\u0004\bV\u0010\u001bR\u000e\u0010W\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010X\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010E\"\u0004\bZ\u0010GR\u001a\u0010[\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0019\"\u0004\b]\u0010\u001bR\u000e\u0010^\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010_\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010E\"\u0004\ba\u0010GR\u000e\u0010b\u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u009f\u0001"}, d2 = {"Lcrocusoft/com/gez/fragments/FlightFragment;", "Landroid/support/v4/app/Fragment;", "()V", "addButton", "Landroid/widget/Button;", "addRemoveView", "Landroid/view/View;", "adultCountPicker", "Landroid/widget/Spinner;", "buttonLinearLayout", "Landroid/widget/LinearLayout;", "childCountPicker", "clickCounter", "", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "departDatePicker", "Landroid/widget/TextView;", "destinationLocation", "Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/DestinationLocation;", "getDestinationLocation", "()Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/DestinationLocation;", "setDestinationLocation", "(Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/DestinationLocation;)V", "elementsLinearLayout", "fifthFlightMultiCity", "firstLabel", "forthFlightMultiCity", "fromAutoComplete", "Landroid/widget/AutoCompleteTextView;", "isCity", "", "()Z", "setCity", "(Z)V", "listener", "Lcrocusoft/com/gez/fragments/FlightFragment$OnFragmentInteractionListener;", "mDb", "Lcrocusoft/com/gez/database/AppDatabase;", "mDbWorkerThread", "Lcrocusoft/com/gez/database/DBWorkerThread;", "mUiHandler", "Landroid/os/Handler;", "mainLinearLayout", "mainSearchButton", "multiDestinationList", "Ljava/util/ArrayList;", "Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/OriginDestinationInformation_;", "Lkotlin/collections/ArrayList;", "multyCityLinearLayout", "oneWayDestination", "Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/DestinationLocation;", "getOneWayDestination", "()Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/DestinationLocation;", "setOneWayDestination", "(Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/DestinationLocation;)V", "oneWayOriginLocation", "Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/OriginLocation;", "getOneWayOriginLocation", "()Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/OriginLocation;", "setOneWayOriginLocation", "(Lcrocusoft/com/gez/pojo/request/searchOnewayFlight/OriginLocation;)V", "originLocation", "Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/OriginLocation;", "getOriginLocation", "()Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/OriginLocation;", "setOriginLocation", "(Lcrocusoft/com/gez/pojo/request/searchRoundtripFlight/OriginLocation;)V", "param1", "param2", "radioMultyCity", "Landroid/widget/RadioButton;", "radioOneWay", "radioRoundTrip", "removeButton", "returnDatePicker", "returnTextView", "scrollView", "Landroid/support/v4/widget/NestedScrollView;", "searchMultiButton", "secondDestinationLocation", "getSecondDestinationLocation", "setSecondDestinationLocation", "secondFlightMultiCity", "secondOriginLocation", "getSecondOriginLocation", "setSecondOriginLocation", "thirdDestinationLocation", "getThirdDestinationLocation", "setThirdDestinationLocation", "thirdFlightMultiCity", "thirdOriginLocation", "getThirdOriginLocation", "setThirdOriginLocation", "toAutoComplete", "addFirstLabel", "", "addMultiCityView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "addMultiFlightView", "airportImagesVerification", "service", "Lcrocusoft/com/gez/services/RetrofitService;", "bundleForOneWay", "bundle", "Landroid/os/Bundle;", "closeKeyboard", "dateForm", "dateString", "hideKeyboardFrom", "context", "Landroid/content/Context;", "view", "hideSoftKeyboard", "activity", "Landroid/app/Activity;", "initBuilder", "Landroid/app/AlertDialog$Builder;", "initMainView", "initMultiViews", "isCorrectDates", "depart", "arrive", "multiCityFlightSearch", "apiCallback", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$MultiCityApiCallback;", "apiCallbackFailure", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$MultiCityApiCallbackFailure;", "onAttach", "onButtonPressed", "uri", "Landroid/net/Uri;", "onCreate", "savedInstanceState", "onCreateView", "onDetach", "oneWayFlightSearch", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$OneWayApiCallback;", "apiOneWayCallbackFailure", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$OneWayApiCallbackFailure;", "removeLastMultiFlightView", "roundTripFlightSearch", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$ApiCallback;", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$ApiCallbackFailure;", "secondMultiCityContent", "setClickListeners", "validateFieldsMultiCity", "validateFieldsOneWay", "validateFieldsRoundTrip", "isConnectedToInternet", "Companion", "OnFragmentInteractionListener", "app_debug"})
public final class FlightFragment extends android.support.v4.app.Fragment {
    private android.widget.RadioButton radioMultyCity;
    private android.widget.LinearLayout multyCityLinearLayout;
    private android.widget.LinearLayout buttonLinearLayout;
    private android.widget.LinearLayout elementsLinearLayout;
    private android.support.v4.widget.NestedScrollView scrollView;
    private android.view.View secondFlightMultiCity;
    private android.view.View thirdFlightMultiCity;
    private android.view.View forthFlightMultiCity;
    private android.view.View fifthFlightMultiCity;
    private android.widget.RadioButton radioRoundTrip;
    private android.widget.RadioButton radioOneWay;
    private android.widget.Button mainSearchButton;
    private android.widget.TextView firstLabel;
    private android.widget.Button searchMultiButton;
    private android.widget.TextView returnTextView;
    private android.widget.TextView returnDatePicker;
    private android.widget.Spinner adultCountPicker;
    private android.widget.Spinner childCountPicker;
    private android.widget.TextView departDatePicker;
    private android.widget.AutoCompleteTextView fromAutoComplete;
    private android.widget.AutoCompleteTextView toAutoComplete;
    private final java.util.ArrayList<crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginDestinationInformation_> multiDestinationList = null;
    private int clickCounter;
    private boolean isCity;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String code;
    private android.widget.LinearLayout mainLinearLayout;
    private android.view.View addRemoveView;
    private android.widget.Button addButton;
    private android.widget.Button removeButton;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation originLocation;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation destinationLocation;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation secondOriginLocation;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation secondDestinationLocation;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation thirdOriginLocation;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation thirdDestinationLocation;
    private crocusoft.com.gez.database.DBWorkerThread mDbWorkerThread;
    private crocusoft.com.gez.database.AppDatabase mDb;
    private final android.os.Handler mUiHandler = null;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation oneWayOriginLocation;
    @org.jetbrains.annotations.NotNull()
    private crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation oneWayDestination;
    private java.lang.String param1;
    private java.lang.String param2;
    private crocusoft.com.gez.fragments.FlightFragment.OnFragmentInteractionListener listener;
    public static final crocusoft.com.gez.fragments.FlightFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isCity() {
        return false;
    }
    
    public final void setCity(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode() {
        return null;
    }
    
    public final void setCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation getOriginLocation() {
        return null;
    }
    
    public final void setOriginLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation getDestinationLocation() {
        return null;
    }
    
    public final void setDestinationLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation getSecondOriginLocation() {
        return null;
    }
    
    public final void setSecondOriginLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation getSecondDestinationLocation() {
        return null;
    }
    
    public final void setSecondDestinationLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation getThirdOriginLocation() {
        return null;
    }
    
    public final void setThirdOriginLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.OriginLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation getThirdDestinationLocation() {
        return null;
    }
    
    public final void setThirdDestinationLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchRoundtripFlight.DestinationLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation getOneWayOriginLocation() {
        return null;
    }
    
    public final void setOneWayOriginLocation(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchOnewayFlight.OriginLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation getOneWayDestination() {
        return null;
    }
    
    public final void setOneWayDestination(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.request.searchOnewayFlight.DestinationLocation p0) {
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
    
    private final void initMainView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.view.View view) {
    }
    
    private final void bundleForOneWay(android.os.Bundle bundle) {
    }
    
    private final java.lang.String dateForm(java.lang.String dateString) {
        return null;
    }
    
    public final void hideKeyboardFrom(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    private final void closeKeyboard() {
    }
    
    private final android.app.AlertDialog.Builder initBuilder() {
        return null;
    }
    
    private final boolean validateFieldsOneWay() {
        return false;
    }
    
    private final boolean isCorrectDates(java.lang.String depart, java.lang.String arrive) {
        return false;
    }
    
    private final boolean validateFieldsRoundTrip() {
        return false;
    }
    
    private final boolean validateFieldsMultiCity() {
        return false;
    }
    
    private final void roundTripFlightSearch(crocusoft.com.gez.services.RetrofitService service, crocusoft.com.gez.services.RetrofitManager.Companion.ApiCallback apiCallback, crocusoft.com.gez.services.RetrofitManager.Companion.ApiCallbackFailure apiCallbackFailure) {
    }
    
    public final boolean isConnectedToInternet(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver) {
        return false;
    }
    
    private final void oneWayFlightSearch(crocusoft.com.gez.services.RetrofitService service, crocusoft.com.gez.services.RetrofitManager.Companion.OneWayApiCallback apiCallback, crocusoft.com.gez.services.RetrofitManager.Companion.OneWayApiCallbackFailure apiOneWayCallbackFailure) {
    }
    
    private final void multiCityFlightSearch(crocusoft.com.gez.services.RetrofitService service, crocusoft.com.gez.services.RetrofitManager.Companion.MultiCityApiCallback apiCallback, crocusoft.com.gez.services.RetrofitManager.Companion.MultiCityApiCallbackFailure apiCallbackFailure) {
    }
    
    private final void setClickListeners(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
    }
    
    private final void addFirstLabel() {
    }
    
    private final void addMultiCityView(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
    }
    
    private final void initMultiViews(android.view.LayoutInflater inflater, android.view.ViewGroup container) {
    }
    
    private final void addMultiFlightView() {
    }
    
    private final void removeLastMultiFlightView() {
    }
    
    private final void secondMultiCityContent() {
    }
    
    public final void onButtonPressed(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    private final void airportImagesVerification(crocusoft.com.gez.services.RetrofitService service) {
    }
    
    public FlightFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final crocusoft.com.gez.fragments.FlightFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcrocusoft/com/gez/fragments/FlightFragment$OnFragmentInteractionListener;", "", "onFragmentInteraction", "", "uri", "Landroid/net/Uri;", "app_debug"})
    public static abstract interface OnFragmentInteractionListener {
        
        public abstract void onFragmentInteraction(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcrocusoft/com/gez/fragments/FlightFragment$Companion;", "", "()V", "newInstance", "Lcrocusoft/com/gez/fragments/FlightFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final crocusoft.com.gez.fragments.FlightFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}