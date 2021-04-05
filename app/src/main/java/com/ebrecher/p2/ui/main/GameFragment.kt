package com.ebrecher.p2.ui.main

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.LinearInterpolator
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

    private val bugLoopHandler = Handler(Looper.getMainLooper())
    private var delay: Long = 2000
    private var clicked: Boolean = true
    private var gameOver: Boolean = false
    private var wait = true

    val animator = ValueAnimator.ofFloat(0f, 1f)

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

    private var hasBug1: Boolean = false
    private var hasBug2: Boolean = false
    private var hasBug3: Boolean = false
    private var hasBug4: Boolean = false
    private var hasBug5: Boolean = false
    private var hasBug6: Boolean = false
    private var hasBug7: Boolean = false
    private var hasBug8: Boolean = false
    private var hasBug9: Boolean = false
    private var hasBug10: Boolean = false
    private var hasBug11: Boolean = false
    private var hasBug12: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.game_fragment, container, false)

        wait = true
        clicked = true

        if (viewModel.easy) delay = 3000
        if (viewModel.normal) delay = 2000
        if (viewModel.hard) delay = 1000

        viewModel.score = 0

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

        difficultyText.text = viewModel.score.toString()

        // first simple animation that fades all the cards in on a delay before the game begins
        animator.addUpdateListener {
            imButton1.alpha = it.animatedValue as Float
            imButton2.alpha = it.animatedValue as Float
            imButton3.alpha = it.animatedValue as Float
            imButton4.alpha = it.animatedValue as Float
            imButton5.alpha = it.animatedValue as Float
            imButton6.alpha = it.animatedValue as Float
            imButton7.alpha = it.animatedValue as Float
            imButton8.alpha = it.animatedValue as Float
            imButton9.alpha = it.animatedValue as Float
            imButton10.alpha = it.animatedValue as Float
            imButton11.alpha = it.animatedValue as Float
            imButton12.alpha = it.animatedValue as Float
        }
        animator.interpolator = LinearInterpolator()
        animator.duration = 2000
        animator.start()

        gameOverButton.setOnClickListener {
            gameOver = true
            clicked = false
            view.findNavController().navigate(R.id.action_gameFragment2_to_resultFragment)
        }

        imButton1.setOnClickListener {
            if (hasBug1) {
                viewModel.score++
                clicked = true
                hasBug1 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton1, hasBug1, 100L)
            }
        }

        imButton2.setOnClickListener {
            if (hasBug2) {
                viewModel.score++
                clicked = true
                hasBug2 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton2, hasBug2, 100L)
            }
        }

        imButton3.setOnClickListener {
            if (hasBug3) {
                viewModel.score++
                clicked = true
                hasBug3 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton3, hasBug3, 100L)
            }
        }

        imButton4.setOnClickListener {
            if (hasBug4) {
                viewModel.score++
                clicked = true
                hasBug4 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton4, hasBug4, 100L)
            }
        }

        imButton5.setOnClickListener {
            if (hasBug5) {
                viewModel.score++
                clicked = true
                hasBug5 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton5, hasBug5, 100L)
            }
        }

        imButton6.setOnClickListener {
            if (hasBug6) {
                viewModel.score++
                clicked = true
                hasBug6 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton6, hasBug6, 100L)
            }
        }

        imButton7.setOnClickListener {
            if (hasBug7) {
                viewModel.score++
                clicked = true
                hasBug7 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton7, hasBug7, 100L)
            }
        }

        imButton8.setOnClickListener {
            if (hasBug8) {
                viewModel.score++
                clicked = true
                hasBug8 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton8, hasBug8, 100L)
            }
        }

        imButton9.setOnClickListener {
            if (hasBug9) {
                viewModel.score++
                clicked = true
                hasBug9 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton9, hasBug9, 100L)
            }
        }

        imButton10.setOnClickListener {
            if (hasBug10) {
                viewModel.score++
                clicked = true
                hasBug10 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton10, hasBug10, 100L)
            }
        }

        imButton11.setOnClickListener {
            if (hasBug11) {
                viewModel.score++
                clicked = true
                hasBug11 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton11, hasBug11, 100L)
            }
        }

        imButton12.setOnClickListener {
            if (hasBug12) {
                viewModel.score++
                clicked = true
                hasBug12 = false
                difficultyText.text = "score " + viewModel.score
                flipCard(imButton12, hasBug12, 100L)
            }
        }

        bugLoopHandler.post(object : Runnable {
                override fun run() {
                    if (!wait) {
                        val rnd = (0..11).random()
                        val rnd2 = (0..11).random()
                        when (rnd) {
                            0 -> {
                                hasBug1 = true
                                flipCard(imButton1, hasBug1, 50L)
                            }
                            1 -> {
                                hasBug2 = true
                                flipCard(imButton2, hasBug2, 50L)
                            }
                            2 -> {
                                hasBug3 = true
                                flipCard(imButton3, hasBug3, 50L)
                            }
                            3 -> {
                                hasBug4 = true
                                flipCard(imButton4, hasBug4, 50L)
                            }
                            4 -> {
                                hasBug5 = true
                                flipCard(imButton5, hasBug5, 50L)
                            }
                            5 -> {
                                hasBug6 = true
                                flipCard(imButton6, hasBug6, 50L)
                            }
                            6 -> {
                                hasBug7 = true
                                flipCard(imButton7, hasBug7, 50L)
                            }
                            7 -> {
                                hasBug8 = true
                                flipCard(imButton8, hasBug8, 50L)
                            }
                            8 -> {
                                hasBug9 = true
                                flipCard(imButton9, hasBug9, 50L)
                            }
                            9 -> {
                                hasBug10 = true
                                flipCard(imButton10, hasBug10, 50L)
                            }
                            10 -> {
                                hasBug11 = true
                                flipCard(imButton11, hasBug11, 50L)
                            }
                            11 -> {
                                hasBug12 = true
                                flipCard(imButton12, hasBug12, 50L)
                            }
                        }
                        when (rnd2) {
                            0 -> turnCard(imButton1)
                            1 -> turnCard(imButton2)
                            2 -> turnCard(imButton3)
                            3 -> turnCard(imButton4)
                            4 -> turnCard(imButton5)
                            5 -> turnCard(imButton6)
                            6 -> turnCard(imButton7)
                            7 -> turnCard(imButton8)
                            8 -> turnCard(imButton1)
                            9 -> turnCard(imButton10)
                            10 -> turnCard(imButton11)
                            11 -> turnCard(imButton12)
                        }
                    }
                    if (clicked) {
                        if (!wait) {
                            clicked = false
                        } else {
                            wait = false
                        }
                        bugLoopHandler.postDelayed(this, delay)
                    } else if (!gameOver) {
                        view.findNavController().navigate(R.id.action_gameFragment2_to_resultFragment)
                    }
                }
            })

        return view
    }

    // second simple animation that randomly turns cards
    private fun turnCard(card: ImageButton) {
        val rnd = (0..1).random()
        val rnd2 = (200.. 2000).random()
        var animator = ObjectAnimator.ofFloat(card, "rotation", 0f, -90f).setDuration(75L)
        when(rnd) {
            0 -> animator = ObjectAnimator.ofFloat(card, "rotation", 0f, 90f).setDuration(75L)
            1 -> animator = ObjectAnimator.ofFloat(card, "rotation", 0f, -90f).setDuration(75L)
        }
        animator.setStartDelay(rnd2.toLong())
        animator.start()
    }

    private fun flipCard(card: ImageButton, bug: Boolean, dur: Long) {
        val rnd = (0..1).random()
        // first animation set, flips card horizontally
        when(rnd) {
            0 -> {
                val animator1 = ObjectAnimator.ofFloat(card, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(card, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        if (bug) {
                            if (viewModel.bug2) {
                                card.setImageResource(R.drawable.bug2_image)
                            } else {
                                card.setImageResource(R.drawable.bug_image)
                            }
                        } else {
                            card.setImageResource(R.drawable.cpu_image)
                        }
                    }
                })
                animator2.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {}
                })
                val set = AnimatorSet()
                set.play(animator1).before(animator2)
                set.duration = dur
                set.start()
            }
            // second animation set, flips card vertically
            1 -> {
                val animator1 = ObjectAnimator.ofFloat(card, "scaleY",  0f)
                val animator2 = ObjectAnimator.ofFloat(card, "scaleY", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        if (bug) {
                            if (viewModel.bug2) {
                                card.setImageResource(R.drawable.bug2_image)
                            } else {
                                card.setImageResource(R.drawable.bug_image)
                            }
                        } else {
                            card.setImageResource(R.drawable.cpu_image)
                        }
                    }
                })
                animator2.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {}
                })
                val set = AnimatorSet()
                set.play(animator1).before(animator2)
                set.duration = dur
                set.start()
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}