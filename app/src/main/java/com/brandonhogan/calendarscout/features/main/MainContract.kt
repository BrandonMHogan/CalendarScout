package com.brandonhogan.calendarscout.features.main

import com.brandonhogan.calendarscout.features.shared.base.BaseContract

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Contract between the landing activity and its presenter
 */

interface MainContract {
    interface View {
    }

    interface Presenter: BaseContract.Presenter<View, MainViewModel> {

    }
}