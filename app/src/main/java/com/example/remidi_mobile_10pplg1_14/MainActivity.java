package com.example.remidi_mobile_10pplg1_14;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.remidi_mobile_10pplg1_14.fragments.FragmentEnglish;
import com.example.remidi_mobile_10pplg1_14.fragments.FragmentLaliga;
import com.example.remidi_mobile_10pplg1_14.fragments.FragmentProfile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new FragmentLaliga())
                .commit();

        bottomNavigationView.setOnItemSelectedListener( item ->{
            Fragment fragment = null;
            int itemId = item.getItemId();

            if (itemId == R.id.nav_spanish) {
                fragment = new FragmentLaliga();
            } else if (itemId == R.id.nav_english) {
                fragment = new FragmentEnglish();
            } else if (itemId == R.id.nav_profile) {
                fragment = new FragmentProfile();
            }

            if (fragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame_layout, fragment)
                        .commit();
                return true;
            }
            return false;
        });

    }
}