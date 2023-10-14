package com.example.labrepaso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLog: Button = findViewById(R.id.btnLogin)

        btnLog.setOnClickListener{
            this.login();
        }


    }
    private fun login()
    {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}