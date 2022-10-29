package com.example.geochat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginBtn : Button = findViewById(R.id.Login)
        loginBtn.setOnClickListener{signIn()}
        val createAccountTxt : TextView = findViewById(R.id.createAccountTxt)

        createAccountTxt.setOnClickListener{goToSettings()}
    }


    private fun goToSettings(){
        val mainIntent = Intent(this, SettingsActivity::class.java)
        startActivity(mainIntent)
        finish()
    }

    private fun goToSignUp(){
        val mainIntent = Intent(this, RegesterActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
    private fun signIn(){

        val mainIntent = Intent(this, NavigationActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
}