import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ein.adapter.SmartAdapter
import com.example.ein.databinding.FragmentCaBinding
import java.util.ArrayList

class CaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentCaBinding . inflate (inflater, container, false)
        val recyclerView= binding.recyclerview
        val manager = LinearLayoutManager(requireContext())
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
        val adapter = SmartAdapter<String>()
        recyclerView.adapter = adapter
        adapter.loadMore(ArrayList<String>().apply {
            for (i in 0..100) {
                add("item $i")
            }
        })
        return binding.root
    }

}