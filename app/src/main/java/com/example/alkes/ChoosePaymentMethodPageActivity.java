package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;


public class ChoosePaymentMethodPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_payment_method_page);


        RadioButton btnRadio = findViewById(R.id.radia_id1);
        btnRadio.setOnClickListener(view -> {
            Intent intent = new Intent(ChoosePaymentMethodPageActivity.this, NextPaymentPageActivity.class);
            startActivity(intent);
        });

    }
}