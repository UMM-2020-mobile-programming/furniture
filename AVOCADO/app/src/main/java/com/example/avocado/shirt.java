package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shirt extends AppCompatActivity {
    Button button99, button14, button16, button17, button18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirt);

        button99 = (Button) findViewById(R.id.button99);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button14 = (Button) findViewById(R.id.button14);

        button99.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirt.this, shirtinfo1.class);
                startActivity(a);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirt.this, home.class);
                startActivity(a);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirt.this, shirtinfo2.class);
                startActivity(a);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirt.this, shirtinfo3.class);
                startActivity(a);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirt.this, shirtinfo4.class);
                startActivity(a);
            }
        });
    }
}
