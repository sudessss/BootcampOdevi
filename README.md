# BootcampOdevi
package com.example.bootcampodev4

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AnasayfaFragment : Fragment(R.layout.fragment_anasayfa) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnGitA).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfa_to_sayfaA)
        }

        view.findViewById<Button>(R.id.btnGitX).setOnClickListener {
            findNavController().navigate(R.id.action_anasayfa_to_sayfaX)
        }
    }
}
