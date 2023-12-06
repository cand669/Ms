import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ein.R

public class YrFragmentDirections private constructor() {
  public companion object {
    public fun actionYrFragmentToYkFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_yrFragment_to_ykFragment)
  }
}
