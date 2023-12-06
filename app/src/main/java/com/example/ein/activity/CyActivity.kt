package com.example.ein.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ein.MyApp
import com.example.ein.UserViewModel
import com.example.ein.databinding.ActivityCyBinding

class CyActivity : AppCompatActivity() {
    lateinit var vm: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCyBinding . inflate (layoutInflater)
        setContentView(binding.root)
        initView(binding)
        initListen(binding)
        initMain()
    }

    private fun initView(binding: ActivityCyBinding) {

    }

    private fun initMain() {



    }

    private fun initListen(binding: ActivityCyBinding) {

    }
}