package com.skynamo.myfirstkmm.androidKMM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.skynamo.myfirstkmm.sharedKMM.Greeting
import android.widget.TextView

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Cooking Converter")

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = greet()
    }
}
