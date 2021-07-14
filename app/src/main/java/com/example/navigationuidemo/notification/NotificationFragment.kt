package com.example.navigationuidemo.notification

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationuidemo.R
import com.example.navigationuidemo.choosereceiver.ChooseReceiverFragmentDirections
import kotlinx.android.synthetic.main.fragment_choose_receiver.*
import kotlinx.android.synthetic.main.fragment_notification.*

class NotificationFragment : Fragment(R.layout.fragment_notification) {

    private var adapter: NotificationAdapter? = null
    private var alUserData: ArrayList<String> = ArrayList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        for (i in 0..20) {
            alUserData.add("User $i")
        }

        rvNotifications.setHasFixedSize(true)
        rvNotifications.layoutManager = LinearLayoutManager(requireActivity())
        adapter = NotificationAdapter(requireActivity(), alUserData)
        rvNotifications.adapter = adapter
    }
}