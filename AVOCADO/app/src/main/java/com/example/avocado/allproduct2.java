package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allproduct2 extends AppCompatActivity {
    Button button3, button7, button9, button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allproduct2);

        button3 = (Button) findViewById(R.id.button3);
        button7 = (Button) findViewById(R.id.button7);
        button9 = (Button) findViewById(R.id.button9);
        button14 = (Button) findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(allproduct2.this, home.class);
                startActivity(a);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(allproduct2.this, allproduct.class);
                startActivity(a);
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(allproduct2.this, comingsoon.class);
                startActivity(a);
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(allproduct2.this, comingsoon.class);
                startActivity(a);
            }
        });
    }
}
