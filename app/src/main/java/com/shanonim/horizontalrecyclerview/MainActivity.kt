package com.shanonim.horizontalrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val recyclerViewUpper: RecyclerView by lazy {
        findViewById(R.id.recycler_view_upper) as RecyclerView
    }
    private val recyclerViewLower: RecyclerView by lazy {
        findViewById(R.id.recycler_view_lower) as RecyclerView
    }
    private val layoutManagerUpper: RecyclerView.LayoutManager by lazy {
        LinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
    }
    private val layoutManagerLower: RecyclerView.LayoutManager by lazy {
        LinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }
    }
    private val animeAdapter = AnimeAdapter(Anime.list) {
        startActivity(DetailActivity.createIntent(this, it.name))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewUpper.apply {
            layoutManager = layoutManagerUpper
            adapter = animeAdapter
        }
        recyclerViewLower.apply {
            layoutManager = layoutManagerLower
            adapter = animeAdapter
        }
    }
}
