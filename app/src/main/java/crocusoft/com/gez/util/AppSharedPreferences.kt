package crocusoft.com.gez.util

import android.content.Context
import android.content.SharedPreferences

class AppSharedPreferences(context: Context) {
    private val sharedpreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

    fun getString(key: String): String {
        return sharedpreferences.getString(key, "")
    }
    fun removeToken(){
        val editor: SharedPreferences.Editor = sharedpreferences.edit()
        editor.remove("token")
        editor.apply()
    }

    fun getInt(key: String): Int {
        return sharedpreferences.getInt(key, -1)
    }

    fun getBoolean(key: String): Boolean {
        return sharedpreferences.getBoolean(key, false)
    }

    fun putString(key: String, value: String) {
        val editor: SharedPreferences.Editor = sharedpreferences.edit()
            editor.putString(key, value)
            editor.apply()
    }

    fun putInt(key: String, value: Int) {
        val editor: SharedPreferences.Editor = sharedpreferences.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun putBoolean(key: String, value: Boolean) {
        val editor: SharedPreferences.Editor = sharedpreferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }
}