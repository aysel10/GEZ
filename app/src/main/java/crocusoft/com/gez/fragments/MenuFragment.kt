package crocusoft.com.gez.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import crocusoft.com.gez.R
import crocusoft.com.gez.Utils
import crocusoft.com.gez.activities.MainActivity


class MenuFragment : Fragment() {
    private lateinit var planeImageButton: ImageButton
    private lateinit var hotelImageButton: ImageButton
    private lateinit var carsImageButton: ImageButton
    private lateinit var lowerCostImageButton: ImageButton
    private lateinit var trainImageButton: ImageButton
    private lateinit var transferImageButton: ImageButton
    private lateinit var insuranceImageButton: ImageButton
    private lateinit var visaImageButton: ImageButton
    private lateinit var cruizeImageButton: ImageButton

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun init(view: View) {
        planeImageButton = view.findViewById(R.id.planeImageButton)
        hotelImageButton = view.findViewById(R.id.hotelImageButton)
        carsImageButton = view.findViewById(R.id.carsImageButton)
        lowerCostImageButton = view.findViewById(R.id.lowerCostImageButton)
        trainImageButton = view.findViewById(R.id.trainImageButton)
        transferImageButton = view.findViewById(R.id.tranferImageButton)
        insuranceImageButton = view.findViewById(R.id.insuranceImageButton)
        visaImageButton = view.findViewById(R.id.visaImageButton)
        cruizeImageButton = view.findViewById(R.id.cruizeImageButton)
    }

    private fun setButtonsListeners() {
        carsImageButton.setOnClickListener({
            MainActivity.currentFragment = CarsFragment.newInstance()
            updateCurrentMenuPosition()

            Utils.changeFragment(fragmentManager!!, R.id.dynamicFragment, CarsFragment.newInstance())
        })

        trainImageButton.setOnClickListener({
            MainActivity.currentFragment = TrainFragment.newInstance()
            updateCurrentMenuPosition()

            Utils.changeFragment(fragmentManager!!, R.id.dynamicFragment, TrainFragment.newInstance())
        })

        // add more for other buttons.....
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)

        init(view)

        setButtonsListeners()

        updateCurrentMenuPosition()

        return view
    }

    private fun clearAllMenuButtons() {
        trainImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        hotelImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        carsImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        lowerCostImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        planeImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        transferImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        insuranceImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        visaImageButton.setBackgroundResource(R.drawable.menu_bckgr)
        cruizeImageButton.setBackgroundResource(R.drawable.menu_bckgr)
    }

    private fun updateCurrentMenuPosition () {
        clearAllMenuButtons()
        if(MainActivity.currentFragment is TrainFragment)  trainImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
        else if (MainActivity.currentFragment is CarsFragment) carsImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
    }



    // -------------------------- //
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

}
