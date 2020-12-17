package com.mualim.implicitintentsreceiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtUriMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtUriMessage = findViewById(R.id.txt_uri_message)

        val intent = intent
        val uri = intent.data

        if (uri != null) {
            val uriString = "URI: $uri"
            txtUriMessage.text = uriString
        }

    }
}