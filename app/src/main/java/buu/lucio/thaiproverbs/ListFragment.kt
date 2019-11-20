package buu.lucio.thaiproverbs


import android.content.Intent
import android.content.Intent.getIntent
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


        var arrList: ArrayList<ListData> = ArrayList()

        arrList.add(ListData("กงเกวียนกำเกวียน"))
        arrList.add(ListData("กบเกิดใต้บัวบาน"))
        arrList.add(ListData("กระจอกงอกง่อย"))
        arrList.add(ListData("กระดังงาลนไฟ"))
        arrList.add(ListData("กระดี่ได้น้ำ"))
        arrList.add(ListData("กระดูกขัดมัน"))
        arrList.add(ListData("กระต่ายขาเดียว"))
        arrList.add(ListData("กระต่ายตื่นตูม"))
        arrList.add(ListData("กระต่ายหมายจันทร์"))


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
