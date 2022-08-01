package com.weatherforecast.api

import com.weatherforecast.api.models.Current
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
	@GET("current.json")
	fun getWeather(
		@Query("key") apiKey: String,
		@Query("q") city: String,
		@Query("aqi") airQuality: String
	): Call<Current>
}