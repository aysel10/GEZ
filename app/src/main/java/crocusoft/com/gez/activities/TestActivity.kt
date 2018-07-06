package crocusoft.com.gez.activities

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import crocusoft.com.gez.R
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBar
import android.util.Log
import android.view.MenuItem
import android.view.View
import crocusoft.com.gez.menu_fragments.AboutFragment
import crocusoft.com.gez.menu_fragments.ProfileFragment
import crocusoft.com.gez.menu_fragments.SupportFragment
//
//
//class TestActivity : AppCompatActivity(), AboutFragment.OnFragmentInteractionListener,ProfileFragment.OnFragmentInteractionListener,SupportFragment.OnFragmentInteractionListener {
//    override fun onFragmentInteraction(uri: Uri) {
//
//    }
//
//    private lateinit var mDrawer:DrawerLayout;
//    private lateinit var toolbar: Toolbar;
//
//  // Make sure to be using android.support.v7.app.ActionBarDrawerToggle version.
// // The android.support.v4.app.ActionBarDrawerToggle has been deprecated.
//    private lateinit var drawerToggle: ActionBarDrawerToggle;
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test)
//
//        toolbar =findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        val actionbar: ActionBar? = supportActionBar
//        actionbar?.apply {
//            setDisplayHomeAsUpEnabled(true)
//            setHomeAsUpIndicator(R.drawable.ic_ac_unit_black_24dp)
//        }
//
//
//        // Find our drawer view
//        mDrawer =  findViewById(R.id.drawer_layout);
//        mDrawer.addDrawerListener(
//                object : DrawerLayout.DrawerListener {
//                    override fun onDrawerSlide(drawerView: View, slideOffset: Float) {
//                        // Respond when the drawer's position changes
//                    }
//
//                    override fun onDrawerOpened(drawerView: View) {
//                        // Respond when the drawer is opened
//                    }
//
//                    override fun onDrawerClosed(drawerView: View) {
//                        // Respond when the drawer is closed
//                    }
//
//                    override fun onDrawerStateChanged(newState: Int) {
//                        // Respond when the drawer motion state changes
//                    }
//                }
//        )
//
////        val nvDrawer : NavigationView = findViewById(R.id.nvView)
//      //  nvDrawer.setNavigationItemSelectedListener { menuItem ->
//            // set item as selected to persist highlight
//         //   menuItem.isChecked = true
//            // close drawer when item is tapped
//            mDrawer.closeDrawers()
//            //selectDrawerItem(menuItem)
//            // Add code here to update the UI based on the item selected
//            // For example, swap UI fragments here
//
//           // true
//        }
//
//
//
//    }
//    private fun setupDrawerContent(navigationView:NavigationView ) {
//        navigationView.setNavigationItemSelectedListener(object:NavigationView.OnNavigationItemSelectedListener{
//            override fun onNavigationItemSelected(item: MenuItem): Boolean {
//              //  selectDrawerItem(item)
//                return true
//            }
//        })
//
//    }
////    override fun onOptionsItemSelected(item: MenuItem): Boolean {
////        return when (item.itemId) {
////            android.R.id.home -> {
////                mDrawer.openDrawer(GravityCompat.START)
////                true
////            }
////            else -> super.onOptionsItemSelected(item)
////        }
////    }
////    public fun selectDrawerItem(menuItem:MenuItem) {
////        // Create a new fragment and specify the fragment to show based on nav item clicked
////       // val fragment: Fragment = null;
////       // lateinit var  fragmentClass:Any
////        val fragmentManager: FragmentManager = getSupportFragmentManager();
////
////        when(menuItem.itemId) {
////             R.id.nav_about_fragment-> {
////                 fragmentManager.beginTransaction().replace(R.id.flContent, AboutFragment.newInstance()).commit()
////             }
////             R.id.nav_profile_fragment-> {
////                 fragmentManager.beginTransaction().replace(R.id.flContent, ProfileFragment.newInstance()).commit()
////             }
////             R.id.nav_support_fragment-> {
////                 fragmentManager.beginTransaction().replace(R.id.flContent, SupportFragment.newInstance()).commit()
////             }
////        }
////
////        menuItem.setChecked(true);
////        // Set action bar title
////        setTitle(menuItem.getTitle());
////        // Close the navigation drawer
////        mDrawer.closeDrawers();
////    }
//
//
//
//
////    override fun onContextItemSelected(item: MenuItem?): Boolean {
////         when (item!!.getItemId()) {
////            android.R.id.home->
////                mDrawer.openDrawer(GravityCompat.START)
////        }
////
////        return super.onContextItemSelected(item)
////    }
//}
