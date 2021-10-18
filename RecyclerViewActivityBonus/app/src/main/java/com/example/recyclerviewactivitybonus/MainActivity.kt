package com.example.recyclerviewactivitybonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etFirstName = findViewById<EditText>(R.id.etFirstName)
        var etLastName = findViewById<EditText>(R.id.etLastName)
        var etLocation = findViewById<EditText>(R.id.etLocation)
        var etAge = findViewById<EditText>(R.id.etAge)
        var submit = findViewById<Button>(R.id.submit)


        submit.setOnClickListener {
            var fname = etFirstName.text.toString()
            var lname: String = etLastName.text.toString()
            var location = etLocation.text.toString()
            var age = etAge.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("myFname", fname )
            intent.putExtra("myLname", lname )
            intent.putExtra("myLocation", location )
            intent.putExtra("myAge", age )
            startActivity(intent)
        }


    }
}