package com.example.navigationuidemo.viewtransactions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.findNavController
import com.example.navigationuidemo.R

class ViewTransactionFragment : Fragment(R.layout.fragment_view_transactions) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNext = view.findViewById<Button>(R.id.btnNext)
        val navController = view.findNavController()

        btnNext.setOnClickListener() {
            // Here we have not passed amount becase of default value
            val action = ViewTransactionFragmentDirections.actionViewTransactionFragmentToSendCashFragment(name="Sakib")
            navController.navigate(action)
        }

    }

}