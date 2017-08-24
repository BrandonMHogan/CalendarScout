package com.brandonhogan.calendarscout.features.splash

import com.brandonhogan.calendarscout.features.shared.base.BaseContract

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Contract between the splash activity and presenter
 */

interface SplashContract {

    interface View {
        fun goToMain()
    }

    interface Presenter: BaseContract.Presenter<View, SplashViewModel> {
        fun onAnimationCompleted()
    }
}