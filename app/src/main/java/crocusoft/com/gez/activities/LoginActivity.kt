package crocusoft.com.gez.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import crocusoft.com.gez.R
import crocusoft.com.gez.util.AppSharedPreferences

import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.content_login.*
import okio.Utf8

class LoginActivity : AppCompatActivity() {
    private lateinit var loginButton: Button
    private lateinit var signUpButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        val myPreferences = AppSharedPreferences(baseContext)

        val userToken = myPreferences.getString("token")

        Log.e("Token", "tok: $userToken")

        // Start Main Activity if token is exist
        if(!userToken.isEmpty()) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        // Login Part

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton = findViewById(R.id.loginButton)
        signUpButton = findViewById(R.id.signUpButton)
        loginButton.setOnClickListener(View.OnClickListener {
            val login = loginTextInputEditText.text
            val password = passwordTextInputEditText.text
            val loginAndPassword = "$login:$password"
            val token = Base64.encodeToString(loginAndPassword.toByteArray(Charsets.UTF_8), Base64.NO_WRAP)

            Log.e("Def", loginAndPassword)
            Log.e("Token", token)
            // Request to REST(Send l&p to backend)

            // Response from rest

            // if response is 200
            myPreferences.putString("token", token)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // if response is different to 200

            // FAULT OF RESPONSE

        })
        signUpButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        })

    }

}
