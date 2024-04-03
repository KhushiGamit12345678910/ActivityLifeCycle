package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivitySelectDataBinding.inflate(layoutInflater)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val toast = Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onCreate Called ")

        binding.textView.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        //val toast = Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStart Called ")
    }

    override fun onRestart() {
        super.onRestart()
        //val toast = Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onRestart Called ")
    }

    override fun onPause() {
        super.onPause()
        //val toast = Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onPause Called ")
    }

    override fun onResume() {
        super.onResume()
        //val toast = Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onResume Called ")
    }

    override fun onStop() {
        super.onStop()
        //val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStop Called ")
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
        print(toast)
        Log.d("TAG", "onDestroy Called ")
    }

}