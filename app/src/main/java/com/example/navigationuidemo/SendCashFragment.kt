package com.example.navigationuidemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash) {

    private val args: SendCashFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = view.findNavController()

        val receiverName: String = args.name
        val amount: Int = args.amount

        tvReceiverName.setText("Send cash to $receiverName")
        edtAmount.setText(amount.toString())

        val selectedAmount  = edtAmount.text.toString().toInt()

        btnNext.setOnClickListener() {
            val action = SendCashFragmentDirections.actionSendCashFragmentToConfirmDialogFragment3(receiverName,selectedAmount)
            findNavController().navigate(action)
        }

        btnDone.setOnClickListener() {
            val action = SendCashFragmentDirections.actionSendCashFragmentToHomeFragment2()
            findNavController().navigate(action)
        }


        btnCancel.setOnClickListener() {
            navController.popBackStack()
        }
    }
}