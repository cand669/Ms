package com.example.ein.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020*H\u0002J\u0010\u0010.\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u000e\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\u000bJ\u0006\u00101\u001a\u00020*J\u0012\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020*2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0014\u00108\u001a\u00020*2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001109J\u0006\u0010:\u001a\u00020*J\u0006\u0010;\u001a\u00020*J\u0006\u0010<\u001a\u00020*R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001a\u0010 \u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001a\u0010#\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001a\u0010&\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0007\"\u0004\b(\u0010\t\u00a8\u0006="}, d2 = {"Lcom/example/ein/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "aidx", "Landroid/widget/TextView;", "getAidx", "()Landroid/widget/TextView;", "setAidx", "(Landroid/widget/TextView;)V", "ce", "Lcom/example/ein/UserEntity;", "getCe", "()Lcom/example/ein/UserEntity;", "setCe", "(Lcom/example/ein/UserEntity;)V", "e", "", "getE", "()I", "idx", "getIdx", "setIdx", "vm", "Lcom/example/ein/UserViewModel;", "getVm", "()Lcom/example/ein/UserViewModel;", "setVm", "(Lcom/example/ein/UserViewModel;)V", "xxx", "getXxx", "setXxx", "yw", "getYw", "setYw", "yyy", "getYyy", "setYyy", "zzz", "getZzz", "setZzz", "initListen", "", "binding", "Lcom/example/ein/databinding/ActivityMainBinding;", "initMain", "initView", "mp", "data", "next", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setYZ", "", "show", "tc", "te", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public com.example.ein.UserViewModel vm;
    public android.widget.TextView yw;
    public android.widget.TextView idx;
    public android.widget.TextView yyy;
    public android.widget.TextView zzz;
    public android.widget.TextView xxx;
    public android.widget.TextView aidx;
    @org.jetbrains.annotations.Nullable()
    private com.example.ein.UserEntity ce;
    private final int e = 3;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ein.UserViewModel getVm() {
        return null;
    }
    
    public final void setVm(@org.jetbrains.annotations.NotNull()
    com.example.ein.UserViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListen(com.example.ein.databinding.ActivityMainBinding binding) {
    }
    
    private final void initMain() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getYw() {
        return null;
    }
    
    public final void setYw(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getIdx() {
        return null;
    }
    
    public final void setIdx(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getYyy() {
        return null;
    }
    
    public final void setYyy(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getZzz() {
        return null;
    }
    
    public final void setZzz(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getXxx() {
        return null;
    }
    
    public final void setXxx(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getAidx() {
        return null;
    }
    
    public final void setAidx(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    private final void initView(com.example.ein.databinding.ActivityMainBinding binding) {
    }
    
    public final void tc() {
    }
    
    public final void te() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.ein.UserEntity getCe() {
        return null;
    }
    
    public final void setCe(@org.jetbrains.annotations.Nullable()
    com.example.ein.UserEntity p0) {
    }
    
    public final void mp(@org.jetbrains.annotations.NotNull()
    com.example.ein.UserEntity data) {
    }
    
    public final void setYZ(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> v) {
    }
    
    public final int getE() {
        return 0;
    }
    
    public final void next() {
    }
    
    public final void show() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public MainActivity() {
        super();
    }
}