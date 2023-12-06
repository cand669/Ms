package com.example.ein.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ein.UserViewModel
import com.example.ein.databinding.ActivityPxBinding

class PxActivity : AppCompatActivity() {
    lateinit var vm: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPxBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView(binding)
        initListen(binding)
        initMain()
    }

    private fun initView(binding: ActivityPxBinding) {

    }

    private fun initMain() {

    }

    private fun initListen(binding: ActivityPxBinding) {

    }
}