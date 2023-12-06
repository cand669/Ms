package com.example.ein.base.room.entity
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date

//@Entity(tableName = "duty_table")
//@Parcelize
//data class DutyEntity(
//    @PrimaryKey(autoGenerate = true)
//    val id: Int = 0,
//    val memoTitle: String = "3",
//    val createdAt: Date? = null
//): Parcelable{
//
//    val createdDateFormatted : String
//        get() =memoTitle+"FFF"
//
//}
@Entity(tableName = "duty_table")
@Parcelize
data class DutyEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val memoTitle: String = "3",
    val createdAt: LocalDateTime = LocalDateTime.now(),
): Parcelable{

    val createdDateFormatted : String
        get() =memoTitle+"FFF"

}