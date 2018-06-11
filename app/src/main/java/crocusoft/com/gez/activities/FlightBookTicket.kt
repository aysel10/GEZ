package crocusoft.com.gez.activities

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import crocusoft.com.gez.R
import crocusoft.com.gez.pojo.request.bookFlight.*
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback



class FlightBookTicket : AppCompatActivity() {
    lateinit var nameEditText: EditText
    lateinit var surnameEditText: EditText
    lateinit var passportEditText: EditText
    lateinit var middleNameEditText: EditText
    lateinit var phoneNumberEditText: EditText
    lateinit var dateOfBirthEditText: EditText
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
        combId = bundle.getString("combId")
        recId = bundle.getString("recId")

        setContentView(R.layout.activity_flight_book_ticket)
        nameEditText = findViewById(R.id.name)
        surnameEditText = findViewById(R.id.lastName)
        middleNameEditText = findViewById(R.id.middleName)
        passportEditText = findViewById(R.id.passport)
        phoneNumberEditText = findViewById(R.id.phoneNumber)
        dateOfBirthEditText = findViewById(R.id.dateOfBirth)
        emailEditText = findViewById(R.id.email)
        creditButton = findViewById(R.id.creditButton)
        val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)

        creditButton.setOnClickListener(View.OnClickListener {
           bookFlightRequest(service)
        })
    }

    fun bookFlightRequest(service: RetrofitService){
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
        val call : Call<ResponseBody> = service.bookFlightRequest(bookFlightRequest)
        call.enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                Log.e("ERROR",t!!.message)
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
        birthDate = dateOfBirthEditText.text.toString()
    }

}
