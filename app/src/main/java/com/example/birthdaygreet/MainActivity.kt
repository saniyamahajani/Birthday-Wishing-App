package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdayCard(view: View) {

        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        val intent=Intent(this,Greeting::class.java)
        intent.putExtra("Name",name)
        startActivity(intent)


//        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()
    }
}