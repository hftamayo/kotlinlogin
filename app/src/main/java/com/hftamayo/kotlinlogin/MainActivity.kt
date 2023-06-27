package com.hftamayo.kotlinlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hftamayo.kotlinlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initialize the UI
        initUI()
    }

    private fun initUI() {
        binding.fabBack.setOnClickListener {

        }

        binding.btnSignin.setOnClickListener {

        }

        binding.tvFogotPassword.setOnClickListener {

        }

        binding.tvSignup.setOnClickListener {

        }
    }


}