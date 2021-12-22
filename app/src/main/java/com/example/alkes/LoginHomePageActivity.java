package com.example.alkes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class LoginHomePageActivity extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_home_page);

        ImageView btnNewPin = findViewById(R.id.login_home_chat);
        btnNewPin.setOnClickListener(view -> {
            Intent intent = new Intent(LoginHomePageActivity.this, TeknisiChatPageActivity.class);
            startActivity(intent);
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);


        TabLayout tabLayout = viewPager.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager, true);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                        return true;
                case R.id.nav_service:
                    startActivity(new Intent(getApplicationContext()
                            , LoginServicePageActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.nav_pesananmu:
                    startActivity(new Intent(getApplicationContext()
                            ,MenuOrderActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
            }


            return false;
        });


    }

}