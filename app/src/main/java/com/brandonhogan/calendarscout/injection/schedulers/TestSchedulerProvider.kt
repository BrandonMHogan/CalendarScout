package com.brandonhogan.calendarscout.injection.schedulers

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Scheduler for tests, which will run everything in the same thread its called in.
 * This makes it possible to test observable return functions that have observed on logic
 */

class TestSchedulerProvider : SchedulerProvider {
    override fun ui(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun computation(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun trampoline(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun newThread(): Scheduler {
        return Schedulers.trampoline()
    }

    override fun io(): Scheduler {
        return Schedulers.trampoline()
    }
}