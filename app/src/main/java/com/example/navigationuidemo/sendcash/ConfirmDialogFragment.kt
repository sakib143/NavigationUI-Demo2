package com.example.navigationuidemo.sendcash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.navigationuidemo.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_confirm_dialog.*

class ConfirmDialogFragment : BottomSheetDialogFragment() {

    private val args: ConfirmDialogFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_confirm_dialog,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = args.name
        val amount = args.amount

        title.setText("Do you want to $amount to $name")

        btnYes.setOnClickListener() {
            Toast.makeText(requireActivity(),"$amount has been send to $name",Toast.LENGTH_LONG).show()
        }

        btnNO.setOnClickListener() {
            dismiss()
        }

    }

}