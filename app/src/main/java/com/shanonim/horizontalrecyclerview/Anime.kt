package com.shanonim.horizontalrecyclerview

/**
 * Created by shinohara-hiromitsu on 2017/06/29.
 */
enum class Status {
    INTERESTED, LOVE;
}

data class Anime(val name: String, val status: Status) {
    companion object {
        val list: List<Anime> = listOf(
                Anime(name = "アルドノア・ゼロ", status = Status.LOVE),
                Anime(name = "ばらかもん", status = Status.LOVE),
                Anime(name = "僕らはみんな河合荘", status = Status.LOVE),
                Anime(name = "ノーゲーム・ノーライフ", status = Status.LOVE),
                Anime(name = "たまこラブストーリー", status = Status.LOVE),
                Anime(name = "selector infected WIXOSS", status = Status.LOVE),
                Anime(name = "凪のあすから", status = Status.LOVE),
                Anime(name = "ハーモニー", status = Status.LOVE),
                Anime(name = "無彩限のファントム・ワールド", status = Status.INTERESTED),
                Anime(name = "終わりのセラフ", status = Status.INTERESTED),
                Anime(name = "放課後のプレアデス", status = Status.INTERESTED),
                Anime(name = "天体のメソッド", status = Status.INTERESTED)
        )
    }
}
