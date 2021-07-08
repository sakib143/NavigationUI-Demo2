package com.example.navigationuidemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //Geting ids
        val btnSendMoeny = view.findViewById<Button>(R.id.btnSendMoeny)
        val btnViewBalance = view.findViewById<Button>(R.id.btnViewBalance)
        val btnViewTransaction = view.findViewById<Button>(R.id.btnViewTransaction)

        val navController = view.findNavController()

        //Set click listner.
        btnSendMoeny.setOnClickListener() {
            val action = HomeFragmentDirections.actionHomeFragment2ToChooseReceiverFragment()
            navController.navigate(action)
        }

        btnViewBalance.setOnClickListener() {
            val action = HomeFragmentDirections.actionHomeFragment2ToViewBalanceFragment()
            navController.navigate(action)
        }

        btnViewTransaction.setOnClickListener() {
            val action = HomeFragmentDirections.actionHomeFragment2ToViewTransactionFragment()
            navController.navigate(action)
        }


    }
}