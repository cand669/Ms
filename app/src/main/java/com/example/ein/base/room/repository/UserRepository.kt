package com.example.ein

import android.util.Log
import androidx.lifecycle.LiveData

// User Repository abstracts access to multiple data sources. However this is not the part of the Architecture Component libraries.

class UserRepository(private val userDao: UserDao) {

    fun addUsers(users: List<UserEntity>) {
        userDao.addUsers(users)
    }

    fun GetXXX(): UserEntity? {
        return userDao.GetXXX()
    }

    fun GetLock(id: Int): UserEntity? {
        return userDao.GetLock(id)
    }

    fun GetOne(): UserEntity? {
        return userDao.GetOne()
    }

    fun LockOne(id: Int) {
        userDao.LockOne(id)
    }

    fun GetAll(): List<UserEntity>? {
        return userDao.GetAll()
    }

    fun UnLockOne() {
        userDao.UnLockOne()
    }

    fun P(yw: String) {
        userDao.P(yw)
    }

    fun M(yw: String) {
        userDao.M(yw)
    }

    fun FullYYY() {
        userDao.FullYYY()
    }

    fun ClearYYY() {
        userDao.ClearYYY()
    }

    fun FullZZZ() {
        userDao.FullZZZ()
    }

    fun Clear() {
        userDao.Clear()
    }

    fun GetYYY(): Int {
        return userDao.GetYYY()?.let {
            return it.idx
        } ?: run {
            return -1
        }
    }

    fun GetZZZ(): Int {
        return userDao.GetZZZ()?.let {
            return it.idx
        } ?: run {
            return -1
        }
    }
    fun GetAllIDX():Int{

         return userDao.GetAllIDX()?.let {
             var all_idx = 0

             it.forEach {
                 all_idx += it.idx
             }
             return all_idx
         }?: run {
            return  -1
         }
    }
}