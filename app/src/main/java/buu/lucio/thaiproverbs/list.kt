package buu.lucio.thaiproverbs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentListBinding
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class list : Fragment() {


   var nameItem = arrayOf("A", "B", "C")



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListBinding>(inflater,R.layout.fragment_list,container,false)
        binding.goButton.setOnClickListener{view ->
            view.findNavController().navigate(R.id.action_list_to_results)

        }

        val adapter = customAdapter()
        binding.listRecyclerview.adapter = adapter

        return binding.root
    }
}
