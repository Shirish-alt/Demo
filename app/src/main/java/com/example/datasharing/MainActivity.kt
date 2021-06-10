package com.example.datasharing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

//Megered

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            var name1:String =name.text.toString()

            Log.e("Data",name1)

            val intent=Intent(this,Second::class.java)
            intent.putExtra("key",name1)
            startActivity(intent)
        }

    }
}