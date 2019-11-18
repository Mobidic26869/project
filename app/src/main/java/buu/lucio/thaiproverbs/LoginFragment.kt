package buu.lucio.thaiproverbs


import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.lucio.thaiproverbs.databinding.FragmentLoginBinding
import buu.lucio.thaiproverbs.databinding.FragmentTitleBinding
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
       val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,R.layout.fragment_login,container,false)
        binding.loginButton.setOnClickListener {view ->
            var status = if(user_EditText.text.toString().equals("pimnipa")
                && Pass_editText.text.toString().equals("1234"))  "Login Successfuly" else "LogIn Fail"
            if (Toast.makeText(context,status, Toast.LENGTH_SHORT).show().equals("Login Successfuly")){
                view.findNavController().navigate(R.id.action_loginFragment4_to_titleFragment)
            }else{
                view.findNavController().navigate(R.id.action_loginFragment4_self)
            }


        }
        return binding.root
    }


}
