package com.example.emrapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {
    TextView cat1,cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().setTitle("Categories");
        cat1 = findViewById(R.id.cat1);
        cat2 =findViewById(R.id.cat2);
        cat3= findViewById(R.id.cat3);
        cat4 = findViewById(R.id.cat4);
        cat5 = findViewById(R.id.cat5);
        cat6 = findViewById(R.id.cat6);
        cat7 = findViewById(R.id.cat7);
        cat8 = findViewById(R.id.cat8);
        cat9 = findViewById(R.id.cat9);

        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToForum1();
            }
        });
        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum2.class);
                startActivity(forum1);
            }
        });
        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum3.class);
                startActivity(forum1);
            }
        });

        cat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum4.class);
                startActivity(forum1);
            }
        });

        cat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum5.class);
                startActivity(forum1);
            }
        });

        cat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum6.class);
                startActivity(forum1);
            }
        });

        cat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum7.class);
                startActivity(forum1);
            }
        });

        cat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum8.class);
                startActivity(forum1);
            }
        });

        cat9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1 = new Intent(Category.this,Forum9.class);
                startActivity(forum1);
            }
        });




    }

    private void sendToForum1() {
        Intent forum1 = new Intent(Category.this,Forum1.class);
        startActivity(forum1);
    }
}
