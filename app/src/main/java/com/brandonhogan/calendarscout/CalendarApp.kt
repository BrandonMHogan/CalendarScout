package com.brandonhogan.calendarscout

import android.app.Application
import com.brandonhogan.calendarscout.injection.components.AppComponent
import com.brandonhogan.calendarscout.injection.components.DaggerAppComponent
import com.brandonhogan.calendarscout.injection.modules.AppModule
import com.squareup.leakcanary.LeakCanary
import timber.log.Timber

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Main application class
 */

class CalendarApp : Application() {

    // The main component
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        // Leak Canary
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)

        // DI
        initGlobalComponents()

        Timber.plant(Timber.DebugTree())
    }

    /**
     * Initializes the application level component
     */
    private fun initGlobalComponents() {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}