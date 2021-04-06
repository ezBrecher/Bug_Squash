package com.ebrecher.p2.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ebrecher.p2.R
import com.ebrecher.p2.databinding.FragmentSettingsBinding

class ConfigFragment : Fragment() {

    private val viewModel: GameViewModel by activityViewModels()

    private val difficulties = arrayOf("Easy", "Normal", "Hard")

    private lateinit var recycler: RecyclerView
    private lateinit var headerText: TextView

    lateinit var configPlayButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_config, container, false)

        configPlayButton = view.findViewById(R.id.configPlayButton)

        recycler = view.findViewById(R.id.configRecycler)
        recycler.layoutManager = LinearLayoutManager(context)
        recycler.adapter = configAdapter(difficulties)

        headerText = view.findViewById(R.id.configHeader)
        headerText.text = ""

        configPlayButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_configFragment_to_gameFragment2)
        }

        return view
    }

    private inner class configViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {
        private val textView: TextView = itemView.findViewById(R.id.diffTextView)
        private lateinit var curr: String

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            when (curr) {
                "Easy" -> {
                    headerText.setText(R.string.difficultyEasy)
                    viewModel.currDiff ="Easy"
                    viewModel.easy = true
                    viewModel.normal = false
                    viewModel.hard = false
                }
                "Normal" -> {
                    headerText.setText(R.string.difficultyNormal)
                    viewModel.currDiff ="Normal"
                    viewModel.easy = false
                    viewModel.normal = true
                    viewModel.hard = false
                }
                "Hard" -> {
                    headerText.setText(R.string.difficultyHard)
                    viewModel.currDiff = "Hard"
                    viewModel.easy = false
                    viewModel.normal = false
                    viewModel.hard = true
                }
            }
        }

        fun bind(string: String) {
            curr = string
            textView.text = string
        }
    }

    private inner class configAdapter(val list: Array<String>) : RecyclerView.Adapter<configViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): configViewHolder {
            val view = layoutInflater.inflate(R.layout.recycler_item, parent, false)
            return configViewHolder(view)
        }

        override fun onBindViewHolder(holder: configViewHolder, position: Int) {
            holder.bind(list[position])
        }

        override fun getItemCount(): Int = list.size
    }
}