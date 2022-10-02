package com.giniapps.ads_library.networking.protocols

internal interface Authenticator {
    /**
     * Authenticate user by api key.
     * <i>An ad fetching component must call this method before every request.</i>
     *
     * @param apiKey The api key received from the management interface.
     *
     * @return a result object containing authentication success an
     * an error message if authentication failed.
     * (@see [Result], in this case we pass Unit as the generic because we don't care about any return value)
     */
    suspend fun authenticate(apiKey: String): Result<Unit>
}