package com.example.courtenay.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        //val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        //Get text view
        val showCountTextView = findViewById(R.id.textView) as TextView

        //Get value of text
        val countString = showCountTextView.text.toString()

        //Convert string to number and increment
        var count: Int = Integer.parseInt(countString)
        count++

        //Display new value in text view
        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = textView.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }
}