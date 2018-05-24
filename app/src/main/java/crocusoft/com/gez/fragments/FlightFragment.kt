package crocusoft.com.gez.fragments

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.widget.NestedScrollView
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import crocusoft.com.gez.R
import crocusoft.com.gez.util.Utils
import crocusoft.com.gez.activities.FlightTicketsActivity
import crocusoft.com.gez.services.RetrofitClient
import crocusoft.com.gez.services.RetrofitService
import kotlinx.android.synthetic.main.flight_multy_city.view.*
import okhttp3.internal.Util


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var radioMultyCity : RadioButton
private lateinit var multyCityLinearLayout : LinearLayout
private lateinit var buttonLinearLayout : LinearLayout
private lateinit var elementsLinearLayout: LinearLayout
private lateinit var scrollView : NestedScrollView
private lateinit var secondFlightMultiCity : View
private lateinit var thirdFlightMultiCity : View
private lateinit var forthFlightMultiCity : View
private lateinit var fifthFlightMultiCity : View
private lateinit var radioRoundTrip : RadioButton
private lateinit var radioOneWay : RadioButton
private lateinit var secondCountLabel : TextView
private lateinit var thirdCountLabel : TextView
private lateinit var fourthCountLabel : TextView
private lateinit var fifthCountLabel : TextView
private lateinit var mainSearchButton : Button
private lateinit var firstLabel : TextView
private lateinit var returnTextView : TextView
private lateinit var returnDatePicker : EditText
private lateinit var departDatePicker : EditText
private var clickCounter : Int = 0

private lateinit var mainLinearLayout : LinearLayout
private lateinit var addRemoveView : View
private lateinit var addButton: Button
private lateinit var removeButton: Button

class FlightFragment : Fragment(){


    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_flight, container, false)



        initMainView(inflater,container,view)

        return  view
    }

    private fun initMainView(inflater: LayoutInflater, container: ViewGroup?,view : View){

        firstLabel = TextView(context)
        multyCityLinearLayout = LinearLayout(context)
        buttonLinearLayout = LinearLayout(context)

        radioMultyCity = view.findViewById(R.id.radioMultyCity)
        scrollView = view.findViewById(R.id.scrollView)
        mainSearchButton = view.findViewById(R.id.searchButton)
        elementsLinearLayout = view.findViewById(R.id.elementsLinearLayout)
        mainLinearLayout = view.findViewById(R.id.mainLinearLayout)
        radioRoundTrip = view.findViewById(R.id.radioRoundTrip)
        radioOneWay = view.findViewById(R.id.radioOneWay)
        returnTextView = view.findViewById(R.id.returnTextView)
        returnDatePicker = view.findViewById(R.id.returnDate)
        departDatePicker = view.findViewById(R.id.departDate)

        Utils.datePicker(returnDatePicker, context!!)
        Utils.datePicker(departDatePicker, context!!)

        setClickListeners(inflater,container)
        mainSearchButton.setOnClickListener(View.OnClickListener {
//            var intent: Intent = Intent(context,FlightTicketsActivity::class.java)
//            startActivity(intent)

            val service = RetrofitClient().getClient()!!.create<RetrofitService>(RetrofitService::class.java!!)

            Utils.oneWayFlightSearch(service)
        })
    }

    private fun setClickListeners(inflater: LayoutInflater, container: ViewGroup?){
        radioMultyCity.setOnClickListener(View.OnClickListener {
            mainSearchButton.visibility = View.GONE
            addFirstLabel()
            addMultiCityView(inflater,container)
            radioMultyCity.isEnabled = false
        })
        radioOneWay.setOnClickListener(View.OnClickListener {
            mainSearchButton.visibility = View.VISIBLE
            returnTextView.visibility = View.INVISIBLE
            returnDatePicker.visibility = View.INVISIBLE
            elementsLinearLayout.removeView(firstLabel)
            multyCityLinearLayout.removeAllViews()
            mainLinearLayout.removeView(multyCityLinearLayout)
            mainLinearLayout.removeView(buttonLinearLayout)
            radioMultyCity.isEnabled = true
        })
        radioRoundTrip.setOnClickListener(View.OnClickListener {
            mainSearchButton.visibility = View.VISIBLE
            returnTextView.visibility = View.VISIBLE
            returnDatePicker.visibility = View.VISIBLE
            elementsLinearLayout.removeView(firstLabel)
            multyCityLinearLayout.removeAllViews()
            mainLinearLayout.removeView(multyCityLinearLayout)
            mainLinearLayout.removeView(buttonLinearLayout)
            radioMultyCity.isEnabled = true
        })
    }

    private fun addFirstLabel(){
        firstLabel.setText(R.string.firstFlight)
        firstLabel.setTextColor(resources.getColor(R.color.colorAccent))
        firstLabel.setBackgroundDrawable(resources.getDrawable(R.drawable.grey_round))
        firstLabel.setTextSize(TypedValue.COMPLEX_UNIT_PX,resources.getDimension(R.dimen.fontSize))
        firstLabel.gravity = Gravity.CENTER
        //firstLabel.layoutParams.height = 100
        firstLabel.setTypeface(null,Typeface.BOLD)
        elementsLinearLayout.addView(firstLabel)
    }

    private fun addMultiCityView(inflater: LayoutInflater, container: ViewGroup?){
        initMultiViews(inflater,container)
        multyCityLinearLayout.orientation = LinearLayout.VERTICAL
        multyCityLinearLayout.addView(secondFlightMultiCity)
        buttonLinearLayout.addView(addRemoveView)
        mainLinearLayout.addView(multyCityLinearLayout)
        mainLinearLayout.addView(buttonLinearLayout)
        addButton.setOnClickListener(View.OnClickListener {
            addMultiFlightView()
        })
        removeButton.setOnClickListener(View.OnClickListener {
            removeLastMultiFlightView()
        })

    }

    private fun initMultiViews(inflater: LayoutInflater, container: ViewGroup?){
        secondFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container,false)
        thirdFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container,false)
        forthFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container,false)
        fifthFlightMultiCity = inflater.inflate(R.layout.flight_multy_city,container, false)
        addRemoveView = inflater.inflate(R.layout.add_remove_buttons,container,false)
        addButton = addRemoveView.findViewById(R.id.addButton)
        removeButton = addRemoveView.findViewById(R.id.removeButton)
        secondFlightMultiCity.flightCountLabel.setText(R.string.secondFlight)
    }
    private fun addMultiFlightView(){
        if (clickCounter<3) {
            clickCounter++
            when(clickCounter){
                1-> {
                    multyCityLinearLayout.addView(thirdFlightMultiCity)
                    thirdFlightMultiCity.
                            flightCountLabel.setText(R.string.thirdFlight)
                }
                2-> {
                    multyCityLinearLayout.addView(forthFlightMultiCity)
                    forthFlightMultiCity.flightCountLabel.setText(R.string.forthFlight)
                }

                3-> {
                    multyCityLinearLayout.addView(fifthFlightMultiCity)
                    fifthFlightMultiCity.flightCountLabel.setText(R.string.fifthFlight)
                }
            }
        }

    }
    private fun removeLastMultiFlightView(){
        if(clickCounter>0){
            when(clickCounter){
                1-> multyCityLinearLayout.removeView(thirdFlightMultiCity)
                2-> multyCityLinearLayout.removeView(forthFlightMultiCity)
                3-> multyCityLinearLayout.removeView(fifthFlightMultiCity)
            }
            clickCounter--
        }
    }




    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
                FlightFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}

private operator fun ViewGroup.LayoutParams.invoke(params: LinearLayout.LayoutParams) {

}
