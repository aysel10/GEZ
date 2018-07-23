package crocusoft.com.gez.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0004J\u0010\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004H\u0002J\u0006\u0010L\u001a\u00020CJ\b\u0010M\u001a\u00020NH\u0002J\u000e\u0010O\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010P\u001a\u00020IJ\u0012\u0010Q\u001a\u00020C2\b\u0010R\u001a\u0004\u0018\u00010SH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001a\u00109\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 \u00a8\u0006T"}, d2 = {"Lcrocusoft/com/gez/activities/FlightBookTicketActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "birthDate", "", "getBirthDate", "()Ljava/lang/String;", "setBirthDate", "(Ljava/lang/String;)V", "combId", "getCombId", "setCombId", "creditButton", "Landroid/widget/Button;", "getCreditButton", "()Landroid/widget/Button;", "setCreditButton", "(Landroid/widget/Button;)V", "dateOfBirth", "Landroid/widget/TextView;", "getDateOfBirth", "()Landroid/widget/TextView;", "setDateOfBirth", "(Landroid/widget/TextView;)V", "email", "getEmail", "setEmail", "emailEditText", "Landroid/widget/EditText;", "getEmailEditText", "()Landroid/widget/EditText;", "setEmailEditText", "(Landroid/widget/EditText;)V", "middleName", "getMiddleName", "setMiddleName", "middleNameEditText", "getMiddleNameEditText", "setMiddleNameEditText", "name", "getName", "setName", "nameEditText", "getNameEditText", "setNameEditText", "pasport", "getPasport", "setPasport", "passportEditText", "getPassportEditText", "setPassportEditText", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "phoneNumberEditText", "getPhoneNumberEditText", "setPhoneNumberEditText", "recId", "getRecId", "setRecId", "surname", "getSurname", "setSurname", "surnameEditText", "getSurnameEditText", "setSurnameEditText", "bookFlightRequest", "", "service", "Lcrocusoft/com/gez/services/RetrofitService;", "apiCallback", "Lcrocusoft/com/gez/services/RetrofitManager$Companion$BookFlightCallback;", "checkBirth", "", "dateString", "dateForm", "getPersonInfo", "initBuilder", "Landroid/app/AlertDialog$Builder;", "isEmailValid", "isValid", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class FlightBookTicketActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText nameEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText surnameEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText passportEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText middleNameEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText phoneNumberEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView dateOfBirth;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText emailEditText;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button creditButton;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String surname;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pasport;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String middleName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String birthDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String combId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String recId;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getNameEditText() {
        return null;
    }
    
    public final void setNameEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getSurnameEditText() {
        return null;
    }
    
    public final void setSurnameEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPassportEditText() {
        return null;
    }
    
    public final void setPassportEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMiddleNameEditText() {
        return null;
    }
    
    public final void setMiddleNameEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPhoneNumberEditText() {
        return null;
    }
    
    public final void setPhoneNumberEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDateOfBirth() {
        return null;
    }
    
    public final void setDateOfBirth(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEmailEditText() {
        return null;
    }
    
    public final void setEmailEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getCreditButton() {
        return null;
    }
    
    public final void setCreditButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSurname() {
        return null;
    }
    
    public final void setSurname(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPasport() {
        return null;
    }
    
    public final void setPasport(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMiddleName() {
        return null;
    }
    
    public final void setMiddleName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthDate() {
        return null;
    }
    
    public final void setBirthDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCombId() {
        return null;
    }
    
    public final void setCombId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRecId() {
        return null;
    }
    
    public final void setRecId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void bookFlightRequest(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.services.RetrofitService service, @org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.services.RetrofitManager.Companion.BookFlightCallback apiCallback) {
    }
    
    private final java.lang.String dateForm(java.lang.String dateString) {
        return null;
    }
    
    public final void getPersonInfo() {
    }
    
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    private final android.app.AlertDialog.Builder initBuilder() {
        return null;
    }
    
    public final boolean checkBirth(@org.jetbrains.annotations.NotNull()
    java.lang.String dateString) {
        return false;
    }
    
    public FlightBookTicketActivity() {
        super();
    }
}