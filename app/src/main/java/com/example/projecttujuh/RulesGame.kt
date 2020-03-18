@file:Suppress("UNREACHABLE_CODE")

package com.example.projecttujuh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class RulesGame : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)

       = inflater.inflate(R.layout.rulesl, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
       view.findViewById<Button>(R.id.next).setOnClickListener{ view.findNavController()
        .navigate(R.id.action_rulesfragment_to_gameFragment)

        }
    }
    }


