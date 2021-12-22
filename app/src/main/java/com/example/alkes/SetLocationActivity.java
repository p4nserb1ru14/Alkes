package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class SetLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);

        AppCompatButton btnSetLocation = findViewById(R.id.btnSetLocation);
        btnSetLocation.setOnClickListener(view -> {
            Intent intent = new Intent(SetLocationActivity.this, PaymentPageActivity.class);
            startActivity(intent);
        });

    }
}