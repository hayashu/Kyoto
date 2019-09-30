package com.example.kyoto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class marukyu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marukyu)
        val u = Uri.parse("https://www.marukyu-koyamaen.co.jp/\n")
        val i = Intent (Intent.ACTION_VIEW,u)
        startActivity(i)
    }
}
