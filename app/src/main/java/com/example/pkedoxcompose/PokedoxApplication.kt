package com.example.pkedoxcompose

import android.app.Application
import timber.log.Timber

class PokedoxApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}