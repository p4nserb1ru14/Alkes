package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PaymentPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_page);

        ImageView imageChoose = findViewById(R.id.imageMethodePayment);
        imageChoose.setOnClickListener(view -> {
            Intent intent = new Intent(PaymentPageActivity.this, ChoosePaymentMethodPageActivity.class);
            startActivity(intent);
        });

    }
}