package com.example.localization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.view.View
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var greetingTextView: TextView
    var name = "Ibbe"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTextView = findViewById(R.id.textView)
    }



    fun button_pressed(view:View){
        greetingTextView.text = getString(R.string.great)
    }

    // eng, Good job Ibbe!!
    //sve, Bra jobbat Ibbe!!


}



// Anpassa appen till svensak och engelska
// 1. Anpassa xml - Layout X
// 2. Anpassa kotlin-fil  X
// 3. Anpassa bilder