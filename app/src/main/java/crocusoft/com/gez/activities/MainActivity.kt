package crocusoft.com.gez.activities

import android.app.DatePickerDialog
import android.app.Fragment
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import android.os.Build
import android.widget.ImageButton
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.Utils
import crocusoft.com.gez.fragments.CarsFragment
import crocusoft.com.gez.fragments.MenuFragment
import crocusoft.com.gez.fragments.TrainFragment
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity(), MenuFragment.OnFragmentInteractionListener,
        TrainFragment.OnFragmentInteractionListener,
        CarsFragment.OnFragmentInteractionListener {

    companion object {
        var currentFragment: Any = TrainFragment.newInstance()
    }


    init {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_train)

        val fragmentManager = supportFragmentManager
        Utils.changeFragment(fragmentManager, R.id.dynamicFragment, TrainFragment.newInstance())

    }

    override fun onFragmentInteraction(uri: Uri) {
    }

}
