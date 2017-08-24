package com.brandonhogan.calendarscout.injection.schedulers

import io.reactivex.Scheduler

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Interface used for passing the scheduler into presenters and managers
 */

interface SchedulerProvider {
    fun ui(): Scheduler
    fun computation(): Scheduler
    fun trampoline(): Scheduler
    fun newThread(): Scheduler
    fun io(): Scheduler
}