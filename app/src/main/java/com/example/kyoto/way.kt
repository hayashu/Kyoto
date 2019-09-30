package com.example.kyoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_way.*

class way : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_way)
        macha.setOnClickListener { onMachaBottontapped(it) }
        tourism.setOnClickListener { onTourismBottonTapped(it) }

    }
    fun onMachaBottontapped(view: View?){
        val intent = Intent(this, Shop::class.java)
        startActivity(intent)
    }
    fun onTourismBottonTapped(view: View?){
        val intent = Intent(this, Shightseeing::class.java)
        startActivity(intent)
    }
}
