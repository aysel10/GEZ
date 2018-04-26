package crocusoft.com.gez

import android.app.DatePickerDialog
import android.content.Context
import android.support.v4.app.Fragment
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*


class Utils {
    companion object {
        fun changeFragment(fragmentManager: android.support.v4.app.FragmentManager, fragmentPlaceHolder: Int, fragment: Fragment) {
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(fragmentPlaceHolder, fragment)
            transaction.commit()

        }

        fun toast(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_LONG)
        }

        fun datePicker(textview: TextView, context: Context) {
            var cal = Calendar.getInstance()

            val dateSetListener = DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

                val myFormat = "dd.MM.yyyy" // mention the format you need
                val sdf = SimpleDateFormat(myFormat, Locale.US)
                textview.text = sdf.format(cal.time)

            }


            textview.setOnClickListener {
                DatePickerDialog(context, dateSetListener,
                        cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH),
                        cal.get(Calendar.DAY_OF_MONTH)).show() }

        }

    }
}