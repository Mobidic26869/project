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


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListBinding>(inflater,R.layout.fragment_list,container,false)
        var arrList: ArrayList<List> = ArrayList()
        arrList.add(List("Apple","asian pear description"))
        arrList.add(List("Asian pear", "asian pear description"))
        arrList.add(List("Banana", "banana description"))
        arrList.add(List("Cantaloupe", "cantaloupe description"))
        arrList.add(List("Custard apple", "custard apple description"))
        arrList.add(List("Dragon fruit", "dragon fruit description"))
        arrList.add(List("Durian", "durian description"))

        binding.listView.adapter = this.context?.let{ customAdapter(it,arrList)}
        return binding.root
    }
}
