package com.edu.eam.unilocal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textLabel:TextView
    lateinit var textLabelInitial:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textLabel = findViewById(R.id.title_screen)
        textLabelInitial = savedInstanceState?.getString("initialText")?.toString() ?: "Options Screen"
        textLabel.text = textLabelInitial
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("initialText", textLabelInitial)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("MainActivity", savedInstanceState.getString("initialText").toString())
    }

    fun goRegister(v:View){
        //Log.e("MainActiviy", "Listen to click event")
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }

    fun goLogin(v:View){
        //Toast.makeText(this,"Clicked to Login button", Toast.LENGTH_LONG).show()
        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
    }

    fun goCreatePlace(v:View){
        val intent = Intent(this,CreatePlaceActivity::class.java)
        startActivity(intent)
    }

    fun changeText(v:View){
        if(textLabel.text == "Modified text"){
            textLabelInitial = "Original text"
            textLabel.text = textLabelInitial
        }
        else{
            textLabelInitial = "Modified text"
            textLabel.text = textLabelInitial
        }
    }
}