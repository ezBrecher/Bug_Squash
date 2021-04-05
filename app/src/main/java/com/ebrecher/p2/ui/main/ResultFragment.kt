package com.ebrecher.p2.ui.main

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

class ResultFragment : Fragment() {

    private val viewModel: GameViewModel by activityViewModels()

    private lateinit var backTitleButton: Button
    private lateinit var scoreTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        backTitleButton = view.findViewById(R.id.backToTitleButton)
        scoreTextView = view.findViewById(R.id.resultsScoreTextView)

        scoreTextView.text = viewModel.score.toString()

        backTitleButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_resultFragment_to_welcomeFragment)
        }

        return view
    }

    companion object {
        fun newInstance() = ResultFragment()
    }
}