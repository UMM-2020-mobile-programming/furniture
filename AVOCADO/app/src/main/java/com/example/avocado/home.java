package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button button3, button6, button7, button8, button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button3 = (Button) findViewById(R.id.button3);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(home.this, contactus.class);
                startActivity(a);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(home.this, getsocial.class);
                startActivity(a);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(home.this, allproduct2.class);
                startActivity(a);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(home.this, howtoorder.class);
                startActivity(a);
            }
        });
    }
}
