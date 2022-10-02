package com.giniapps.ads_library.networking.protocols

import com.giniapps.ads_library.model.Ad

internal interface AdFetcher {
    val authenticator: Authenticator

    suspend fun fetch(): Result<Ad>
}