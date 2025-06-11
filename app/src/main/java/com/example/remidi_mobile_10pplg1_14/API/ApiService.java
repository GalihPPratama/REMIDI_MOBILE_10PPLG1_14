package com.example.remidi_mobile_10pplg1_14.API;


import com.example.remidi_mobile_10pplg1_14.model.englishResponse;
import com.example.remidi_mobile_10pplg1_14.model.laligaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface ApiService {
    @GET("/api/v1/json/3/search_all_teams.php?s=Soccer&c=Spain")
    Call<laligaResponse> getAllTeams2();

    @GET("/api/v1/json/3/search_all_teams.php?s=Soccer&c=England")
    Call<englishResponse> getAllTeams();
}
