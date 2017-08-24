package com.brandonhogan.calendarscout.injection.modules

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.brandonhogan.calendarscout.CalendarApp
import com.brandonhogan.calendarscout.injection.schedulers.AppSchedulerProvider
import com.brandonhogan.calendarscout.injection.schedulers.SchedulerProvider
import com.brandonhogan.calendarscout.injection.scopes.AppScope
import com.brandonhogan.calendarscout.utils.RxBus
import dagger.Module
import dagger.Provides

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Contains all the base application injectables
 */

@Module
class AppModule(var app: CalendarApp) {

    @AppScope
    @Provides
    fun provideApp(): CalendarApp = app

    @AppScope
    @Provides
    fun provideContext(): Context = app.applicationContext

    @AppScope
    @Provides
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)

    @AppScope
    @Provides
    fun provideBus(): RxBus = RxBus()

    @AppScope
    @Provides
    fun providerAppSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()

}