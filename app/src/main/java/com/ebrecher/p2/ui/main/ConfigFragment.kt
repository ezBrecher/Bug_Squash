package com.ebrecher.p2.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.ebrecher.p2.R

class ConfigFragment : Fragment() {

    companion object {
        fun newInstance() = ConfigFragment()
    }

    lateinit var configPlayButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_config, container, false)

        configPlayButton = view.findViewById(R.id.configPlayButton)

        configPlayButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_configFragment_to_gameFragment2)
        }

        return view
    }
}