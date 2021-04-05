package com.ebrecher.p2.ui.main

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.ebrecher.p2.R
import java.util.*
import kotlin.concurrent.timerTask

class GameFragment : Fragment() {

    private val viewModel: GameViewModel by activityViewModels()

    private lateinit var gameOverButton: Button
    private lateinit var gameHeader: TextView
    private lateinit var difficultyText: TextView

    private lateinit var imButton1: ImageButton
    private lateinit var imButton2: ImageButton
    private lateinit var imButton3: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.game_fragment, container, false)

        gameOverButton = view.findViewById(R.id.gameOverButton)
        gameHeader = view.findViewById(R.id.gameHeader)
        difficultyText = view.findViewById(R.id.currentGameDifficulty)

        imButton1 = view.findViewById(R.id.imageButton1)
        imButton2 = view.findViewById(R.id.imageButton2)
        imButton3 = view.findViewById(R.id.imageButton3)

        Handler().postDelayed({
            imButton1.setImageResource(R.drawable.bug_image)
        }, 2000)

        gameHeader.text = "Bug Squash! (" + viewModel.currDiff + ")"
        difficultyText.text = "score " + viewModel.score

        gameOverButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_gameFragment2_to_resultFragment)
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}