package com.example.kotlinpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinpractice2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        val email:String = "${binding.email.text}";
        val password:String = "${binding.password.text}";
        val name:String = "${binding.name.text}";
        Log.d(email, password);

        binding.post.setOnClickListener{};
        binding.get.setOnClickListener{};
    }
}