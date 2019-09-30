package com.example.kyoto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_ito.*

class Ito : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ito)
        val u = Uri.parse("https://www.itohkyuemon.co.jp/corporate/shop/")
        val i = Intent (Intent.ACTION_VIEW,u)
        startActivity(i)
    }

}
