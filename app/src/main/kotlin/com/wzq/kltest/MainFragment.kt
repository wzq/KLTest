package com.wzq.kltest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pawegio.kandroid.find

/**
 * Created by wzq on 15/12/11.
 */
class MainFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater?.inflate(R.layout.content_cards, container, false)

        val recycler = root?.find<RecyclerView>(R.id.recycler)
        //        recycler.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recycler?.layoutManager = LinearLayoutManager(activity)
        recycler?.adapter = CardsAdapter(fun() : List<Int>{
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
        }(), activity);
        return root
    }
}