package com.wzq.kltest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import com.pawegio.kandroid.find

/**
 * Created by wzq on 15/12/10.
 */
class CardsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val toolBar = find<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolBar)

        val recycler = find<RecyclerView>(R.id.recycler)
//        recycler.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CardsAdapter(fun() : List<Int>{
            var list = arrayListOf<Int>()
            list.add(R.drawable.avatar_1)
            list.add(R.drawable.avatar_2)
            list.add(R.drawable.avatar_3)
            list.add(R.drawable.avatar_4)
            list.add(R.drawable.avatar_5)
            list.add(R.drawable.avatar_6)
            list.add(R.drawable.avatar_7)
            list.add(R.drawable.avatar_8)
            list.add(R.drawable.avatar_9)
            list.add(R.drawable.avatar_10)
            list.add(R.drawable.avatar_11)
            list.add(R.drawable.avatar_12)

            return list
        }(), this);
    }
}