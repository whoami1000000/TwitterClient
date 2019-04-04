package com.example.twitterclient

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startUserInfoActivity()
    }

    private fun startUserInfoActivity() {
        val intent = Intent(this, UserInfoActivity::class.java)
        startActivity(intent)
    }
}
