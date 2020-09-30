package com.example.miprimeraaplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(MainActivity::class.java.name, "este es un log v")
        Log.d(MainActivity::class.java.name, "este es un log d de debugger")
        Log.w(MainActivity::class.java.name, "este es un log w warning")
        Log.e(MainActivity::class.java.name, "este es un log e error")
        Log.i(MainActivity::class.java.name, "este es un log i de informacion")

        var hola = getString(R.string.hello)

    }
}