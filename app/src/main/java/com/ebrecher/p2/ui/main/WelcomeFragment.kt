package com.ebrecher.p2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.ebrecher.p2.R

class WelcomeFragment : Fragment() {
    private val viewModel: GameViewModel by activityViewModels()

    private lateinit var settingsButton: Button
    private lateinit var playButton: Button
    private lateinit var bugImage: ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.welcome_fragment, container, false)

        settingsButton = view.findViewById(R.id.settingsButton)
        playButton = view.findViewById(R.id.playButton)
        bugImage = view.findViewById(R.id.welcomeImageView)

        when(viewModel.bug2) {
            false -> bugImage.setImageResource(R.drawable.bug_image)
            true -> bugImage.setImageResource(R.drawable.bug2_image)
        }

        settingsButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeFragment_to_settingsFragment)
        }

        playButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_welcomeFragment_to_configFragment)
        }
        return view
    }
}