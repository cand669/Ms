package com.example.ein.base.room.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.ein.base.room.Converters.class})
@androidx.room.Database(entities = {com.example.ein.UserEntity.class, com.example.ein.base.room.entity.DutyEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/ein/base/room/db/UserDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dutyDao", "Lcom/example/ein/base/room/dao/DutyDao;", "userDao", "Lcom/example/ein/UserDao;", "Companion", "app_debug"})
public abstract class UserDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable()
    private static volatile com.example.ein.base.room.db.UserDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.ein.base.room.db.UserDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.ein.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.ein.base.room.dao.DutyDao dutyDao();
    
    public UserDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/ein/base/room/db/UserDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/ein/base/room/db/UserDatabase;", "getINSTANCE", "()Lcom/example/ein/base/room/db/UserDatabase;", "setINSTANCE", "(Lcom/example/ein/base/room/db/UserDatabase;)V", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.ein.base.room.db.UserDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable()
        com.example.ein.base.room.db.UserDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.ein.base.room.db.UserDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}