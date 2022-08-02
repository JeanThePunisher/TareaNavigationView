package com.example.practicanavigationview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity3 : AppCompatActivity() {

    lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        boton = findViewById(R.id.buttoningresar)

    }
                fun onClick(view: View) {
                    startActivity(Intent(this, MainActivity2::class.java).apply
                    { putExtra(EXTRA_MESSAGE, "message") })
            }


    }
