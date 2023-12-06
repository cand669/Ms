package com.example.ein.widget.progress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0014J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/ein/widget/progress/ProgressWeekView;", "Lcom/haibin/calendarview/WeekView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mNoneProgressPaint", "Landroid/graphics/Paint;", "mProgressPaint", "mRadius", "", "onDrawScheme", "", "canvas", "Landroid/graphics/Canvas;", "calendar", "Lcom/haibin/calendarview/Calendar;", "x", "onDrawSelected", "", "hasScheme", "onDrawText", "isSelected", "onPreviewHook", "Companion", "app_debug"})
public final class ProgressWeekView extends com.haibin.calendarview.WeekView {
    private final android.graphics.Paint mProgressPaint = null;
    private final android.graphics.Paint mNoneProgressPaint = null;
    private int mRadius = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.ein.widget.progress.ProgressWeekView.Companion Companion = null;
    
    @java.lang.Override()
    protected void onPreviewHook() {
    }
    
    @java.lang.Override()
    protected boolean onDrawSelected(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.Nullable()
    com.haibin.calendarview.Calendar calendar, int x, boolean hasScheme) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDrawScheme(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    com.haibin.calendarview.Calendar calendar, int x) {
    }
    
    @java.lang.Override()
    protected void onDrawText(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    com.haibin.calendarview.Calendar calendar, int x, boolean hasScheme, boolean isSelected) {
    }
    
    public ProgressWeekView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/example/ein/widget/progress/ProgressWeekView$Companion;", "", "()V", "dipToPx", "", "context", "Landroid/content/Context;", "dpValue", "", "getAngle", "progress", "app_debug"})
    public static final class Companion {
        
        /**
         * 获取角度
         *
         * @param progress 进度
         * @return 获取角度
         */
        private final int getAngle(int progress) {
            return 0;
        }
        
        /**
         * dp转px
         *
         * @param context context
         * @param dpValue dp
         * @return px
         */
        private final int dipToPx(android.content.Context context, float dpValue) {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}