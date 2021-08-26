package com.example.lifecycleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        print("oncreate")
    }
    override fun onStart() {
        super.onStart()
        print("onStart")
    }

    override fun onResume() {
        super.onResume()
        print("resume")
    }

    override fun onPause() {
        super.onPause()
        print("pause")
    }
    override fun onStop() {
        super.onStop()
        print("stop")
    }

    override fun onRestart() {
        super.onRestart()
        print("restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("destory")
    }
    fun print(msg: String){
        Log.d("Activity State ",msg)
    }

}