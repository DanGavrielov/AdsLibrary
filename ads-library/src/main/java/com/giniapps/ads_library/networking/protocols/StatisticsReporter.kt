package com.giniapps.ads_library.networking.protocols

interface StatisticsReporter {
    suspend fun reportAdClicked(adId: Long): Result<Unit>
    suspend fun reportTimeViewed(adId: Long): Result<Unit>
}