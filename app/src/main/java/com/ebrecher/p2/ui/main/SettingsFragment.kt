package com.ebrecher.p2.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.ebrecher.p2.R

class SettingsFragment : Fragment() {

    private lateinit var backButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        backButton = view.findViewById(R.id.backButton)

        backButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_settingsFragment_to_welcomeFragment)
        }

        return view
    }

    companion object {
        fun newInstance() = SettingsFragment()
    }
}