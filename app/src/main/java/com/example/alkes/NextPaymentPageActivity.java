package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextPaymentPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_payment_page);
        TextView txtPayment = findViewById(R.id.txtPayment);
        txtPayment.setOnClickListener(view -> {
            Intent intent = new Intent(NextPaymentPageActivity.this, MenuOrderActivity.class);
            startActivity(intent);
        });
    }
}