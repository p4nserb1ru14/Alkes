package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class ForgetPinPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pin_page);
        AppCompatButton btnNext = findViewById(R.id.forget_pin_page_btn_next);
        btnNext.setOnClickListener(view -> {
            Intent intent = new Intent(ForgetPinPageActivity.this, NewPinPageActivity.class);
            startActivity(intent);
        });
    }
}