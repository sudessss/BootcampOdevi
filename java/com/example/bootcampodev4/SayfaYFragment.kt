package com.example.bootcampodev4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SayfaYFragment : Fragment(R.layout.fragment_sayfay) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        
        
        
        view.findViewById<Button>(R.id.btnGeriAna)?.setOnClickListener { findNavController().navigate(R.id.action_sayfaY_to_anasayfa) }
    }
}
