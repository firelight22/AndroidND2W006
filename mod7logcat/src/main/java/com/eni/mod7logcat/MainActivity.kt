package com.eni.mod7logcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate: je suis dans la mthode onCreate")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: ")
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: ")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: ")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: ")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: ")
    }
}