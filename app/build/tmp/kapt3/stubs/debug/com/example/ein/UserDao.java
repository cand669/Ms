package com.example.ein;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\b\u0010\u0005\u001a\u00020\u0003H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\'J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\'J\n\u0010\u000e\u001a\u0004\u0018\u00010\tH\'J\n\u0010\u000f\u001a\u0004\u0018\u00010\tH\'J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\'J\n\u0010\u0011\u001a\u0004\u0018\u00010\tH\'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\'J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'\u00a8\u0006\u001a"}, d2 = {"Lcom/example/ein/UserDao;", "", "Clear", "", "ClearYYY", "FullYYY", "FullZZZ", "GetAll", "", "Lcom/example/ein/UserEntity;", "GetAllIDX", "GetLock", "id", "", "GetOne", "GetXXX", "GetYYY", "GetZZZ", "LockOne", "M", "yw", "", "P", "UnLockOne", "addUsers", "users", "app_debug"})
public abstract interface UserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ein.UserEntity> users);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE yw = \'xxx\'")
    public abstract com.example.ein.UserEntity GetXXX();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE id = :id")
    public abstract com.example.ein.UserEntity GetLock(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE yw != \'xxx\' and yw != \'yyy\' and yw != \'zzz\' and idx >=1  LIMIT 1")
    public abstract com.example.ein.UserEntity GetOne();
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = :id WHERE yw = \'xxx\'")
    public abstract void LockOne(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table")
    public abstract java.util.List<com.example.ein.UserEntity> GetAll();
    
    public abstract void UnLockOne();
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = idx + 3 WHERE yw = :yw")
    public abstract void P(@org.jetbrains.annotations.NotNull()
    java.lang.String yw);
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = idx - 1 WHERE yw = :yw")
    public abstract void M(@org.jetbrains.annotations.NotNull()
    java.lang.String yw);
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = idx + 1 WHERE yw = \'yyy\'")
    public abstract void FullYYY();
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = 0 WHERE yw =\'yyy\'")
    public abstract void ClearYYY();
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = idx + 1 WHERE yw = \'zzz\'")
    public abstract void FullZZZ();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE yw == \'yyy\'")
    public abstract com.example.ein.UserEntity GetYYY();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE yw == \'zzz\'")
    public abstract com.example.ein.UserEntity GetZZZ();
    
    @androidx.room.Query(value = "UPDATE user_table SET idx = 1 WHERE yw != \'xxx\' and yw != \'yyy\' and yw != \'zzz\'")
    public abstract void Clear();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE yw != \'xxx\' and yw != \'yyy\' and yw != \'zzz\'")
    public abstract java.util.List<com.example.ein.UserEntity> GetAllIDX();
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void UnLockOne(@org.jetbrains.annotations.NotNull()
        com.example.ein.UserDao $this) {
        }
    }
}