package com.example.androidprotect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidprotect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
}