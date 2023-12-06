import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ein.R

public class ElbFragmentDirections private constructor() {
  public companion object {
    public fun actionElbFragmentToYdActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_elbFragment_to_ydActivity)

    public fun actionElbFragmentToPxActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_elbFragment_to_pxActivity)

    public fun actionElbFragmentToPzActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_elbFragment_to_pzActivity)

    public fun actionElbFragmentToCyActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_elbFragment_to_cyActivity)
  }
}
