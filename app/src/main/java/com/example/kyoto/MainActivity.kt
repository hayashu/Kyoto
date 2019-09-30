package com.example.kyoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goKyoto.setOnClickListener {onGoKyotoBottonTapped(it)}
    }
    fun onGoKyotoBottonTapped(view:View?){
        val intent = Intent(this,way::class.java)
        startActivity(intent)
    }

}
