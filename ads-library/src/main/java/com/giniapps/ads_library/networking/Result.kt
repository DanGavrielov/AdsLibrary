package com.giniapps.ads_library.networking

import com.giniapps.ads_library.networking.protocols.Authenticator

/**
 * A generic response wrapper object used for resource handling.
 * Please keep in mind that this object will not always have all fields, and can be used when
 * checking if something exists or not (@see [Authenticator] for an example for Result<Unit>)
 */
internal data class Result<T>(
    val data: T?,
    val isSuccessful: Boolean,
    val error: String?
)