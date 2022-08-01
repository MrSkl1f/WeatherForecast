package com.weatherforecast.api.models

class Location(
	val name: String? = null,
	val region: String? = null,
	val country: String? = null,
	val lat: Int? = null,
	val lon: Int? = null,
	val tzId: String? = null,
	val localtimeEpoch: Long? = null,
	val localtime: String? = null
)