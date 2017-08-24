package com.brandonhogan.calendarscout.features.main

import com.brandonhogan.calendarscout.features.shared.base.BasePresenter
import javax.inject.Inject

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Presenter for the main activity
 */

class MainPresenter @Inject constructor(): BasePresenter(), MainContract.Presenter {

    var view: MainContract.View? = null
    var model: MainViewModel? = null

    override fun attach(view: MainContract.View, model: MainViewModel) {

        this.view = view
        this.model = model
    }

    override fun detach() {
        this.view = null
    }
}