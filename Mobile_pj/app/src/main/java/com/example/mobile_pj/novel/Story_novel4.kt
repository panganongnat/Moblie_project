package com.example.mobile_pj.novel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobile_pj.R

class Story_novel4 : AppCompatActivity() {
    var bacx_novel4 : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_novel4)
        init()
        bacx_novel4!!.setOnClickListener {
            var intent = Intent(this, Menu_novel::class.java)
            startActivity(intent)
        }
    }
    fun init(){
        bacx_novel4 = findViewById(R.id.bacx_novel4)
    }
}