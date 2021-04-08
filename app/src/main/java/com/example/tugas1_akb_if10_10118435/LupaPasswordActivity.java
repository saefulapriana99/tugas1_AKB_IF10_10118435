package com.example.tugas1_akb_if10_10118435;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LupaPasswordActivity extends AppCompatActivity {
    //IF10-10118435-SAEFUL APRIANA
    //7:00 PM 04/07/2021
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        Button nextregister = findViewById(R.id.btnbacklogin);
        nextregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LupaPasswordActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}