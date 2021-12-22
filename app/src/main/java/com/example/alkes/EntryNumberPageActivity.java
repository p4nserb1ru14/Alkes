package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class EntryNumberPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_number_page);
        AppCompatButton btnForgetPin = findViewById(R.id.entry_number_page_register_btn);
        btnForgetPin.setOnClickListener(view -> {
            Intent intent = new Intent(EntryNumberPageActivity.this, RequestOtpActivity.class);
            startActivity(intent);
        });
    }
}