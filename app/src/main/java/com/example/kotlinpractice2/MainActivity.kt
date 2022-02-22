package com.example.kotlinpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.example.kotlinpractice2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        binding.post.setOnClickListener{
            val email:String = binding.email.text.toString();
            val password:String = binding.password.text.toString();
            val name:String = binding.name.text.toString()
            var dialog = AlertDialog.Builder(this);
            dialog.setMessage("email : " + email + "\npassword : " + password + "\nname :" + name);
            dialog.show();
        };
        binding.get.setOnClickListener{
            val email:String = binding.email.text.toString();
            val password:String = binding.password.text.toString();
            val name:String = binding.name.text.toString()
            var dialog = AlertDialog.Builder(this);
            dialog.setMessage("email : " + email + "\npassword : " + password + "\nname :" + name);
            dialog.show();
        };
    }
}