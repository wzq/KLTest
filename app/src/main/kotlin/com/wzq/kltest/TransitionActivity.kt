package com.wzq.kltest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.transition.TransitionInflater
import com.pawegio.kandroid.find

/**
 * Created by wzq on 15/11/20.
 */
class TransitionActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_in)

        val transitionSlideBottom = TransitionInflater.from(this).inflateTransition(R.transition.slide_bottom)
        window.enterTransition = transitionSlideBottom

        setSupportActionBar(find<Toolbar>(R.id.toolbar))

    }
}