package com.ebrecher.p2.ui.main

import android.app.Application
import androidx.lifecycle.ViewModel

class GameViewModel() : ViewModel() {

    var currDiff: String = "Normal"
    var easy: Boolean = false
    var normal: Boolean = true
    var hard: Boolean = false
    var nightMode: Boolean = false
    var lightText: String = "Light Mode"
    var darkText: String = "Dark Mode"

}