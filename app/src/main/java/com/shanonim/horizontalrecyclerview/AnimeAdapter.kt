package com.shanonim.horizontalrecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class AnimeAdapter(val items: List<Anime>, val itemClick: (Anime) -> Unit) :
        RecyclerView.Adapter<AnimeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return ViewHolder(view = view, itemClick = itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setUp(items[position])
        holder.button.setOnClickListener {
            Toast.makeText(holder.itemView.context, "tapped OK", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    class ViewHolder(view: View, val itemClick: (Anime) -> Unit) : RecyclerView.ViewHolder(view) {
        val textAnime = view.findViewById(R.id.text_anime) as TextView
        val imageAnime = view.findViewById(R.id.image_thumbnail) as ImageView
        val button: Button = view.findViewById(R.id.button_ok) as Button

        fun setUp(item: Anime) {
            textAnime.text = item.name
            Picasso.with(itemView.context).load(createUrl(item.productCode)).into(imageAnime)
            itemView.setOnClickListener { itemClick(item) }
        }

        fun createUrl(productCode: String) = "http://images-jp.amazon.com/images/P/$productCode.09.LZZZZZZZ.jpg"
    }
}
