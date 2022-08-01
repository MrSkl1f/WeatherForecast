package com.weatherforecast.api

object Common {
	private val BASE_URL = "https://api.weatherapi.com/v1/"

	val retrofitService: RetrofitService
		get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}