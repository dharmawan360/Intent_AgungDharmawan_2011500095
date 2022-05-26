package com.example.intent_agungdharmawan_2011500095

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import android.content.Intent







class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnweb = findViewById<Button>(R.id.btnweb)

        btnweb.setOnClickListener{
            val link = "https://www.atmaluhur.ac.id/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(link)
            startActivity(i)
        }
    }
}