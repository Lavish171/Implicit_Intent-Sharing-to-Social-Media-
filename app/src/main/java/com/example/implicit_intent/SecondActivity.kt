package com.example.implicit_intent

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val getmsg:String?=intent.getStringExtra("user_message")
        Toast.makeText(this,"THe msg is "+getmsg,Toast.LENGTH_SHORT).show()
        textView.text=getmsg
    }
}