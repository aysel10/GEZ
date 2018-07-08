package crocusoft.com.gez.activities

import android.app.AlertDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.pojo.request.bookFlight.*
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService
import crocusoft.com.gez.util.AppSharedPreferences
import crocusoft.com.gez.util.RetrofotManager
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.regex.Pattern


class FlightBookTicketOneWay : AppCompatActivity() {
    lateinit var nameEditText: EditText
    lateinit var surnameEditText: EditText
    lateinit var passportEditText: EditText
    lateinit var middleNameEditText: EditText
    lateinit var phoneNumberEditText: EditText
    lateinit var dateOfBirth: TextView
    lateinit var emailEditText: EditText
    lateinit var creditButton: Button
    var name = ""
    var surname = ""
    var email = ""
    var pasport = ""
    var middleName = ""
    var birthDate  = ""
    var phoneNumber = ""
    var combId = ""
    var recId = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = intent.extras
        setContentView(R.layout.activity_flight_book_ticket)
        combId = bundle.getString("combId")
        recId = bundle.getString("recId")
//        val firstTicket = bundle.getParcelable<OriginDestinationOptionItemViewModel>("firstTicket")
//        val secondTicket = bundle.getParcelable<OriginDestinationOptionItemViewModel>("secondTicket")
//        val firstTicket = bundle.getString("firstTicket")
//        val secondTicket = bundle.getString("secondTicket")
        nameEditText = findViewById(R.id.name)
        surnameEditText = findViewById(R.id.lastName)
        middleNameEditText = findViewById(R.id.middleName)
        passportEditText = findViewById(R.id.passport)
        phoneNumberEditText = findViewById(R.id.phoneNumber)
        dateOfBirth = findViewById(R.id.dateOfBirth)
        emailEditText = findViewById(R.id.email)
        creditButton = findViewById(R.id.creditButton)
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)
        val bundleSend = Bundle()
        RetrofotManager.datePicker(dateOfBirth,baseContext)
        creditButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(baseContext,FlightRoundTripInfo::class.java)
            if(isValid()) {
//                val dialog:AlertDialog = initBuilder().create()
//                dialog.getWindow().setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//                dialog.show()
//                dialog.setCancelable(false)
                bookFlightRequest(service,object : RetrofotManager.Companion.BookFlightCallback{
                    override fun onSuccess(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                      //  dialog.hide()
                        bundle.putString("recId",recId)
                        bundle.putString("combId",combId)
                        intent.putExtras(bundleSend)
                    }
                })
            }

        })
    }
    fun bookFlightRequest(service: RetrofitService,apiCallback: RetrofotManager.Companion.BookFlightCallback){
        val myPreferences = AppSharedPreferences(this)
        getPersonInfo()
        val addressLine : List<String> = ArrayList()
        (addressLine as ArrayList).add("Amadeus Rezervasyon Dağıtım Sistemleri A.Ş.")
        addressLine.add("Muallim Naci Caddesi No.41 Kat 4 Ortaköy")
        val postalCode = "34345"
        val cityName = "Istanbul"
        val paymentType = "None"
        val paymentFPType  ="FPCA"
        val ticketing = Ticketing("BookingOnly")

        val paymentTextItem1 = PaymentTextItem("TripName", "Payment Text")
        val paymentTextItem2 = PaymentTextItem("Notes","Payment Notes")

        val paymentTextList: List<PaymentTextItem> = ArrayList()
        (paymentTextList as ArrayList).add(paymentTextItem1)
        paymentTextList.add(paymentTextItem2)

        val billingAddress = BillingAddress(addressLine,postalCode,cityName)
        val paymentDetail = PaymentDetail(billingAddress,paymentType,paymentFPType)
        val paymentDetails = PaymentDetails(paymentDetail)

        val deliveryAddress = DeliveryAddress(addressLine,postalCode,cityName)
        val fulfillment = Fulfillment(deliveryAddress,paymentDetails,paymentTextList)
        val personName = PersonName("MR",name,surname)
        val document = Document("AZ","passport",pasport, "2020-01-01")
        val telephone = Telephone(phoneNumber,"","")
        val email = Email(email,"1")
        val airTraveler = AirTraveler(personName,email,"ADT",telephone,document,birthDate)
        val travelerInfo = TravelerInfo(airTraveler)
        val otaAirBookRQ = OTAAirBookRQ(fulfillment, ticketing, combId,null, travelerInfo, recId)
        val bookFlight = BookFlight(otaAirBookRQ)
        val soapBody = SoapBody(bookFlight)
        val authenticationSoapHeader = AuthenticationSoapHeader()
        val soapHeader = SoapHeader(authenticationSoapHeader)
        val soapEnvelope = SoapEnvelope(soapHeader, soapBody)
        val bookFlightRequest = BookFlightRequest(soapEnvelope)
        val call : Call<ResponseBody> = service.bookFlightRequest(bookFlightRequest, RetrofotManager.getHeader(myPreferences))
        call.enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                Log.e("ERROR",t!!.message.toString())
            }
            override fun onResponse(call: Call<ResponseBody>?, response: retrofit2.Response<ResponseBody>?) {

            }

        })
    }
    fun getPersonInfo(){
        name = nameEditText.text.toString()
        surname = surnameEditText.text.toString()
        phoneNumber = phoneNumberEditText.text.toString()
        pasport = passportEditText.text.toString()
        email = emailEditText.text.toString()
        middleName = middleNameEditText.text.toString()
        birthDate = dateOfBirth.text.toString()
    }
    fun isEmailValid(email: String): Boolean {
        return Pattern.compile(
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                        + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                        + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        ).matcher(email).matches()
    }
    fun isValid():Boolean{
        if(nameEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter name")
            return false
        }
        if(middleNameEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter middle name")
            return false
        }
        if(surnameEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter last name")
            return false
        }
        if(middleNameEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter middle name")
            return false
        }
        if(dateOfBirth.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter birthday")
            return false
        }
        if(passportEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter passport")
            return false
        }
        if(phoneNumberEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter phone number")
            return false
        }
        if(emailEditText.text.isEmpty()){
            RetrofotManager.toast(baseContext,"Enter email")
            return false
        }
        if(emailEditText.text.isNotEmpty()&&!isEmailValid(emailEditText.text.toString())){
            RetrofotManager.toast(baseContext,"Enter correct email")
            return false
        }
        return true
    }
    private fun initBuilder(): AlertDialog.Builder {
        val builder = AlertDialog.Builder(baseContext)
        val view:View = getLayoutInflater().inflate(R.layout.progress,null);
        builder.setView(view)
        //val dialog = builder.create()
        return builder
    }
}
