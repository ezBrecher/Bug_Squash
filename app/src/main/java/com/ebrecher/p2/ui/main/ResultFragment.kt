package com.ebrecher.p2.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.ebrecher.p2.R

class ResultFragment : Fragment() {

    private lateinit var backTitleButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        backTitleButton = view.findViewById(R.id.backToTitleButton)

        backTitleButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_resultFragment_to_welcomeFragment)
        }

        return view
    }

    companion object {
        fun newInstance() = ResultFragment()
    }
}