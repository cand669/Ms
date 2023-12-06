package com.example.ein.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ein.UserViewModel
import com.example.ein.databinding.ActivityPzBinding

class PzActivity : AppCompatActivity() {
    lateinit var vm: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPzBinding . inflate (layoutInflater)
        setContentView(binding.root)
        initView(binding)
        initListen(binding)
        initMain()
    }

    private fun initView(binding: ActivityPzBinding) {

    }

    private fun initMain() {

    }

    private fun initListen(binding: ActivityPzBinding) {

    }
}