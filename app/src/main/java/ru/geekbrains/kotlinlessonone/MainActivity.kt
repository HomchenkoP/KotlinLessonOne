package ru.geekbrains.kotlinlessonone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var evenOdd: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "Кнопка нажата.", Toast.LENGTH_SHORT).show()
            }
        })

        val buttonTwo: Button = findViewById(R.id.buttonTwo)
        buttonTwo.setOnClickListener(buttonOnClickListener)

        val someDataClass: SomeDataClass = SomeDataClass("Свойство", 2)

        val propertyOneTextView: TextView = findViewById(R.id.propertyOne)
        val propertyTwoTextView: TextView = findViewById(R.id.propertyTwo)

        propertyOneTextView.setText(someDataClass.propOne)
        propertyTwoTextView.setText(someDataClass.propTwo.toString())

        var dataClassCopy: SomeDataClass

        val propertyOneCopy: TextView = findViewById(R.id.propertyOneCopy)
        val propertyTwoCopy: TextView = findViewById(R.id.propertyTwoCopy)

        val buttonCopy: Button = findViewById(R.id.buttonCopy)
        buttonCopy.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (evenOdd == 0) {
                    evenOdd = 1
                    // propOne - новое значение, propTwo - скопированное
                    dataClassCopy = someDataClass.copy(propOne = "Copy")
                } else {
                    evenOdd = 0
                    // propOne - скопированное значение, propTwo - новое
                    dataClassCopy = someDataClass.copy(propTwo = 11111)
                }
                propertyOneCopy.setText(dataClassCopy.propOne)
                propertyTwoCopy.setText(dataClassCopy.propTwo.toString())
            }
        })
    }

    val buttonOnClickListener: View.OnClickListener = object : View.OnClickListener {
        override fun onClick(v: View?) {
            Toast.makeText(applicationContext, "И эта кнопка тоже нажата.", Toast.LENGTH_SHORT).show()
        }
    }
}