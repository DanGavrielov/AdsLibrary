package com.giniapps.ads_library.model

internal data class Ad(
    val id: Long,
    val adType: AdType,
    val mediaType: MediaType,
    val contentUrl: String
)

enum class AdType {
    Banner, Interstitial
}

enum class MediaType {
    Image, PlainText, HTML, Video
}