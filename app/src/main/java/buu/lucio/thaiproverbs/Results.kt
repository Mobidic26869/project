package buu.lucio.thaiproverbs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentResultsBinding

/**
 * A simple [Fragment] subclass.
 */
class Results : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentResultsBinding>(inflater,R.layout.fragment_results,container,false)
        binding.backButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_results_to_list)

        }
        binding.homeButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_results_to_titleFragment)
        }
        return binding.root
    }


}
