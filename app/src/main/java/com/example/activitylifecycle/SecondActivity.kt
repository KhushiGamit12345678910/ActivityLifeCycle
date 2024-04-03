package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.activitylifecycle.databinding.ActivitySecondBinding
import com.example.activitylifecycle.ui.NotificationActivity

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //val toast = Toast.makeText(applicationContext, "onCreate Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onCreate")

        binding.textViewSecond.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        //val toast = Toast.makeText(applicationContext, "onStart Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        //val toast = Toast.makeText(applicationContext, "onRestart Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onRestart")
    }

    override fun onPause() {
        super.onPause()
        //val toast = Toast.makeText(applicationContext, "onPause Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onPause")
    }

    override fun onResume() {
        super.onResume()
        //val toast = Toast.makeText(applicationContext, "onResume Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onResume")
    }

    override fun onStop() {
        super.onStop()
        //val toast = Toast.makeText(applicationContext, "onStop Called", Toast.LENGTH_LONG).show()
        Log.d("TAG", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(applicationContext, "onDestroy Called", Toast.LENGTH_LONG).show()
        print(toast)
        Log.d("TAG", "onDestroy")
    }

}