package com.example.weather.repository;



import android.os.AsyncTask;
import android.os.StrictMode;

import com.example.weather.WeatherRetrofitApi;
import com.example.weather.model.com.example.Fact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataInput;
import java.io.IOException;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit.converter.JacksonConverter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitRepository {

	public static void getVolume() {


		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://api.weather.yandex.ru/v2/forecast/")
				.addConverterFactory(GsonConverterFactory.create())
				.client(httpClient.build())
				.build();

		WeatherRetrofitApi weatherService = retrofit.create(WeatherRetrofitApi.class);
		Call<Fact> callSync = weatherService.weather();

		call(callSync);


		}

	public static void call(Call<Fact> callSync) {
		{
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
					.permitAll().build();
			StrictMode.setThreadPolicy(policy);

			try {
				Response<Fact> response = callSync.execute();
				System.out.println(response.raw().body().toString());
				Fact user = response.body();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

