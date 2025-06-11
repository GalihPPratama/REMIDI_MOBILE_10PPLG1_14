package com.example.remidi_mobile_10pplg1_14.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.remidi_mobile_10pplg1_14.API.ApiService;
import com.example.remidi_mobile_10pplg1_14.API.RetrofitClient;
import com.example.remidi_mobile_10pplg1_14.Adapter.EnglishAdapter;
import com.example.remidi_mobile_10pplg1_14.Adapter.SpanishAdapter;
import com.example.remidi_mobile_10pplg1_14.R;
import com.example.remidi_mobile_10pplg1_14.model.english;
import com.example.remidi_mobile_10pplg1_14.model.englishResponse;
import com.example.remidi_mobile_10pplg1_14.model.laliga;
import com.example.remidi_mobile_10pplg1_14.model.laligaResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FragmentEnglish extends Fragment {

    private RecyclerView recyclerViewEnglish;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_english, container, false);
        recyclerViewEnglish = view.findViewById(R.id.recyclerviewEnglish);
        recyclerViewEnglish.setLayoutManager(new LinearLayoutManager(getContext()));
        loadTeams();
        return view;
    }

    private void loadTeams(){
        RetrofitClient.getRetrofitInstance()
                .create(ApiService.class)
                .getAllTeams()
                .enqueue(new Callback<englishResponse>() {
                    @Override
                    public void onResponse(Call<englishResponse> call, Response<englishResponse> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            List<laliga> teams = response.body().getTeams();
                            EnglishAdapter EnglishAdapter = new EnglishAdapter(requireContext(), teams);
                            recyclerViewEnglish.setAdapter(EnglishAdapter);
                        } else {
                            Toast.makeText(getContext(), "No Data", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<englishResponse> call, Throwable t) {
                        Toast.makeText(getContext(), "Failed: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
