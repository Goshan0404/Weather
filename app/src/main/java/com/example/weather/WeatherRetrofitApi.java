package com.example.weather;

import com.example.weather.model.com.example.Fact;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface WeatherRetrofitApi {

	@Headers({"X-Yandex-API-Key: ae152722-f3dc-4141-8f4c-253687d51178"})
	@GET("?lat=55.75396&lon=37.620393")
	Call<Fact> weather();
}