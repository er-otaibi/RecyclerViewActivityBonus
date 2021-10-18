package com.example.recyclerviewactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var rvMain: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rvMain = findViewById(R.id.rvMain)
        val intent = intent
        val fname = intent.getStringExtra("myFname").toString()
        val lname = intent.getStringExtra("myLname").toString()
        val location = intent.getStringExtra("myLocation").toString()
        val age = intent.getStringExtra("myAge").toString()
        GlobalClass.myList.add(Users(fname,lname,location,age))

        rvMain.adapter =UsersAdapter( GlobalClass.myList )
        rvMain.layoutManager = LinearLayoutManager(this)
    }
}

data class Users(val firstName: String, val lastName: String , val location : String , val age: String )