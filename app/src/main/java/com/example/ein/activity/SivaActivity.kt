package com.example.ein.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.ein.UserViewModel
import com.example.ein.base.room.entity.DutyEntity
import com.example.ein.databinding.ActivitySivaBinding
import java.lang.String
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.Calendar
import java.util.Date
import kotlin.Boolean
import kotlin.Int


class SivaActivity : AppCompatActivity() {
    lateinit var vm: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySivaBinding . inflate (layoutInflater)
        setContentView(binding.root)
        initView(binding)
        initListen(binding)
        initMain()
    }

    private fun initView(binding: ActivitySivaBinding) {

    }

    private fun initMain() {
        val startDate = LocalDateTime.of(2022, 1, 1,10,10,10)
        val endDate = LocalDateTime.of(2024, 12, 31,10,10,10)

        var currentDate = startDate
        var mr = mutableListOf<DutyEntity>()
        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
//            val calendar: Calendar = Calendar.getInstance()
//            calendar.set(Calendar.YEAR, currentDate.year)
//            calendar.set(Calendar.MONTH, currentDate.monthValue - 1)
//            calendar.set(Calendar.DAY_OF_MONTH, currentDate.dayOfMonth)
//            val date: Date = calendar.getTime()
            val e = DutyEntity(createdAt = currentDate)
            mr.add(e)

            currentDate = currentDate.plusDays(1)
        }
//        mr.add(DutyEntity(createdAt = endDate))
        vm = ViewModelProvider(this).get(UserViewModel::class.java)
        vm.addDates(mr)
        vm.GetAllDuty()?.forEach {
            Log.i("FWA","${it.createdDateFormatted}-${it.createdAt}")
        }
//        vm.GetAllDuty()?.let {
//            it.forEach {
//                Log.i("FWA", it.createdDateFormatted)
//            }
//        }

    }



    private fun initListen(binding: ActivitySivaBinding) {

    }
}