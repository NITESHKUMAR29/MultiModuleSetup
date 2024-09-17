package com.example.notesmodulization

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.common_utils.Activities
import com.example.common_utils.Navigator
import com.example.notesmodulization.databinding.ActivityMainBinding
import com.example.notesmodulization.utility.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity() {


    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {

            CoroutineScope(Dispatchers.Main).launch {
                delay(2000)
                provider.getActivities(Activities.NewsActivity).navigate(this@MainActivity)
                finish()
            }


        }

    }
}