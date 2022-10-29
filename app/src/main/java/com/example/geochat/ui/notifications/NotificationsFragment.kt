package com.example.geochat.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.geochat.ProfileActivity
import com.example.geochat.R
import com.example.geochat.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        //
        var rootView : View = inflater.inflate(R.layout.fragment_notifications, container, false)

        val profileBtn : ImageView = rootView.findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener{goToProfile()}
        val localBtn : ImageView = rootView.findViewById(R.id.qrcodeBtn);
        localBtn.setOnClickListener{goToMaps()}
        val payBtn : ImageView = rootView.findViewById(R.id.payementBtn)
        payBtn.setOnClickListener{goToPay()}
       //
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        /////////////


        ////////////
        return root
    }
    private fun goToProfile(){
        val intent = Intent (getActivity(), ProfileActivity::class.java)
        startActivity(intent)

    }

    private fun goToMaps(){

        val intent = Intent (activity, ProfileActivity::class.java)
        startActivity(intent)


    }

    private fun goToPay(){
        val intent = Intent (activity, ProfileActivity::class.java)
        startActivity(intent)

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}