package buu.lucio.thaiproverbs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class Title : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
       val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false)
        binding.categoryButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_title2_to_category2)

        }
        return binding.root
    }


}
