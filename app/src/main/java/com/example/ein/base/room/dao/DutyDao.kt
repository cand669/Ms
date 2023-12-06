package com.example.ein.base.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ein.UserEntity
import com.example.ein.base.room.entity.DutyEntity
import java.util.Date
//WHERE created_at <= date('now') ORDER BY id DESC LIMIT 30
@Dao
interface DutyDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addDates(dates: List<DutyEntity>)

    @Query("SELECT * FROM duty_table WHERE createdAt <= date('now', 'localtime', '+1 day') ORDER BY createdAt DESC")
    fun GetAllDuty():List<DutyEntity>?
}