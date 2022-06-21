package com.Alen.activitylifeycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        println("Onstart called")
    }

    override fun onResume() {
        super.onResume()
        println("OnResume called")
    }

    override fun onPause() {
        super.onPause()
        println("OnPause called")
    }

    override fun onStop() {
        super.onStop()
        println("OnStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("OnDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        println("OnRestart called")
    }
}