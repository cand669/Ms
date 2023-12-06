import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ein.R

public class YkFragmentDirections private constructor() {
  public companion object {
    public fun actionYkFragmentToYrFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_ykFragment_to_yrFragment)
  }
}
