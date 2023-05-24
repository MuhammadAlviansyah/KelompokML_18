package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Transaction : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_transaction)
    supportActionBar?.hide()

    val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
    fab.setOnClickListener {
      val intent = Intent(this, AddTransaction::class.java)
      startActivity(intent)
    }
  }

  fun profile(view: View) {
    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
  }
}