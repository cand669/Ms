
import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\'"}, d2 = {"LDutyFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/haibin/calendarview/CalendarView$OnCalendarSelectListener;", "Lcom/haibin/calendarview/CalendarView$OnYearChangeListener;", "Landroid/view/View$OnClickListener;", "()V", "mCalendarView", "Lcom/haibin/calendarview/CalendarView;", "getMCalendarView", "()Lcom/haibin/calendarview/CalendarView;", "setMCalendarView", "(Lcom/haibin/calendarview/CalendarView;)V", "getSchemeCalendar", "Lcom/haibin/calendarview/Calendar;", "year", "", "month", "day", "color", "", "text", "", "onCalendarOutOfRange", "", "calendar", "onCalendarSelect", "isClick", "", "onClick", "p0", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onYearChange", "app_debug"})
public final class DutyFragment extends androidx.fragment.app.Fragment implements com.haibin.calendarview.CalendarView.OnCalendarSelectListener, com.haibin.calendarview.CalendarView.OnYearChangeListener, android.view.View.OnClickListener {
    public com.haibin.calendarview.CalendarView mCalendarView;
    
    @org.jetbrains.annotations.NotNull()
    public final com.haibin.calendarview.CalendarView getMCalendarView() {
        return null;
    }
    
    public final void setMCalendarView(@org.jetbrains.annotations.NotNull()
    com.haibin.calendarview.CalendarView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final com.haibin.calendarview.Calendar getSchemeCalendar(int year, int month, int day, long color, java.lang.String text) {
        return null;
    }
    
    @java.lang.Override()
    public void onCalendarOutOfRange(@org.jetbrains.annotations.Nullable()
    com.haibin.calendarview.Calendar calendar) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onCalendarSelect(@org.jetbrains.annotations.NotNull()
    com.haibin.calendarview.Calendar calendar, boolean isClick) {
    }
    
    @java.lang.Override()
    public void onYearChange(int year) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    public DutyFragment() {
        super();
    }
}