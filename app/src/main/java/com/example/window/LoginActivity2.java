package com.example.window;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;

public class LoginActivity2 extends AppCompatActivity {
MaterialButton enter;
EditText name,fulname,city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        name=findViewById(R.id.name);
        fulname=findViewById(R.id.fulname);
        city=findViewById(R.id.city);
        enter=findViewById(R.id.enter);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jname=name.getText().toString();
                String jfulname=fulname.getText().toString();
                String jcity=city.getText().toString();
                if (jname.isEmpty()){
                    Toast.makeText(LoginActivity2.this, "Ismingizni kiriting 😠", Toast.LENGTH_SHORT).show();
                    return;
                } if (jfulname.isEmpty()) {
                    Toast.makeText(LoginActivity2.this, "Familyangizni kiritng 😡", Toast.LENGTH_SHORT).show();
                    return;
                } if (jcity.isEmpty()) {
                    Toast.makeText(LoginActivity2.this, "Shahringizni kiriting 😤", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent=new Intent(LoginActivity2.this,MainActivity.class);


               intent.putExtra("ismi",jname);
               intent.putExtra("familyasi", jfulname);
               intent.putExtra("shahri",jcity);

                startActivity(intent);
            }

        });




    }
}