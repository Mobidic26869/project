package buu.lucio.thaiproverbs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentCategoryBinding

/**
 * A simple [Fragment] subclass.
 */
class Category : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCategoryBinding>(inflater,R.layout.fragment_category,container,false)
        binding.category1Button.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_category2_to_list)

        }
        binding.category2Button.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_category2_to_list)

        }
        binding.category3Button.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_category2_to_list)

        }
        return binding.root
    }


}
