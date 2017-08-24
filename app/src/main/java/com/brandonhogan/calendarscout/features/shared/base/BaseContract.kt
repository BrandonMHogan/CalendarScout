package com.brandonhogan.calendarscout.features.shared.base

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Base contract in which all contracts inherit from. Generic type
 *  is implied on the child contract
 */

interface BaseContract {

    interface Presenter<T, M> {
        fun attach(view: T, model: M)
        fun detach()
    }
}