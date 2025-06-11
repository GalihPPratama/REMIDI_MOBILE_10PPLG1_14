package com.example.remidi_mobile_10pplg1_14.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class englishResponse {
    @SerializedName("teams")
    private List<laliga> laliga;


    public List<laliga> getTeams() {

        return laliga;
    }
}
