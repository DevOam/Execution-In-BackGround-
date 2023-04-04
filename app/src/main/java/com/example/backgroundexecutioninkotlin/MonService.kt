package com.example.backgroundexecutioninkotlin

import android.app.Service
import android.app.Service.START_STICKY
import android.content.Intent
import android.os.IBinder
import android.util.Log
import java.util.*

class MonService : Service() {
    private var count = 0
    private lateinit var timer: Timer

    override fun onCreate() {
        super.onCreate()
        timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                count++
                Log.d("MyService", "Counter is now $count")
            }
        }, 0, 1000)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.cancel()
        Log.d("MyService", "Service stopped")
    }
}
