package com.selvy.aplikasipemesanantiketpesawat.users;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.selvy.aplikasipemesanantiketpesawat.MainActivity;
import com.selvy.aplikasipemesanantiketpesawat.R;

public class RegistrasiActivity extends AppCompatActivity {

    Button btnLogin;
    NoboButton btnRegistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        btnRegistrasi = (NoboButton) findViewById(R.id.RegistrasiBtn);
        btnLogin      = (Button) findViewById(R.id.btnLogin);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}