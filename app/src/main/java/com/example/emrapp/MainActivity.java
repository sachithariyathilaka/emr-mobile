package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button doctorLogin,patientLogin, healty, firstAid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        doctorLogin = findViewById(R.id.doctorLogin);
        patientLogin = findViewById(R.id.patientLogin);
        healty = findViewById(R.id.heatly);
        firstAid = findViewById(R.id.firstAid);
        
        doctorLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToDoctorLogin();
            }
        });
        patientLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPatientLogin();
            }
        });
        healty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToCatogory();
            }
        });
        firstAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent=new Intent(MainActivity.this, FirstAid.class);
                startActivity(mainIntent);
            }
        });
    }

    private void goToPatientLogin() {
        Intent mainIntent=new Intent(MainActivity.this, patientLoginActivity.class);
        startActivity(mainIntent);
    }

    private void goToDoctorLogin() {
        Intent mainIntent=new Intent(MainActivity.this, doctorLoginActivity.class);
        startActivity(mainIntent);
    }
    private void sendToCatogory() {
        Intent mainIntent=new Intent(MainActivity.this, Category.class);
        startActivity(mainIntent);
    }
}
