package com.example.geochat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegesterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regester)
        val signinTxt : TextView = findViewById(R.id.signinTxt)

        signinTxt.setOnClickListener{goToSignIn()}
    }


    private fun goToSignIn(){
        val mainIntent = Intent(this, Login::class.java)
        startActivity(mainIntent)
        finish()
    }
}