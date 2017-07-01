package com.shanonim.horizontalrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view) as RecyclerView
        layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager

        val adapter = AnimeAdapter(Anime.list) {
            startActivity(DetailActivity.createIntent(this, it.name))
        }
        recyclerView?.adapter = adapter
    }
}
