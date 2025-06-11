package com.example.remidi_mobile_10pplg1_14.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.remidi_mobile_10pplg1_14.R;

public class FragmentProfile extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance){
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }
}
