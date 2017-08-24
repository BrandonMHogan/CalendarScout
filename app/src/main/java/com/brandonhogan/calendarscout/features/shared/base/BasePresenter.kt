package com.brandonhogan.calendarscout.features.shared.base

import io.reactivex.disposables.Disposable
import timber.log.Timber

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Base presenter in which all presenters inherit from. Handles disposable
 *  management and any generic presenter logic
 */

open class BasePresenter {

    val disposables = ArrayList<Disposable>()

    /**
     * Will loop through and dispose of any subscribes still in use
     *  Should be called from the presenter's onDestroyView
     */
    fun onDestroy() {
        for(disposable in disposables) {
            disposable.dispose()
            Timber.d("Subscribe was disposed ${disposable.isDisposed}")
        }
    }

}