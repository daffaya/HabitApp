package com.dicoding.habitapp.data

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

//TODO 1 : Define a local database table using the schema in app/schema/habits.json
@Parcelize
@Entity(tableName = HabitFieldName.TABLE_NAME)
data class Habit(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = HabitFieldName.COL_ID)
    val id: Int = 0,
    @ColumnInfo(name = HabitFieldName.COL_TITLE)
    val title: String,
    @ColumnInfo(name = HabitFieldName.COL_MINUTES_FOCUS)
    val minutesFocus: Long,
    @ColumnInfo(name = HabitFieldName.COL_START_TIME)
    val startTime: String,
    @ColumnInfo(name = HabitFieldName.COL_PRIORITY_LEVEL)
    val priorityLevel: String
): Parcelable
