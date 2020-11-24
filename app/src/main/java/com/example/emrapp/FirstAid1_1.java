package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstAid1_1 extends AppCompatActivity {

    TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid1_1);
        getSupportActionBar().setTitle("First Aid");
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(FirstAid1_1.this,FirstAid1_2.class);
                startActivity(forum1_2);
            }
        });
    }
}
