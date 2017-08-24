package com.brandonhogan.calendarscout.utils

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     A bus built from a subject, which can be used for quickly sharing events
 */

class RxBus {
    private val bus = PublishSubject.create<Any>()

    fun send(o: Any) {
        bus.onNext(o)
    }

    fun toObservable(): Observable<Any> {
        return bus
    }

    fun hasObservers(): Boolean {
        return bus.hasObservers()
    }
}