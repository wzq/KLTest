package com.wzq.kltest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils

/**
 * Created by wzq on 15/12/10.
 */
class CardsAdapter(data: List<Int>, context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val data = data

    var lastPosition = -1


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {

    }

    override fun getItemCount(): Int {
        return data.size
    }     

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder? {

        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_cards, parent, false));
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder?) {
        super.onViewDetachedFromWindow(holder)
        holder?.itemView?.clearAnimation()
    }

    override fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder?) {
        super.onViewAttachedToWindow(holder)
        holder?.itemView!!.clearAnimation()
        if (holder?.layoutPosition!! > lastPosition) {
            println(1)
            val animBottom = AnimationUtils.loadAnimation(holder?.itemView!!.context, R.anim.bottom_in)
            holder?.itemView!!.startAnimation(animBottom)

        } else if (holder?.layoutPosition!! < lastPosition) {
            println(2)
            val animLeft = AnimationUtils.loadAnimation(holder?.itemView!!.context, R.anim.top_in)
            holder?.itemView!!.startAnimation(animLeft)
        }
        lastPosition = holder?.layoutPosition ?: -1
    }


}