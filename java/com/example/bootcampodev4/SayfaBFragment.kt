package com.example.bootcampodev4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SayfaBFragment : Fragment(R.layout.fragment_sayfab) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        
        view.findViewById<Button>(R.id.btnGitYFromB)?.setOnClickListener { findNavController().navigate(R.id.action_sayfaB_to_sayfaY) }
        
        
    }
}
