package crocusoft.com.gez.fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import crocusoft.com.gez.R
import crocusoft.com.gez.util.RetrofotManager
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
    private lateinit var gezAzImageButton: ImageButton

    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun init(view: View) {
        gezAzImageButton = view.findViewById(R.id.azImageButton)
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

    private fun setButtonsListeners(view: View) {
        val fragmentManager: FragmentManager =  getFragmentManager()!!;
      //  val dynamicFragment:FrameLayout = view.findViewById(R.id.dynamicFragment)
        gezAzImageButton.setOnClickListener(View.OnClickListener {
            MainActivity.currentFragment = GezAzFragment.newInstance()
            updateCurrentMenuPosition()

            for(fr:Fragment in fragmentManager.fragments){
                fragmentManager.beginTransaction().remove(fr).commit()
            }
            fragmentManager.beginTransaction().replace(R.id.dynamicFragment, GezAzFragment.newInstance()).addToBackStack(null).commit()
        })
        carsImageButton.setOnClickListener({
            MainActivity.currentFragment = CarsFragment.newInstance()
            updateCurrentMenuPosition()

            for(fr:Fragment in fragmentManager.fragments){
                fragmentManager.beginTransaction().remove(fr).commit()
            }
            fragmentManager.beginTransaction().replace(R.id.dynamicFragment, CarsFragment.newInstance()).addToBackStack(null).commit()
        })

        trainImageButton.setOnClickListener({
            MainActivity.currentFragment = TrainFragment.newInstance()
            updateCurrentMenuPosition()
            for(fr:Fragment in fragmentManager.fragments){
                fragmentManager.beginTransaction().remove(fr).commit()
            }
            fragmentManager.beginTransaction().replace(R.id.dynamicFragment, TrainFragment.newInstance()).addToBackStack(null).commit()
        })
        hotelImageButton.setOnClickListener({
            MainActivity.currentFragment = HotelFragment.newInstance()
            updateCurrentMenuPosition()
            for(fr:Fragment in fragmentManager.fragments){
                fragmentManager.beginTransaction().remove(fr).commit()
            }
            fragmentManager.beginTransaction().replace(R.id.dynamicFragment, HotelFragment.newInstance()).addToBackStack(null).commit()

            //RetrofotManager.changeFragment(fragmentManager!!, R.id.dynamicFragment, HotelFragment.newInstance())
        })
        transferImageButton.setOnClickListener({
            MainActivity.currentFragment = TransferFragment.newInstance()
            updateCurrentMenuPosition()
            for(fr:Fragment in fragmentManager.fragments){
                fragmentManager.beginTransaction().remove(fr).commit()
            }
            RetrofotManager.changeFragment(fragmentManager, R.id.dynamicFragment, TransferFragment.newInstance())
        })
        planeImageButton.setOnClickListener({
            MainActivity.currentFragment = FlightFragment.newInstance()
            updateCurrentMenuPosition()
            for(fr:Fragment in fragmentManager.fragments){
                fragmentManager.beginTransaction().remove(fr).commit()
            }
            RetrofotManager.changeFragment(fragmentManager, R.id.dynamicFragment, FlightFragment.newInstance())
        })

        // add more for other buttons.....
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_menu, container, false)

        init(view)
        val fragmentManager: FragmentManager =  getFragmentManager()!!;

        MainActivity.currentFragment = FlightFragment.newInstance()
        updateCurrentMenuPosition()
        for(fr:Fragment in fragmentManager.fragments){
            fragmentManager.beginTransaction().remove(fr).commit()
        }
        RetrofotManager.changeFragment(fragmentManager, R.id.dynamicFragment, FlightFragment.newInstance())
        setButtonsListeners(view)

        updateCurrentMenuPosition()

        return view
    }

    private fun clearAllMenuButtons() {
        gezAzImageButton.setBackgroundResource(R.drawable.menu_bckgr)
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
        when {
            MainActivity.currentFragment is GezAzFragment -> gezAzImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
            MainActivity.currentFragment is TrainFragment -> trainImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
            MainActivity.currentFragment is CarsFragment -> carsImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
            MainActivity.currentFragment is HotelFragment -> hotelImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
            MainActivity.currentFragment is TransferFragment -> transferImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)
            MainActivity.currentFragment is FlightFragment -> planeImageButton.setBackgroundResource(R.drawable.menu_bckgr_active)

        }
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
