package com.example.ein.base.room.repository

import com.example.ein.UserDao
import com.example.ein.base.room.dao.DutyDao
import com.example.ein.base.room.entity.DutyEntity

class DutyRepository(private val dutyDao: DutyDao)  {
        fun GetAllDuty(): List<DutyEntity>? {
            return dutyDao.GetAllDuty()
        }
    fun addDates(dates: List<DutyEntity>) {
        dutyDao.addDates(dates)
    }
}