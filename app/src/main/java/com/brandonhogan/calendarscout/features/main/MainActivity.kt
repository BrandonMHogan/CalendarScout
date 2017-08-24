package com.brandonhogan.calendarscout.features.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Build
import android.os.Bundle
import com.brandonhogan.calendarscout.CalendarApp
import com.brandonhogan.calendarscout.R
import com.brandonhogan.calendarscout.features.shared.base.BaseActivity
import javax.inject.Inject

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Main activity used to display the base calendar
 */

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as CalendarApp).appComponent.inject(this)

        val model = ViewModelProviders.of(this).get(MainViewModel::class.java)
        presenter.attach(this, model)


        // Sets the status bar color for post LOLLIPOP versions
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //@Suppress("DEPRECATION")
            //window.statusBarColor = resources.getColor(R.color.colorPrimaryDark)
        }
    }

    override fun onDestroy() {
        presenter.detach()
        super.onDestroy()
    }
}