package com.example.applemarket

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            finish()
        }
        val image2 = intent.getIntExtra("image",0)
        val name = intent.getStringExtra("name")
        val person = intent.getStringExtra("person")
        val detail = intent.getStringExtra("detail")
        val number = intent.getStringExtra("number")
        val where = intent.getStringExtra("where")
        val like = intent.getStringExtra("like")
        val chat = intent.getStringExtra("chat")


//        val editText = findViewById<EditText>(R.id.title)
//        editText.setText(chat)
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(image2)
//        val name2 = findViewById<TextView>(R.id.name)
//        name2.text = name
//        val like2 = findViewById<TextView>(R.id.like)
//        like2.setText(like)

        val titleTextView = findViewById<TextView>(R.id.title)
        titleTextView.text = name
        val person2 = findViewById<TextView>(R.id.name)
        person2.text = person
        val detail2 = findViewById<TextView>(R.id.detail)
        detail2.text = detail
        val where2 = findViewById<TextView>(R.id.where)
        where2.text = where
        val price = findViewById<TextView>(R.id.price)
        price.text = number


    }
}





