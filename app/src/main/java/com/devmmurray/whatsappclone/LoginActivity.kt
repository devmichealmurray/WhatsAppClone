package com.devmmurray.whatsappclone

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun onLogIn(v: View) {
        startActivity(LoginActivity.newIntent(this))
        finish()
    }

    fun onSignUp(v: View) {
        startActivity(SignupActivity.newIntent(this))
        finish()
    }

    companion object {
        fun newIntent(context: Context) = Intent(context, LoginActivity::class.java)
    }
}
