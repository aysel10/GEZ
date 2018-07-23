package crocusoft.com.gez.activities

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import android.os.Build
import android.support.design.widget.NavigationView
import android.support.v4.app.FragmentManager
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.view.View
import crocusoft.com.gez.R
import crocusoft.com.gez.services.RetrofitManager
import crocusoft.com.gez.fragments.*
import crocusoft.com.gez.menu_fragments.*
import crocusoft.com.gez.util.AppSharedPreferences


class MainActivity : AppCompatActivity(), MenuFragment.OnFragmentInteractionListener,
        TrainFragment.OnFragmentInteractionListener,
        CarsFragment.OnFragmentInteractionListener,
        HotelFragment.OnFragmentInteractionListener,
        TransferFragment.OnFragmentInteractionListener,
        FlightFragment.OnFragmentInteractionListener,
        ProfileFragment.OnFragmentInteractionListener,
        SupportFragment.OnFragmentInteractionListener,
        AboutFragment.OnFragmentInteractionListener,
        BonusFragment.OnFragmentInteractionListener,
        ContactsFragment.OnFragmentInteractionListener,
        ContentFragment.OnFragmentInteractionListener,
        GezAzFragment.OnFragmentInteractionListener{
    override fun onFragmentInteraction(uri: Uri) {
    }


    private lateinit var mDrawer: DrawerLayout;
    private lateinit var toolbar: Toolbar;

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
        RetrofitManager.changeFragment(fragmentManager, R.id.content, ContentFragment.newInstance())
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        }


        // Find our drawer view
        mDrawer =  findViewById(R.id.drawer_layout);
        mDrawer.addDrawerListener(
                object : DrawerLayout.DrawerListener {
                    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
                        // Respond when the drawer's position changes
                    }

                    override fun onDrawerOpened(drawerView: View) {
                        // Respond when the drawer is opened
                    }

                    override fun onDrawerClosed(drawerView: View) {
                        // Respond when the drawer is closed
                    }

                    override fun onDrawerStateChanged(newState: Int) {
                        // Respond when the drawer motion state changes
                    }
                }
        )

        val nvDrawer : NavigationView = findViewById(R.id.nvView)
        nvDrawer.setNavigationItemSelectedListener { menuItem ->
            // set item as selected to persist highlight
            //   menuItem.isChecked = true
            // close drawer when item is tapped
            mDrawer.closeDrawers()
            selectDrawerItem(menuItem)
            // Add code here to update the UI based on the item selected
            // For example, swap UI fragments here

            true
        }


    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                mDrawer.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    public fun selectDrawerItem(menuItem: MenuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        // val fragment: Fragment = null;
        // lateinit var  fragmentClass:Any
        val fragmentManager: FragmentManager =  supportFragmentManager;
        val myPreferences = AppSharedPreferences(applicationContext)

        when(menuItem.itemId) {
            R.id.nav_about_fragment-> {
                fragmentManager.beginTransaction().replace(R.id.content, AboutFragment.newInstance()).addToBackStack(null).commit()
            }
            R.id.nav_profile_fragment-> {
                fragmentManager.beginTransaction().replace(R.id.content, ProfileFragment.newInstance()).addToBackStack(null).commit()
            }
            R.id.nav_support_fragment-> {
                fragmentManager.beginTransaction().replace(R.id.content, SupportFragment.newInstance()).addToBackStack(null).commit()
            }
            R.id.nav_contacts_fragment->{
                fragmentManager.beginTransaction().replace(R.id.content, ContactsFragment.newInstance()).addToBackStack(null).commit()
            }
            R.id.nav_home_fragment-> {
                fragmentManager.beginTransaction().replace(R.id.content, ContentFragment.newInstance()).addToBackStack(null).commit()

            }
            R.id.nav_bonus_fragment-> {
                fragmentManager.beginTransaction().replace(R.id.content, BonusFragment.newInstance()).addToBackStack(null).commit()
            }
            R.id.nav_logout->{
                val intent = Intent(baseContext,LoginActivity::class.java)
                myPreferences.removeToken()
                startActivity(intent)
            }
        }

        menuItem.setChecked(true);
        // Set action bar title
        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        mDrawer.closeDrawers();
    }




    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item!!.getItemId()) {
            android.R.id.home->
                mDrawer.openDrawer(GravityCompat.START)
        }

        return super.onContextItemSelected(item)
    }


}
