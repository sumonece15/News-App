package com.sumon.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.sumon.newsapp.adapter.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mHome, mHealth, mSports, mScience, mEntertainment, mTechnology;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;

    String api = "667588f054de4f4fb72bcb20ab86fa97";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mHome = findViewById(R.id.home);
        mScience = findViewById(R.id.science);
        mHealth = findViewById(R.id.health);
        mSports = findViewById(R.id.sports);
        mEntertainment = findViewById(R.id.entertainment);
        mTechnology = findViewById(R.id.technology);
        tabLayout = findViewById(R.id.include);
        ViewPager viewPager = findViewById(R.id.fragment_container);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 6);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                 if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5)
                 {
                     pagerAdapter.notifyDataSetChanged();
                 }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));




    }
}