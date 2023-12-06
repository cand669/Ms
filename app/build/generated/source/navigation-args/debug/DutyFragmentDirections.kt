import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ein.R

public class DutyFragmentDirections private constructor() {
  public companion object {
    public fun actionDutyFragmentToElbFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_dutyFragment_to_elbFragment)
  }
}
