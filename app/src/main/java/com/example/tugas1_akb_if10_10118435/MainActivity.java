package com.example.tugas1_akb_if10_10118435;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //IF10-10118435-SAEFUL APRIANA
    //10:00 AM 04/06/2021
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//berhasil login dan masuk ke halaman dasboard
            Button todasboard = findViewById(R.id.btnRegister);
            todasboard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            });

//Register akun
            Button register = findViewById(R.id.btnlogin);
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, DasboardActivity.class);
                    startActivity(intent);
                }
            });

    }
}

