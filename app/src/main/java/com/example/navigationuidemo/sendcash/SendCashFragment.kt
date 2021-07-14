package com.example.navigationuidemo.sendcash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationuidemo.R
import com.example.navigationuidemo.utils.SampleData
import kotlinx.android.synthetic.main.fragment_send_cash.*

class SendCashFragment : Fragment(R.layout.fragment_send_cash) {

    private val args: SendCashFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = view.findNavController()

        edtAmount.setText(SampleData.defaultValue.value.toString())
        SampleData.defaultValue.observe(viewLifecycleOwner) {
            edtAmount.setText(it.toString())
        }

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