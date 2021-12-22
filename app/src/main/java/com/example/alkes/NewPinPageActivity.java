package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewPinPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pin_page);
        AppCompatButton btnNewPin = findViewById(R.id.new_pin_page_btn_reset);
        btnNewPin.setOnClickListener(view -> {
            Intent intent = new Intent(NewPinPageActivity.this, SuksesPinPageActivity.class);
            startActivity(intent);
        });
    }
}