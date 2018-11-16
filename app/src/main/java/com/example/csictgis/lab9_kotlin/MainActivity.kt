package com.example.csictgis.lab9_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object {
        val KEY DATA STUDENT = "keyDataStudent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send.setOnClickListener {
            val intent = Intent (this, SecondActivity::class.java)

            val dataStudent = Student(
                edit_text_id_std.text.toString(),
                edit_text_first_name.text.toString(),
                edit_text_last_name.text.toString()
            )

            intent.putExtra(KEY_DATA_STUDENT, dataStudent)
            starActivity(intent)
        }
    }
}

