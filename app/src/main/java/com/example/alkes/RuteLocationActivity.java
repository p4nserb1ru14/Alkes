package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class RuteLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rute_location);

        AppCompatButton btnChat = findViewById(R.id.rute_location_btn_chat);
        btnChat.setOnClickListener(view -> {
            Intent intent = new Intent(RuteLocationActivity.this, TeknisiChatPageActivity.class);
            startActivity(intent);
        });
    }
}