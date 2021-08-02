package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    TextView ob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Intent in = getIntent();
        String value = in.getStringExtra("value");
        ob = findViewById(R.id.txt2);
        ob.setText(value);
    }
}