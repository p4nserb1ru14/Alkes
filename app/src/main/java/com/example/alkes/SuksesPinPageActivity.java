package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class SuksesPinPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses_pin_page);
        AppCompatButton btnSukses = findViewById(R.id.sukses_pin_page_btn_ok);
        btnSukses.setOnClickListener(view -> {
            Intent intent = new Intent(SuksesPinPageActivity.this, LoginPageActivity.class);
            startActivity(intent);
        });
    }
}