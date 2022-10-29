package com.example.geochat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView
import java.util.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val root : RelativeLayout = findViewById(R.id.main)
    val card: CardView = findViewById(R.id.card)
        val swipeLayoutToHideAndShow = SwipeLayoutToHideAndShow()
        swipeLayoutToHideAndShow.initialize(root,card,
            Arrays.asList(SwipeLayoutToHideAndShow.SwipeDirection.rightToLeft,
                SwipeLayoutToHideAndShow.SwipeDirection.leftToRight,SwipeLayoutToHideAndShow.SwipeDirection.topToBottom,
                SwipeLayoutToHideAndShow.SwipeDirection.bottomToTop),50, )




    }


}

