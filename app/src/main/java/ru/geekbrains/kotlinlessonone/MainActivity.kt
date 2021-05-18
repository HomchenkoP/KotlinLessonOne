package ru.geekbrains.kotlinlessonone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "Кнопка нажата.", Toast.LENGTH_SHORT).show()
            }
        })

        var buttonTwo: Button = findViewById(R.id.buttonTwo)
        buttonTwo.setOnClickListener(buttonOnClickListener)
    }

    val buttonOnClickListener: View.OnClickListener = object : View.OnClickListener {
        override fun onClick(v: View?) {
            Toast.makeText(applicationContext, "И эта кнопка тоже нажата.", Toast.LENGTH_SHORT).show()
        }
    }
}