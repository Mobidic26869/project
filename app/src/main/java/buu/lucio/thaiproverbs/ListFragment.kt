package buu.lucio.thaiproverbs


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import buu.lucio.thaiproverbs.databinding.FragmentListBinding
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_list.*
import kotlinx.android.synthetic.main.list_item.*

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
        val type1 = R.id.category1_button
        val type2 = R.id.category2_button


        var arrList: ArrayList<ListData> = ArrayList()

        arrList.add(ListData("กงเกวียนกำเกวียน"))
        arrList.add(ListData("กบเกิดใต้บัวบาน"))
        arrList.add(ListData("กระจอกงอกง่อย"))



        arrList.add(ListData("COBRA (โค-บระ) งูเห่า"))
        arrList.add(ListData("EAGLE (อิ-เกิล) นกอินทรี"))
        arrList.add(ListData("GOOSE (กูส)  ห่าน"))


        arrList.add(ListData("KOALA (โคอาลา) หมีโคอาลา"))
        arrList.add(ListData("PENGUIN (แพน-ควิน) เพนกวิน"))
        arrList.add(ListData("RACCOON (เรคูน) แร็คคูน"))



        binding.listView.adapter = this.context?.let { customAdapter(it,arrList) }


        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.back,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){
           R.id.backMenu -> findNavController().navigate(R.id.action_list_to_category2)
       }
        return super.onOptionsItemSelected(item)
    }
}
