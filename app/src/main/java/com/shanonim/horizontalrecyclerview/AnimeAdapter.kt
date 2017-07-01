package com.shanonim.horizontalrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by shinohara-hiromitsu on 2017/06/30.
 */

class AnimeAdapter(val items: List<Anime>, val itemClick: (Anime) -> Unit) :
        RecyclerView.Adapter<AnimeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return ViewHolder(view = view, itemClick = itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setUp(items[position])
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    class ViewHolder(view: View, val itemClick: (Anime) -> Unit) : RecyclerView.ViewHolder(view) {
        private val textAnime = view.findViewById(R.id.text_anime) as TextView
        private val textStatus = view.findViewById(R.id.text_status) as TextView

        fun setUp(item: Anime) {
            textAnime.text = item.name
            textStatus.text = item.status.toString()
            itemView.setOnClickListener { itemClick(item) }
        }
    }
}
