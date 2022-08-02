package com.example.practicanavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var txtMensaje:TextView
    lateinit var toolbar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val actionBar = supportActionBar
        actionBar!!.title = "UTEQ App"
        actionBar!!.subtitle = "Primera App"*/

        toolbar = findViewById<Toolbar>(R.id.toolbar);
        toolbar!!.title="App UTEQ"
        setSupportActionBar(toolbar)

        txtMensaje = findViewById(R.id.txtMensaje)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mnuBuscar -> {
                txtMensaje?.setText("Buscar");
                return true
            }
            R.id.mnuNuevo -> {
                txtMensaje?.setText("Nuevo");
                return true
            }        R.id.mnuSetting -> {
            txtMensaje?.setText("Settings");
            return true        }
        }
        return super.onOptionsItemSelected(item)
    }
    fun onClick(view: View) {
        Snackbar.make(view, "Se presionó el FAB", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show()
    }

}