package com.example.ein

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUsers(users: List<UserEntity>)


    @Query("SELECT * FROM user_table WHERE yw = 'xxx'")
    fun GetXXX(): UserEntity?


    @Query("SELECT * FROM user_table WHERE id = :id")
    fun GetLock(id: Int): UserEntity?

    @Query("SELECT * FROM user_table WHERE yw != 'xxx' and yw != 'yyy' and yw != 'zzz' and idx >=1  LIMIT 1")
    fun GetOne(): UserEntity?

    @Query("UPDATE user_table SET idx = :id WHERE yw = 'xxx'")
    fun LockOne(id: Int)

    @Query("SELECT * FROM user_table")
    fun GetAll(): List<UserEntity>?

    fun UnLockOne(){
        LockOne(0)
    }

    @Query("UPDATE user_table SET idx = idx + 3 WHERE yw = :yw")
    fun P(yw: String)

    @Query("UPDATE user_table SET idx = idx - 1 WHERE yw = :yw")
    fun M(yw: String)

    @Query("UPDATE user_table SET idx = idx + 1 WHERE yw = 'yyy'")
    fun FullYYY()

    @Query("UPDATE user_table SET idx = 0 WHERE yw ='yyy'")
    fun ClearYYY()

    @Query("UPDATE user_table SET idx = idx + 1 WHERE yw = 'zzz'")
    fun FullZZZ()

    @Query("SELECT * FROM user_table WHERE yw == 'yyy'")
    fun GetYYY(): UserEntity?

    @Query("SELECT * FROM user_table WHERE yw == 'zzz'")
    fun GetZZZ(): UserEntity?

    @Query("UPDATE user_table SET idx = 1 WHERE yw != 'xxx' and yw != 'yyy' and yw != 'zzz'")
    fun Clear()

    @Query("SELECT * FROM user_table WHERE yw != 'xxx' and yw != 'yyy' and yw != 'zzz'")
    fun GetAllIDX():List<UserEntity>?

}