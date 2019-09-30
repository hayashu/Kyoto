package com.example.kyoto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_shop.*

class Shop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)
        itoen.setOnClickListener { onItouKyuemonnTapped(it) }



        
    }
    fun onItouKyuemonnTapped(view: View?){
        val intent = Intent(this,Ito::class.java)
        startActivity(intent)
    }
}
