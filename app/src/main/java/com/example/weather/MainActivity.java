package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.weather.repository.RetrofitRepository;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textView = findViewById(R.id.textView);


//		RetrofitRepository.getVolume();

		OkHttpClient client = new OkHttpClient();
		try {
			WeatherOkHttpApi.get(client, textView);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}