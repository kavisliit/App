package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void topage2(View ob){
        EditText tx = (EditText) findViewById(R.id.txt1);
        String msg = tx.getText().toString();
        Intent ob1 = new Intent(this,page2.class);
        ob1.putExtra("value",msg);
        startActivity(ob1);
    }
}