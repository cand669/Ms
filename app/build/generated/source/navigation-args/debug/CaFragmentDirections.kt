import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ein.R

public class CaFragmentDirections private constructor() {
  public companion object {
    public fun actionCaFragmentToCeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_caFragment_to_ceFragment)
  }
}
