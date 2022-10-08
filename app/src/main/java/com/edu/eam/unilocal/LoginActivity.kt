package com.edu.eam.unilocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStart() {
        super.onStart()
        Log.e("TittleLoginActivity", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e("TittleLoginActivity", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TittleLoginActivity", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e("TittleLoginActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TittleLoginActivity", "onDestroy")
    }


}