package com.weatherforecast.api.models

class Current(
	val lastUpdatedEpoch: Long? = null,
	val lastUpdated: String? = null,
	val tempC: String? = null,
	val tempF: String? = null,
	val isDay: Boolean? = null,
	val condition: Condition? = null,
	val wind_mph: Float? = null,
	val wind_kph: Float? = null,
	val wind_degree: Int? = null,
	val wind_dir: String? = null,
	val pressure_mb: Float? = null,
	val pressure_in: Float? = null,
	val precip_mm: Float? = null,
	val precip_in: Float? = null,
	val humidity: Int? = null,
	val cloud: Int? = null,
	val feelslike_c: Float? = null,
	val feelslike_f: Float? = null,
	val vis_km: Float? = null,
	val vis_miles: Float? = null,
	val uv: Float? = null,
	val gust_mph: Float? = null,
	val gust_kph: Float? = null
)