package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MenuOrderActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapter adapter;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_order);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                startActivity(new Intent(getApplicationContext()
                        ,LoginHomePageActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.nav_service:
                    startActivity(new Intent(getApplicationContext()
                            , LoginServicePageActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.nav_pesananmu:
                    return true;
            }


            return false;
        });

        tabLayout = findViewById(R.id.tabLayout);
        pager2 = findViewById(R.id.viewPager2);
        FragmentManager fm= getSupportFragmentManager();
        adapter = new FragmentAdapter(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Pesanan Aktif"));
        tabLayout.addTab(tabLayout.newTab().setText("Riwayat Pesanan"));




        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
                super.onPageSelected(position);
            }
        });

        





    }
}