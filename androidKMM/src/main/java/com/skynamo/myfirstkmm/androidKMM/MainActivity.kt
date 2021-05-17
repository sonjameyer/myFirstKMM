package com.skynamo.myfirstkmm.androidKMM

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.skynamo.myfirstkmm.sharedKMM.Convert
import com.skynamo.myfirstkmm.sharedKMM.Greeting

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Convert the British")

        val ounceForGramsAnswer: TextView = findViewById(R.id.tvOunceToGramsAnswer)
        val ounceForGramsEditText: EditText = findViewById(R.id.etOunceForGrams)
        ounceForGramsEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val number: Double = s.toString().toDouble()
                ounceForGramsAnswer.text = Convert().ounceToGram(number).toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}
