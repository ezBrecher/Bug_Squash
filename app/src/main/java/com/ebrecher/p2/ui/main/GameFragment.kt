package com.ebrecher.p2.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.ebrecher.p2.R

class GameFragment : Fragment() {

    private val viewModel: GameViewModel by activityViewModels()

    private lateinit var gameOverButton: Button
    private lateinit var difficultyText: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.game_fragment, container, false)

        gameOverButton = view.findViewById(R.id.gameOverButton)
        difficultyText = view.findViewById(R.id.currentGameDifficulty)

        difficultyText.text = viewModel.currDiff

        gameOverButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_gameFragment2_to_resultFragment)
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}