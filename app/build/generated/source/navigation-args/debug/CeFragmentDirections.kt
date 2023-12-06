import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ein.R

public class CeFragmentDirections private constructor() {
  public companion object {
    public fun actionCeFragmentToCaFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_ceFragment_to_caFragment)
  }
}
