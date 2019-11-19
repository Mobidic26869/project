package buu.lucio.thaiproverbs


import android.content.Context
import android.os.Bundle
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
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
            if(user_EditText.text.toString().equals("pimnipa")
                && Pass_editText.text.toString().equals("1234"))
                Toast.makeText(context,"Login Successfuly", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginFragment4_to_titleFragment)}
            else Toast.makeText(context,"Login Fail", Toast.LENGTH_SHORT).show().run { view.findNavController().navigate(R.id.action_loginFragment4_self)}


        }

        return binding.root

    }

}
