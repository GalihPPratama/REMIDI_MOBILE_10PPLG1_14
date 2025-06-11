package com.example.remidi_mobile_10pplg1_14.model;

import com.google.gson.annotations.SerializedName;

public class laliga {
    @SerializedName("idTeam")
    private String idTeam;

    @SerializedName("strTeam")
    private String strTeam;

    @SerializedName("strBadge")
    private String strBadge;

    @SerializedName("strSport")
    private String strSport;

    @SerializedName("idLeague")
    private String idLeague;

    @SerializedName("strDescriptionEN")
    private String strDescriptionEN;

    public String getIdTeam() {

        return idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public String getidLeague(){
        return idLeague;
    }

    public String getStrTeamBadge() {
        return strBadge;
    }

    public String getStrSport(){
        return strSport;
    }

    public String getStrDescriptionEN(){
        return strDescriptionEN;
    }
}
