package com.example.navigationuidemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_choose_receiver.*

class ChooseReceiverFragment : Fragment(R.layout.fragment_choose_receiver) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = view.findNavController()
        val btnNext = view.findViewById<Button>(R.id.btnNext)

        val receiverName = edtName.text.toString()


        btnNext.setOnClickListener() {
            val action = ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment("Sakib",100)
            navController.navigate(action)
        }

        btnCancel.setOnClickListener() {
            navController.popBackStack()
        }
    }

}