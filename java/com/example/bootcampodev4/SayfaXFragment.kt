package com.example.bootcampodev4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SayfaXFragment : Fragment(R.layout.fragment_sayfax) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        
        
        view.findViewById<Button>(R.id.btnGitYFromX)?.setOnClickListener { findNavController().navigate(R.id.action_sayfaX_to_sayfaY) }
        
    }
}
