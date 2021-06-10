package com.example.datasharing

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        val bundle: Bundle ? = intent.extras
        val data1 : String? = bundle!!.getString("key")

        //val data1 : String? =intent.getStringExtra("key")

Toast.makeText(this,data1,Toast.LENGTH_SHORT).show()

        lo.text=data1.toString()


    }
}