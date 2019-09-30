package com.example.kyoto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class tokichi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tokichi)
        val u = Uri.parse("http://www.fukujuen.com/")
        val i = Intent (Intent.ACTION_VIEW,u)
        startActivity(i)
    }
}
