package com.brandonhogan.calendarscout.injection.modules

import com.brandonhogan.calendarscout.features.main.MainContract
import com.brandonhogan.calendarscout.features.main.MainPresenter
import com.brandonhogan.calendarscout.features.splash.SplashContract
import com.brandonhogan.calendarscout.features.splash.SplashPresenter
import com.brandonhogan.calendarscout.injection.scopes.AppScope
import dagger.Module
import dagger.Provides

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Module used for presenter injections into activities and fragments
 */

@Module
class PresenterModule {

    @AppScope
    @Provides
    fun getSplashPresenter(): SplashContract.Presenter {
        return SplashPresenter()
    }

    @AppScope
    @Provides
    fun getMainPresenter(): MainContract.Presenter {
        return MainPresenter()
    }
}