package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstAid extends AppCompatActivity {

    TextView cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8,cat9,cat10,cat11,cat12,cat13,cat14,cat15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid);
        getSupportActionBar().setTitle("Category");
        cat1 = findViewById(R.id.cat1);
        cat2 = findViewById(R.id.cat2);
        cat3 = findViewById(R.id.cat3);
        cat4 = findViewById(R.id.cat4);
        cat5 =findViewById(R.id.cat5);
        cat6 = findViewById(R.id.cat6);
        cat7 = findViewById(R.id.cat7);
        cat8 = findViewById(R.id.cat8);
        cat9 = findViewById(R.id.cat9);
        cat10 = findViewById(R.id.cat10);
        cat11 = findViewById(R.id.cat11);
        cat12 = findViewById(R.id.cat12);
        cat13 = findViewById(R.id.cat13);


        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid1_1.class);
                startActivity(forum1_2);
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid2.class);
                startActivity(forum1_2);
            }
        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirestAid3.class);
                startActivity(forum1_2);
            }
        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid4.class);
                startActivity(forum1_2);

            }
        });

        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid5.class);
                startActivity(forum1_2);
            }
        });

        cat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FiestAid6.class);
                startActivity(forum1_2);
            }
        });

        cat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid7.class);
                startActivity(forum1_2);
            }
        });

        cat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid8.class);
                startActivity(forum1_2);
            }
        });

        cat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid9.class);
                startActivity(forum1_2);
            }
        });

        cat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid10.class);
                startActivity(forum1_2);
            }
        });

        cat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid11.class);
                startActivity(forum1_2);
            }
        });

        cat12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid12.class);
                startActivity(forum1_2);

            }
        });

        cat13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid.this,FirstAid13.class);
                startActivity(forum1_2);
            }
        });
    }
}
