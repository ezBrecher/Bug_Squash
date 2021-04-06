package com.ebrecher.p2.ui.main

import android.app.Application
import androidx.lifecycle.ViewModel

class GameViewModel() : ViewModel() {
    var bug2: Boolean = false
    var score: Int = 0
    var currDiff: String = "Normal"
    var easy: Boolean = false
    var normal: Boolean = true
    var hard: Boolean = false
    var nightMode: Boolean = false
    var lightText: String = "Light Mode"
    var darkText: String = "Dark Mode"
}