package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class IntroPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_page);
        AppCompatButton btnSup = findViewById(R.id.intro_page_btn_user);
        btnSup.setOnClickListener(view -> {
            Intent intent = new Intent(IntroPageActivity.this, HomeServiceActivity.class);
            startActivity(intent);
        });
        AppCompatButton btnCos = findViewById(R.id.intro_page_btn_teknisi);
        btnCos.setOnClickListener(view -> {
            Intent intent = new Intent(IntroPageActivity.this, LoginPageActivity.class);
            startActivity(intent);
        });
    }
}