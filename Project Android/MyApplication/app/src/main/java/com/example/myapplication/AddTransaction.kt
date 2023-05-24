package com.example.myapplication

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class AddTransaction : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_add_transaction)
    supportActionBar?.hide()
  }

  fun showDatePickerDialog(v: View?) {
    // Get the current date as a Calendar object
    val c: Calendar = Calendar.getInstance()
    val year: Int = c.get(Calendar.YEAR)
    val month: Int = c.get(Calendar.MONTH)
    val day: Int = c.get(Calendar.DAY_OF_MONTH)

    // Create a new DatePickerDialog instance
    val datePickerDialog = DatePickerDialog(this,
      { _, year, monthOfYear, dayOfMonth -> // Set the selected date to the EditText
        val editTextDate = findViewById<View>(R.id.editTextDate) as EditText
        editTextDate.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year)
      }, year, month, day
    )

    // Show the date picker dialog
    datePickerDialog.show()
  }

  fun back(view: View) {
    val intent = Intent(this, Transaction::class.java)
    startActivity(intent)
  }
}