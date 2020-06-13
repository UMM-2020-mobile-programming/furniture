package com.example.remember;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    public void imageButton6(View view) {
        Intent intent = new Intent(chat.this, home.class);
        startActivity(intent);
    }

    public void imageButton5(View view) {
        Intent intent = new Intent(chat.this, profile.class);
        startActivity(intent);
    }

    public void imageButton3(View view) {
        Intent intent = new Intent(chat.this, findinguser.class);
        startActivity(intent);
    }

    public void imageVier7(View view) {
        Intent intent = new Intent(chat.this, roomchat.class);
        startActivity(intent);
    }
}
