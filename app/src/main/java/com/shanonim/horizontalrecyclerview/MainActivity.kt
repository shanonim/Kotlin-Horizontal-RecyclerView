package com.shanonim.horizontalrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast

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
            Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
        }
        recyclerView?.adapter = adapter
    }
}
