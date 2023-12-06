import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ein.R
import com.example.ein.databinding.ActivityPxBinding
import com.example.ein.databinding.FragmentElbBinding

class ElbFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentElbBinding.inflate(inflater, container, false)
        initView(binding)
        initListen(binding)
        initMain()
        return binding.root
    }

    private fun initView(binding: FragmentElbBinding) {

    }


    private fun initListen(binding: FragmentElbBinding) {
        binding.yd.setOnClickListener(this)
        binding.px.setOnClickListener(this)
        binding.pz.setOnClickListener(this)
        binding.cy.setOnClickListener(this)
    }

    private fun initMain() {

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.yd -> findNavController().navigate(R.id.action_elbFragment_to_ydActivity)
            R.id.px -> findNavController().navigate(R.id.action_elbFragment_to_pxActivity)
            R.id.pz -> findNavController().navigate(R.id.action_elbFragment_to_pzActivity)
            R.id.cy -> findNavController().navigate(R.id.action_elbFragment_to_cyActivity)

        }
    }
}