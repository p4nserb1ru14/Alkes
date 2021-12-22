package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KategoriPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_page);

        TextView txtKategori1 = findViewById(R.id.txtKategori1);
        txtKategori1.setOnClickListener(view -> {
            Intent intent = new Intent(KategoriPageActivity.this, SetLocationActivity.class);
            startActivity(intent);
        });

    }
}