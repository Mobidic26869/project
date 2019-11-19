package buu.lucio.thaiproverbs


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentCategoryBinding

/**
 * A simple [Fragment] subclass.
 */
class CategoryFragment : Fragment() {

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
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.back,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.backMenu -> findNavController().navigate(R.id.action_category2_to_titleFragment)
        }
        return super.onOptionsItemSelected(item)
    }

}
