package buu.lucio.thaiproverbs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentListBinding
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class   ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentListBinding>(inflater, R.layout.fragment_list, container, false)


        var arrList: ArrayList<ListData> = ArrayList()
        arrList.add(ListData("กงเกวียนกำเกวียน"))
        arrList.add(ListData("กบเกิดใต้บัวบาน"))
        arrList.add(ListData("กระจอกงอกง่อย"))
        arrList.add(ListData("COBRA (โค-บระ) งูเห่า"))
        arrList.add(ListData("EAGLE (อิ-เกิล) นกอินทรี"))
        arrList.add(ListData("GOOSE (กูส)  ห่าน" ))
        arrList.add(ListData("KOALA (โคอาลา) หมีโคอาลา"))
        arrList.add(ListData("PENGUIN (แพน-ควิน) เพนกวิน"))
        arrList.add(ListData("RACCOON (เรคูน) แร็คคูน"))


        binding.listView.adapter = this.context?.let { customAdapter(it,arrList) }

        return binding.root
    }


}
