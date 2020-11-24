package com.example.emrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Forum1_3 extends AppCompatActivity {
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum1_3);
        getSupportActionBar().setTitle("Forum");
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forum1_2 = new Intent(Forum1_3.this,Forum1_4.class);
                startActivity(forum1_2);
            }
        });
    }
}
