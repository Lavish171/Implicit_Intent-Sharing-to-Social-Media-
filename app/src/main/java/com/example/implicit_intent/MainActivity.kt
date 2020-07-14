package com.example.implicit_intent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       toast_Button.setOnClickListener {
           Log.i("MainActivity","Button was clicked")
           Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
       }

        share_Button.setOnClickListener {
            Toast.makeText(this,"Send to next activity Button was clicked",Toast.LENGTH_SHORT).show()

            val message:String =editTextTextPersonName.text.toString()
            Toast.makeText(this,"The message entered is "+message, Toast.LENGTH_SHORT).show()

            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)
        }

        btnSharetoOtherApps.setOnClickListener {
            val msg:String?=editTextTextPersonName.text.toString()
            val intent=Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,msg)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share to "))
        }
    }
}