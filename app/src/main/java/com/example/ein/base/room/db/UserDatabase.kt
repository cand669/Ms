package com.example.ein.base.room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.ein.UserDao
import com.example.ein.UserEntity
import com.example.ein.base.room.Converters
import com.example.ein.base.room.dao.DutyDao
import com.example.ein.base.room.entity.DutyEntity

// UserDatabase represents database and contains the database holder and server the main access point for the underlying connection to your app's persisted, relational data.


@Database(entities =  [UserEntity::class, DutyEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class UserDatabase : RoomDatabase() { // <- Add 'abstract' keyword and extends RoomDatabase
    abstract fun userDao(): UserDao
    abstract fun dutyDao(): DutyDao

    companion object {
        @Volatile
        var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.inMemoryDatabaseBuilder(
                    context,
                    UserDatabase::class.java,
                ).allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }

        }
    }
}