import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ein.databinding.FragmentDutyBinding
import com.haibin.calendarview.Calendar
import com.haibin.calendarview.CalendarView

class DutyFragment : Fragment(),  CalendarView.OnCalendarSelectListener,
    CalendarView.OnYearChangeListener,View.OnClickListener {

    lateinit var mCalendarView:CalendarView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentDutyBinding . inflate (inflater, container, false)
        mCalendarView = binding.calendarView
        mCalendarView.setOnCalendarSelectListener(this);
        mCalendarView.setOnYearChangeListener(this);
        val year = mCalendarView.curYear
        val month = mCalendarView.curMonth
        binding.f0.setOnClickListener(this)
        var map = HashMap<String, Calendar>()
        map.put(getSchemeCalendar(year, month, 3, 0xFF40db25, "20").toString(),
            getSchemeCalendar(year, month, 3, 0xFF40db25, "20"));
        map.put(getSchemeCalendar(year, month, 6, 0xFFe69138, "33").toString(),
            getSchemeCalendar(year, month, 6, 0xFFe69138, "33"));
        map.put(getSchemeCalendar(year, month, 9, 0xFFdf1356, "25").toString(),
            getSchemeCalendar(year, month, 9, 0xFFdf1356, "25"));
        map.put(getSchemeCalendar(year, month, 13, 0xFFedc56d, "50").toString(),
            getSchemeCalendar(year, month, 13, 0xFFedc56d, "50"));

        mCalendarView.setSchemeDate(map)

        return binding.root
    }
    private fun getSchemeCalendar(
        year: Int,
        month: Int,
        day: Int,
        color: Long,
        text: String
    ): Calendar {
        val calendar = Calendar()
        calendar.setYear(year)
        calendar.setMonth(month)
        calendar.setDay(day)
        calendar.setSchemeColor(color.toInt()) //如果单独标记颜色、则会使用这个颜色
        calendar.setScheme(text)
        return calendar
    }

    override fun onCalendarOutOfRange(calendar: Calendar?) {
        TODO("Not yet implemented")
    }

    @SuppressLint("SetTextI18n")
    override fun onCalendarSelect(calendar: Calendar, isClick: Boolean) {
        Log.i("FFWAF","${calendar.year}-${calendar.month}-${calendar.day}")

    }

    override fun onYearChange(year: Int) {

        Log.i("FFWAF","${year}")
    }

    override fun onClick(p0: View?) {
        Log.i("FFWAF","ZZZ")
        val year = mCalendarView.curYear
        val month = mCalendarView.curMonth
        var map = HashMap<String, Calendar>()
        map.put(getSchemeCalendar(year, month, 14, 0xFFedc56d, "80").toString(),
            getSchemeCalendar(year, month, 14, 0xFFedc56d, "80"));
        map.put(getSchemeCalendar(year, month, 15, 0xFFaacc44, "20").toString(),
            getSchemeCalendar(year, month, 15, 0xFFaacc44, "20"));
        map.put(getSchemeCalendar(year, month, 18, 0xFFbc13f0, "70").toString(),
            getSchemeCalendar(year, month, 18, 0xFFbc13f0, "70"));
        map.put(getSchemeCalendar(year, month, 25, 0xFF13acf0, "36").toString(),
            getSchemeCalendar(year, month, 25, 0xFF13acf0, "36"));
        map.put(getSchemeCalendar(year, month, 27, 0xFF13acf0, "95").toString(),
            getSchemeCalendar(year, month, 27, 0xFF13acf0, "95"));
        mCalendarView.setSchemeDate(map)
    }
}