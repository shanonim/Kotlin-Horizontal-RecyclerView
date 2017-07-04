package com.shanonim.horizontalrecyclerview

/**
 * Created by shinohara-hiromitsu on 2017/06/29.
 */
data class Anime(val name: String, val productCode: String) {
    companion object {
        val list: List<Anime> = listOf(
                Anime(name = "アルドノア・ゼロ", productCode = "B00LUIX3W8"),
                Anime(name = "ばらかもん", productCode = "B00LHDHSG8"),
                Anime(name = "僕らはみんな河合荘", productCode = "B01G893Q0W"),
                Anime(name = "ノーゲーム・ノーライフ", productCode = "4040664329"),
                Anime(name = "たまこラブストーリー", productCode = "B00K7VQW8Q"),
                Anime(name = "selector infected WIXOSS", productCode = "B01HB8XKR8"),
                Anime(name = "凪のあすから", productCode = "B00FB56UA8"),
                Anime(name = "ハーモニー", productCode = "B019SPBCK4")
        )
    }
}
