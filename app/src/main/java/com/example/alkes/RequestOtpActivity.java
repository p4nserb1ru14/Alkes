package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class RequestOtpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_otp);
        AppCompatButton btnForgetPin = findViewById(R.id.request_otp_btn_ok);
        btnForgetPin.setOnClickListener(view -> {
            Intent intent = new Intent(RequestOtpActivity.this, RegisterPageActivity.class);
            startActivity(intent);
        });
    }
}