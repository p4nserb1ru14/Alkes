package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

public class EntryPinPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_pin_page);
        @SuppressLint("WrongViewCast")
        AppCompatTextView rowPin = findViewById(R.id.entry_pin_page_forget_pin);
        rowPin.setOnClickListener(view ->{
            Intent intent = new Intent(EntryPinPageActivity.this, ForgetPinPageActivity.class);
            startActivity(intent);

        });
    }
}