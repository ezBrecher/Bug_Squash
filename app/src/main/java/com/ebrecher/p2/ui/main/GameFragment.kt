package com.ebrecher.p2.ui.main

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
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

    private val bugLoopHandler = Handler(Looper.getMainLooper())
    private var delay: Long = 2000
    private var clicked: Boolean = true
    private var gameOver: Boolean = false

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

        gameHeader.text = "Bug Squash! (" + viewModel.currDiff + ")"
        difficultyText.text = "score " + viewModel.score

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

                val animator1 = ObjectAnimator.ofFloat(imButton1, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton1, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton1.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton2.setOnClickListener {
            if (hasBug2) {
                viewModel.score++
                clicked = true
                hasBug2 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton2, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton2, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton2.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton3.setOnClickListener {
            if (hasBug3) {
                viewModel.score++
                clicked = true
                hasBug3 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton3, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton3, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton3.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton4.setOnClickListener {
            if (hasBug4) {
                viewModel.score++
                clicked = true
                hasBug4 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton4, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton4, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton4.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton5.setOnClickListener {
            if (hasBug5) {
                viewModel.score++
                clicked = true
                hasBug5 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton5, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton5, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton5.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton6.setOnClickListener {
            if (hasBug6) {
                viewModel.score++
                clicked = true
                hasBug6 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton6, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton6, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton6.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton7.setOnClickListener {
            if (hasBug7) {
                viewModel.score++
                clicked = true
                hasBug7 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton7, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton7, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton7.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton8.setOnClickListener {
            if (hasBug8) {
                viewModel.score++
                clicked = true
                hasBug8 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton8, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton8, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton8.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton9.setOnClickListener {
            if (hasBug9) {
                viewModel.score++
                clicked = true
                hasBug9 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton9, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton9, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton9.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton10.setOnClickListener {
            if (hasBug10) {
                viewModel.score++
                clicked = true
                hasBug10 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton10, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton10, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton10.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton11.setOnClickListener {
            if (hasBug11) {
                viewModel.score++
                clicked = true
                hasBug11 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton11, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton11, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton11.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        imButton12.setOnClickListener {
            if (hasBug12) {
                viewModel.score++
                clicked = true
                hasBug12 = false
                difficultyText.text = "score " + viewModel.score

                val animator1 = ObjectAnimator.ofFloat(imButton12, "scaleX",  0f)
                val animator2 = ObjectAnimator.ofFloat(imButton12, "scaleX", 1f)

                animator1.addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}
                    override fun onAnimationCancel(animation: Animator?) {}
                    override fun onAnimationRepeat(animation: Animator?) {}
                    override fun onAnimationEnd(animation: Animator?) {
                        imButton12.setImageResource(R.drawable.cpu_image)
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
                set.duration = 100L
                set.start()
            }
        }

        bugLoopHandler.post(object : Runnable {
                override fun run() {
                        val rnd = (0..11).random()
                        when (rnd) {
                            0 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton1, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton1, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton1.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug1 = true
                            }
                            1 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton2, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton2, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton2.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug2 = true
                            }
                            2 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton3, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton3, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton3.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug3 = true
                            }
                            3 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton4, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton4, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton4.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug4 = true
                            }
                            4 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton5, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton5, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton5.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug5 = true
                            }
                            5 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton6, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton6, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton6.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug6 = true
                            }
                            6 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton7, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton7, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton7.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug7 = true
                            }
                            7 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton8, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton8, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton8.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug8 = true
                            }
                            8 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton9, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton9, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton9.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug9 = true
                            }
                            9 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton10, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton10, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton10.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug10 = true
                            }
                            10 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton11, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton11, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton11.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug11 = true
                            }
                            11 -> {
                                val animator1 = ObjectAnimator.ofFloat(imButton12, "scaleX",  0f)
                                val animator2 = ObjectAnimator.ofFloat(imButton12, "scaleX", 1f)

                                animator1.addListener(object : Animator.AnimatorListener {
                                    override fun onAnimationStart(animation: Animator?) {}
                                    override fun onAnimationCancel(animation: Animator?) {}
                                    override fun onAnimationRepeat(animation: Animator?) {}
                                    override fun onAnimationEnd(animation: Animator?) {
                                        imButton12.setImageResource(R.drawable.bug_image)
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
                                set.duration = 50L
                                set.start()
                                hasBug12 = true
                            }
                        }
                    if(clicked) {
                        bugLoopHandler.postDelayed(this, delay)
                        clicked = false
                    } else if (!gameOver){
                        view.findNavController().navigate(R.id.action_gameFragment2_to_resultFragment)
                    }
                }
            })

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}