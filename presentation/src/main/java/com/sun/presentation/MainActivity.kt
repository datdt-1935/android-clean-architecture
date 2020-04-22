package com.sun.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sun.domain.TaskModel
import com.sun.platform.UseCase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val usecase = UseCase().taskModel
    }
}
