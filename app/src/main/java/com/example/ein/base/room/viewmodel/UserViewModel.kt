package com.example.ein

import android.app.Application
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.ein.base.room.db.UserDatabase
import com.example.ein.base.room.entity.DutyEntity
import com.example.ein.base.room.repository.DutyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: UserRepository
    private val dutyrepository:DutyRepository
    init {
        val userDao = UserDatabase.getDatabase(application).userDao()
        repository = UserRepository(userDao)
        val dutyDao = UserDatabase.getDatabase(application).dutyDao()
        dutyrepository = DutyRepository(dutyDao)
    }

    fun addDates(dates: List<DutyEntity>) {
        dutyrepository.addDates(dates)
    }
    fun GetAllDuty(): List<DutyEntity>? {
        return dutyrepository.GetAllDuty()
    }
    fun addUsers(users: List<UserEntity>) {
        repository.addUsers(users)
    }
    private fun _GetOne(xxx: TextView):UserEntity?{
        return repository.GetOne()?.let {
            xxx.text = "<${it.id}>"
            repository.LockOne(it.id)
            return it
        }
    }
    fun GetOne(xxx:TextView): UserEntity? {
        return repository.GetXXX()?.let {
            if (it.idx == 0){
                return _GetOne(xxx)
            }else{
                xxx.text = "<${it.id}>"
                return repository.GetLock(it.idx)
            }
        } ?: run {
            return _GetOne(xxx)
        }
    }

    fun getAll(): List<UserEntity>? {
        return repository.GetAll()
    }

    fun P(yw: String) {
        repository.P(yw)
    }

    fun M(yw: String) {
        repository.M(yw)
        repository.UnLockOne()
    }

    fun GetYZ(): List<Int> {
        val y = repository.GetYYY()
        val z = repository.GetZZZ()
        return listOf(y, z)
    }

    fun Clear(e: Int): List<Int> {
        repository.Clear()
        repository.UnLockOne()
        repository.FullYYY()
        val y = repository.GetYYY()
        if (y >= e) {
            repository.FullZZZ()
            repository.ClearYYY()
        }
        return GetYZ()
    }
    fun GetIDX():Int{
        return repository.GetAllIDX()
    }
}