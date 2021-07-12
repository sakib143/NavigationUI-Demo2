package com.example.navigationuidemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_setting.*

class SettingsFragment : Fragment(R.layout.fragment_setting) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edtDefaultAmount.setText(SampleData.defaultValue.value.toString())

        btnSaveDefaultAmount.setOnClickListener() {
            val amount = edtDefaultAmount.text.toString().toLong()
            SampleData.defaultValue.postValue(amount)
        }
    }

}