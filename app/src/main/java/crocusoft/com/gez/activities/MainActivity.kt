package crocusoft.com.gez.activities

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import android.os.Build
import crocusoft.com.gez.R
import crocusoft.com.gez.util.Utils
import crocusoft.com.gez.fragments.*


class MainActivity : AppCompatActivity(), MenuFragment.OnFragmentInteractionListener,
        TrainFragment.OnFragmentInteractionListener,
        CarsFragment.OnFragmentInteractionListener,
        HotelFragment.OnFragmentInteractionListener,
        TransferFragment.OnFragmentInteractionListener,
        FlightFragment.OnFragmentInteractionListener,
        FlightTicketsFragment.OnFragmentInteractionListener{

    companion object {
        var currentFragment: Any = FlightFragment.newInstance()
    }


    init {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        Utils.changeFragment(fragmentManager, R.id.dynamicFragment, FlightFragment.newInstance())

    }

    override fun onFragmentInteraction(uri: Uri) {
    }

}
