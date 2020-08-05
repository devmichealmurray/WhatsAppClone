package com.devmmurray.whatsappclone

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, SignupActivity::class.java)
    }
}