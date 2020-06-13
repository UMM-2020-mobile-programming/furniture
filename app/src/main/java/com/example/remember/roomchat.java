package com.example.remember;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class roomchat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomchat);
    }

    public void imageButton2(View view) {
        Intent intent = new Intent(roomchat.this, chat.class);
        startActivity(intent);
    }

    public void imageButton4(View view) {
        Intent intent = new Intent(roomchat.this, profile.class);
        startActivity(intent);
    }
}
