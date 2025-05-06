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
}package com.example.bootcampodev4

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
