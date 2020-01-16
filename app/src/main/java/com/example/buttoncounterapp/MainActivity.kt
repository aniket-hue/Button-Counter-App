package com.example.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var posButton:Button?=null
    private var negButton:Button?=null
    private var text:TextView?=null

    private var buttonClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        posButton = findViewById<Button>(R.id.posButt)
        negButton = findViewById<Button>(R.id.negButt)

        text = findViewById<TextView>(R.id.textView)

        posButton?.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {
                buttonClicked++
                text?.setText("$buttonClicked")
            }
        })

        negButton?.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {
                buttonClicked--
                text?.setText("$buttonClicked")
            }

        })
    }
}
