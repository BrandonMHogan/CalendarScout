package com.brandonhogan.calendarscout.features.splash

import com.brandonhogan.calendarscout.features.shared.base.BasePresenter
import com.brandonhogan.calendarscout.injection.schedulers.SchedulerProvider

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Presenter for the splash activity
 */

class SplashPresenter constructor(): BasePresenter(), SplashContract.Presenter {

    var view: SplashContract.View? = null
    var model: SplashViewModel? = null

    override fun attach(view: SplashContract.View, model: SplashViewModel) {
        this.view = view
        this.model = model
    }

    override fun detach() {
        this.view = null
    }

    /**
     * Called when the animation on the view completes
     */
    override fun onAnimationCompleted() {
        view?.goToMain()
    }
}