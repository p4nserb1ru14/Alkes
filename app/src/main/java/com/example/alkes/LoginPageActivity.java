package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        AppCompatButton btnRegister= findViewById(R.id.login_page_btn_register);
        btnRegister.setOnClickListener(view -> {
            Intent intent = new Intent(LoginPageActivity.this, EntryNumberPageActivity.class);
            startActivity(intent);
        });
        AppCompatButton btnLogin = findViewById(R.id.login_page_btn_login);
        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(LoginPageActivity.this, LoginHomePageActivity.class);
            startActivity(intent);
        });
    }
}