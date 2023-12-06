package com.example.ein.base.room.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\'J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/ein/base/room/dao/DutyDao;", "", "GetAllDuty", "", "Lcom/example/ein/base/room/entity/DutyEntity;", "addDates", "", "dates", "app_debug"})
public abstract interface DutyDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addDates(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ein.base.room.entity.DutyEntity> dates);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM duty_table WHERE createdAt <= date(\'now\', \'localtime\', \'+1 day\') ORDER BY createdAt DESC")
    public abstract java.util.List<com.example.ein.base.room.entity.DutyEntity> GetAllDuty();
}