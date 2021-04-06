package com.ebrecher.p2.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.ebrecher.p2.R
import com.ebrecher.p2.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: GameViewModel by activityViewModels()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings, container, false)
        binding.run {
            vm = viewModel
            lifecycleOwner = this@SettingsFragment
        }

        binding.backButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_settingsFragment_to_welcomeFragment)
        }

        binding.bugSwitch.isChecked = viewModel.bug2

        binding.bugSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                viewModel.bug2 = true
            } else {
                viewModel.bug2 = false
            }
        }

        if (viewModel.nightMode) {
            binding.darkRadioButton.isChecked = true
            binding.lightRadioButton.isChecked = false
        } else {
            binding.darkRadioButton.isChecked = false
            binding.lightRadioButton.isChecked = true
        }

        binding.themeRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.lightRadioButton -> {
                    //n.b. when researching functions to switch the theme of the app with an in app interactions, the best one I found was a Java function which Android Studio auto-corrected to the following:
                    (activity as AppCompatActivity?)!!.delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
                    viewModel.nightMode = false
                    Log.d("TAG", viewModel.nightMode.toString())
                }
                R.id.darkRadioButton -> {
                    (activity as AppCompatActivity?)!!.delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
                    viewModel.nightMode = true
                    Log.d("TAG", viewModel.nightMode.toString())
                }
            }
            Log.d("TAG", checkedId.toString())
        }
        return binding.root
    }
}