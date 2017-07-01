package com.shanonim.horizontalrecyclerview

/**
 * Created by shinohara-hiromitsu on 2017/06/29.
 */
data class Anime(val name: String) {
    companion object {
        val list: List<Anime> = listOf(
                Anime(name = "アルドノア・ゼロ"),
                Anime(name = "ばらかもん"),
                Anime(name = "僕らはみんな河合荘"),
                Anime(name = "ノーゲーム・ノーライフ"),
                Anime(name = "たまこラブストーリー"),
                Anime(name = "selector infected WIXOSS"),
                Anime(name = "凪のあすから"),
                Anime(name = "ハーモニー"),
                Anime(name = "無彩限のファントム・ワールド"),
                Anime(name = "終わりのセラフ"),
                Anime(name = "放課後のプレアデス"),
                Anime(name = "天体のメソッド")
        )
    }
}
