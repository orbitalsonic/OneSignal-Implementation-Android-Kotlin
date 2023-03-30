package com.orbitalsonic.onesignal

import android.app.Application
import com.onesignal.OneSignal

class MainApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(getString(R.string.one_signal_key))

        // Use in MainActivity
        // promptForPushNotifications will show the native Android notification permission prompt.
        OneSignal.promptForPushNotifications()
    }
}