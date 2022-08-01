package com.weatherforecast.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
	private var retrofit: Retrofit? = null

	private fun createRetrofit(baseUrl: String) {
		if (retrofit == null) {
			retrofit = Retrofit.Builder()
				.baseUrl(baseUrl)
				.addConverterFactory(GsonConverterFactory.create())
				.build()
		}
	}

	fun getClient(baseUrl: String): Retrofit {
		createRetrofit(baseUrl)
		return retrofit!!
	}
}