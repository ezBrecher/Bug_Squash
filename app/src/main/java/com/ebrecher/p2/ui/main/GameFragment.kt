package com.ebrecher.p2.ui.main

import android.os.Bundle
import android.os.Handler
import android.os.Looper
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
    private lateinit var imButton4: ImageButton
    private lateinit var imButton5: ImageButton
    private lateinit var imButton6: ImageButton
    private lateinit var imButton7: ImageButton
    private lateinit var imButton8: ImageButton
    private lateinit var imButton9: ImageButton
    private lateinit var imButton10: ImageButton
    private lateinit var imButton11: ImageButton
    private lateinit var imButton12: ImageButton

    val mainHandler = Handler(Looper.getMainLooper())



    var delay: Long = 2000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.game_fragment, container, false)

        if (viewModel.easy) delay = 3000
        if (viewModel.normal) delay = 2000
        if (viewModel.hard) delay = 1000

        gameOverButton = view.findViewById(R.id.gameOverButton)
        gameHeader = view.findViewById(R.id.gameHeader)
        difficultyText = view.findViewById(R.id.currentGameDifficulty)

        imButton1 = view.findViewById(R.id.imageButton1)
        imButton2 = view.findViewById(R.id.imageButton2)
        imButton3 = view.findViewById(R.id.imageButton3)
        imButton4 = view.findViewById(R.id.imageButton4)
        imButton5 = view.findViewById(R.id.imageButton5)
        imButton6 = view.findViewById(R.id.imageButton6)
        imButton7 = view.findViewById(R.id.imageButton7)
        imButton8 = view.findViewById(R.id.imageButton8)
        imButton9 = view.findViewById(R.id.imageButton9)
        imButton10 = view.findViewById(R.id.imageButton10)
        imButton11= view.findViewById(R.id.imageButton11)
        imButton12 = view.findViewById(R.id.imageButton12)

        mainHandler.post(object : Runnable {
            override fun run() {
                val rnds = (0..12).random()
                when(rnds) {
                    0 -> imButton1.setImageResource(R.drawable.bug_image)
                    1 -> imButton2.setImageResource(R.drawable.bug_image)
                    2 -> imButton3.setImageResource(R.drawable.bug_image)
                    3 -> imButton4.setImageResource(R.drawable.bug_image)
                    4 -> imButton5.setImageResource(R.drawable.bug_image)
                    5 -> imButton6.setImageResource(R.drawable.bug_image)
                    6 -> imButton7.setImageResource(R.drawable.bug_image)
                    7 -> imButton8.setImageResource(R.drawable.bug_image)
                    8 -> imButton9.setImageResource(R.drawable.bug_image)
                    9 -> imButton10.setImageResource(R.drawable.bug_image)
                    10 -> imButton11.setImageResource(R.drawable.bug_image)
                    11 -> imButton12.setImageResource(R.drawable.bug_image)
                }
                mainHandler.postDelayed(this, delay)
            }
        })
        /*
        Handler().postDelayed({
            val rnds = (0..12).random()
            when(rnds) {
                0 -> imButton1.setImageResource(R.drawable.bug_image)
                1 -> imButton2.setImageResource(R.drawable.bug_image)
                2 -> imButton3.setImageResource(R.drawable.bug_image)
                3 -> imButton4.setImageResource(R.drawable.bug_image)
                4 -> imButton5.setImageResource(R.drawable.bug_image)
                5 -> imButton6.setImageResource(R.drawable.bug_image)
                6 -> imButton7.setImageResource(R.drawable.bug_image)
                7 -> imButton8.setImageResource(R.drawable.bug_image)
                8 -> imButton9.setImageResource(R.drawable.bug_image)
                9 -> imButton10.setImageResource(R.drawable.bug_image)
                10 -> imButton11.setImageResource(R.drawable.bug_image)
                11 -> imButton12.setImageResource(R.drawable.bug_image)
            }
        }, delay)
        */
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