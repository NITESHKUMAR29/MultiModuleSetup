package com.example.notesmodulization.utility

import androidx.appcompat.app.AppCompatActivity
import com.example.common_utils.Navigator
import javax.inject.Inject

open class BaseActivity:AppCompatActivity() {
    @Inject
    lateinit var provider: Navigator.Provider
}