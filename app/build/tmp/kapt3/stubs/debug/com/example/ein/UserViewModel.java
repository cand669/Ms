package com.example.ein;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\nJ\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\nJ\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/ein/UserViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dutyrepository", "Lcom/example/ein/base/room/repository/DutyRepository;", "repository", "Lcom/example/ein/UserRepository;", "Clear", "", "", "e", "GetAllDuty", "Lcom/example/ein/base/room/entity/DutyEntity;", "GetIDX", "GetOne", "Lcom/example/ein/UserEntity;", "xxx", "Landroid/widget/TextView;", "GetYZ", "M", "", "yw", "", "P", "_GetOne", "addDates", "dates", "addUsers", "users", "getAll", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.ein.UserRepository repository = null;
    private final com.example.ein.base.room.repository.DutyRepository dutyrepository = null;
    
    public final void addDates(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ein.base.room.entity.DutyEntity> dates) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.ein.base.room.entity.DutyEntity> GetAllDuty() {
        return null;
    }
    
    public final void addUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ein.UserEntity> users) {
    }
    
    private final com.example.ein.UserEntity _GetOne(android.widget.TextView xxx) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ein.UserEntity GetOne(@org.jetbrains.annotations.NotNull()
    android.widget.TextView xxx) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.ein.UserEntity> getAll() {
        return null;
    }
    
    public final void P(@org.jetbrains.annotations.NotNull()
    java.lang.String yw) {
    }
    
    public final void M(@org.jetbrains.annotations.NotNull()
    java.lang.String yw) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> GetYZ() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> Clear(int e) {
        return null;
    }
    
    public final int GetIDX() {
        return 0;
    }
    
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}