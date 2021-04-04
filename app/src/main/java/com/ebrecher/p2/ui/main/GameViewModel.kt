package com.ebrecher.p2.ui.main

import android.app.Application
import androidx.lifecycle.ViewModel

class GameViewModel() : ViewModel() {

    var nightMode: Boolean = false
    var lightText: String = "Light Mode"
    var darkText: String = "Dark Mode"

}