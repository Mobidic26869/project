package buu.lucio.thaiproverbs


import android.content.Context
import android.content.Intent
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
class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_results,container,false)
        binding.backButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_results_to_list)
        }
        binding.homeButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_results_to_titleFragment)
        }



//        var arrList: ArrayList<ListData> = ArrayList()
//        if(arrList["กงเกวียนกำเกวียน"].equals("กงเกวียนกำเกวียน") ) {
//            binding.detailTextView.text = "เวรสนองเวร กรรมสนองกรรม ทําแก่เขาอย่างไร ตนหรือลูกหลานเป็นต้นของตนก็อาจจะถูกทำในทำนองเดียวกันอย่างนั้นบ้าง"
//        }
//        else if(bandMusic == "กบเกิดใต้บัวบาน")
//        {
//            binding.detailTextView.text = "คนที่อยู่ในสภาพแวดล้อมที่ดี ใกล้สิ่งที่ดีงาม แต่กลับไม่เห็นคุณค่าของสิ่งนั้น"
//        }
//        else if(bandMusic == "กระจอกงอกง่อย")
//        {
//            binding.detailTextView.text = "ไร้ซึ่งประสิทธิภาพ มีแต่คนรังเกียจ ยากจนข้นแค้น ไม่มีความน่านับถือ"
//        }
//        else if(bandMusic == "Retrospect")
//        {
//            binding.detailTextView.text = ""
//        }
//        else if(bandMusic == "Sweet Mullet")
//        {
//            binding.detailTextView.text = ""
//        }else{
//            binding.detailTextView.setText("")
//
//        }







        return binding.root
    }


}
