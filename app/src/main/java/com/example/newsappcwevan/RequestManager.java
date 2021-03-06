package com.example.newsappcwevan;

import android.content.Context;

import com.example.newsappcwevan.Models.NewsApiResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class RequestManager {
    Context context;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();



    public RequestManager(Context context) {
        this.context = context; }

        public interface CallNewsApi{
            @GET("top-headlines")
            Call<NewsApiResponse> callheadlines(
                    @Query("country") String country,
                    @Query("category") String category,
                    @Query("q") String query,
                    @Query("apikey") String  api_key

            );

        }
}
