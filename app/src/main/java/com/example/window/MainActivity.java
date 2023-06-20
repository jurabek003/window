package com.example.window;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView j_ism,j_familya,j_shahar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        funksi();
        String name= getIntent().getStringExtra("ismi");
        String fulname= getIntent().getStringExtra("familyasi");
        String city= getIntent().getStringExtra("shahri");

        j_ism.setText(name);
        j_familya.setText(fulname);
        j_shahar.setText(city);

    }

    private void funksi() {
    j_ism=findViewById(R.id.ism);
    j_familya=findViewById(R.id.familya);
    j_shahar=findViewById(R.id.shahar);


    }
}