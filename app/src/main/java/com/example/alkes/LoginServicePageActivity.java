package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LoginServicePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_service_page);

        AppCompatButton btnFind = findViewById(R.id.login_service_page_btn_find_teknisi);
        btnFind.setOnClickListener(view -> {
            Intent intent = new Intent(LoginServicePageActivity.this, KategoriPageActivity.class);
            startActivity(intent);
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        bottomNavigationView.setOnItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.nav_home:
                    startActivity(new Intent(getApplicationContext()
                            , LoginHomePageActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
                case R.id.nav_service:
                    return true;
                case R.id.nav_pesananmu:
                    startActivity(new Intent(getApplicationContext()
                            ,MenuOrderActivity.class));
                    overridePendingTransition(0, 0);
                    return true;
            }


            return false;
        });

        @SuppressLint("WrongViewCast") Spinner spinner = findViewById(R.id.planets_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}