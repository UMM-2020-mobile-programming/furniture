package com.example.remember;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void button4(View view) {
        Intent intent = new Intent(home.this, chat.class);
        startActivity(intent);
    }

    public void button5(View view) {
        Intent intent = new Intent(home.this, profile.class);
        startActivity(intent);
    }
}
