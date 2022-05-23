package com.example.weather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import androidx.annotation.MainThread;

import com.example.weather.model.com.example.Fact;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherOkHttpApi {

	public static void get(OkHttpClient client, TextView textView) throws IOException {
		Request request = new Request.Builder()
				.url("https://api.weather.yandex.ru/v2/forecast/?lat=55.75396&lon=37.620393")
				.header("X-Yandex-API-Key", "ae152722-f3dc-4141-8f4c-253687d51178")
				.build();

		client.newCall(request).enqueue(new Callback() {
			@Override
			public void onFailure(Call call, IOException e) {
				e.printStackTrace();
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				if (response.isSuccessful()) {
					String responseData = response.body().string();
					try {
						ObjectMapper objectMapper = new ObjectMapper();
						JSONObject json = new JSONObject(responseData);
						final String jsonFact = json.getString("fact");
						Fact fact = objectMapper.readValue(jsonFact, Fact.class);

						new Handler(Looper.getMainLooper()).post(new Runnable() {
							@Override
							public void run() {
								textView.setText(fact.getTemp().toString());
							}
						});
					} catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
		});

	}
}
