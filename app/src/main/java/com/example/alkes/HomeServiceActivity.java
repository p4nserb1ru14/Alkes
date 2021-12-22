package com.example.alkes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeServiceActivity extends AppCompatActivity {

    Spinner spnDepartments;
    ArrayAdapter<CharSequence> adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_service);

        spnDepartments = (Spinner) findViewById(R.id.spnDepartments);
        adapter1 = ArrayAdapter.createFromResource(this,R.array.Departments,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spnDepartments.setAdapter(adapter1);
        spnDepartments.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}