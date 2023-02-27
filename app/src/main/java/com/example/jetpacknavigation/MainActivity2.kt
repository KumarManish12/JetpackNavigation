package com.example.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.example.jetpacknavigation.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.let {
            val pass= intent.getStringExtra("pass")
            binding.tvshow.setText(binding.tvshow.text.toString())
            binding.tvshow.text=pass
        }

    }
}