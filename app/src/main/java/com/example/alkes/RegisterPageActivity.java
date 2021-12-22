package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class RegisterPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        AppCompatButton btnOk = findViewById(R.id.register_page_btn_ok);
        btnOk.setOnClickListener(view -> {
            Intent intent = new Intent(RegisterPageActivity.this, EntryPinPageActivity.class);
            startActivity(intent);
        });
    }
}