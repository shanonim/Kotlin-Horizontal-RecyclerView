package com.shanonim.horizontalrecyclerview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by shinohara-hiromitsu on 2017/07/01.
 */
class DetailActivity : AppCompatActivity() {

    companion object {

        fun createIntent(context: Context, itemName: String) = Intent(context, DetailActivity::class.java).apply {
            putExtra("itemName", itemName)
        }

    }

    private val textView by lazy {
        findViewById(R.id.text_view) as TextView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        title = "DetailActivity"
        textView.text = intent.getStringExtra("itemName")
    }
}