package com.wzq.kltest

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import kotlin.properties.Delegates

/**
 * Created by wzq on 15/11/5.
 */
class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var drawer : DrawerLayout by Delegates.notNull() //设置一个非空代理,如写之前读则抛一个异常
    //import kotlinx.android.synthetic.content_main.t1 自动映射

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener {
//            val transitionActivity = ActivityOptionsCompat.makeSceneTransitionAnimation(this@MainActivity)
//            startActivity(IntentFor<TransitionActivity>(this@MainActivity), transitionActivity.toBundle())
           // startActivity(IntentFor<CardsActivity>(this@MainActivity))
            supportFragmentManager.beginTransaction().replace(R.id.main_container, MainFragment()).commit()
        }

        drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.app_name, R.string.app_name)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView  = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem?): Boolean {
        drawer.closeDrawer(GravityCompat.START)
        return true
    }



}