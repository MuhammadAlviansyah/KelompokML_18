package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Login : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    supportActionBar?.hide()
  }

  fun login(view: View) {
    val intent = Intent(this, Transaction::class.java)
    startActivity(intent)
  }
}