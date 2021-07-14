package com.example.navigationuidemo.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationuidemo.NavigationDirections
import com.example.navigationuidemo.R
import com.example.navigationuidemo.utils.SampleData
import kotlinx.android.synthetic.main.fragment_setting.*

class SettingsFragment : Fragment(R.layout.fragment_setting) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edtDefaultAmount.setText(SampleData.defaultValue.value.toString())

        btnSaveDefaultAmount.setOnClickListener() {
            val amount = edtDefaultAmount.text.toString().toLong()
            SampleData.defaultValue.postValue(amount)
        }

        btnAboutApp.setOnClickListener() {
            val action = NavigationDirections.actionGlobalAboutAppFragment()
            findNavController().navigate(action)
        }
    }

}