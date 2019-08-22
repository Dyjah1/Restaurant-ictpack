package com.example.marii.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Top_up_account extends AppCompatActivity {
    private Spinner top_up_from;
    String[] methods = {"From Bank Account", "From Airtel Money", "From M-Pesa", "From Tigo Pesa", "From T-Pesa", "From Ezy-pesa", "From digital wallet", "Other"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_account);

        top_up_from=(Spinner)findViewById(R.id.top_up_from);

        top_up_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, methods);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        top_up_from.setAdapter(arrayAdapter);

    }
}
