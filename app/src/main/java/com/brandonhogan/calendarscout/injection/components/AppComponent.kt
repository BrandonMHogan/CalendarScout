package com.brandonhogan.calendarscout.injection.components

import com.brandonhogan.calendarscout.features.main.MainActivity
import com.brandonhogan.calendarscout.features.splash.SplashActivity
import com.brandonhogan.calendarscout.injection.modules.AppModule
import com.brandonhogan.calendarscout.injection.modules.PresenterModule
import com.brandonhogan.calendarscout.injection.scopes.AppScope
import dagger.Component

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Component that injects the main application modules
 */


@AppScope
@Component(modules = arrayOf(AppModule::class, PresenterModule::class))
interface AppComponent {

    fun inject(splashActivity: SplashActivity)
    fun inject(mainActivity: MainActivity)

}