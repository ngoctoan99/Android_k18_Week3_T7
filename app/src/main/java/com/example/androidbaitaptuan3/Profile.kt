package com.example.androidbaitaptuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.androidbaitaptuan3.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding:ActivityProfileBinding
    private lateinit var viewModel: ViewModels
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profile)
        binding.user = intent.getParcelableExtra("user")
    }
}