package com.brandonhogan.calendarscout.features.splash

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.brandonhogan.calendarscout.CalendarApp
import com.brandonhogan.calendarscout.R
import com.brandonhogan.calendarscout.features.main.MainActivity
import com.brandonhogan.calendarscout.features.shared.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import javax.inject.Inject

/**
 * @Creator         bhogan
 * @Date            2017-08-24
 * @Description     Displays a splash logo to the view while loading server information
 * on a background thread
 */

class SplashActivity: BaseActivity(), SplashContract.View {

    @Inject
    lateinit var presenter: SplashContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        (application as CalendarApp).appComponent.inject(this)

        val model = ViewModelProviders.of(this).get(SplashViewModel::class.java)
        presenter.attach(this, model)
    }

    /**
     * Will call startUpAnimation()
     */
    override fun onResume() {
        super.onResume()
        startUpAnimation()
    }

    /**
     * Animates the logo up to the center of the screen
     */
    private fun startUpAnimation() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.splash_in)
        anim.interpolator = AccelerateDecelerateInterpolator()

        anim.fillAfter = true
        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                presenter.onAnimationCompleted()
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })

        logo_icon.startAnimation(anim)
    }

    /**
     * Will load the main activity
     */
    override fun goToMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}