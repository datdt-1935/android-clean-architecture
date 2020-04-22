package com.sun.presentation

import android.app.Application
import com.androidnetworking.AndroidNetworking

class CleanApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AndroidNetworking.initialize(applicationContext)
    }
}