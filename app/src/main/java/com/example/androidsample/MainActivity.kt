package com.example.androidsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCurrency(view: View){
        if(dollerText.text.isNotEmpty()){
            try{
                val dollerValue = dollerText.text.toString().toFloat()
                val euroValue = dollerValue * 0.85f
                conversionResult.text = "€ ${euroValue.toString()}"
            }catch (e: Exception){
                Toast.makeText(applicationContext,"String not accepted!",Toast.LENGTH_SHORT).show()
            }


        }else{
            conversionResult.text = getString(R.string.no_value)
        }
    }
}


