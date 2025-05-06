package com.example.bootcampodev4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SayfaAFragment : Fragment(R.layout.fragment_sayfaa) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnGitB)?.setOnClickListener { findNavController().navigate(R.id.action_sayfaA_to_sayfaB) }
        
        
        
    }
}
