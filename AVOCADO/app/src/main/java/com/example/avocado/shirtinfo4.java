package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shirtinfo4 extends AppCompatActivity {
    Button button13, button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirtinfo4);

        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirtinfo4.this, home.class);
                startActivity(a);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(shirtinfo4.this, paymentdetail4.class);
                startActivity(a);
            }
        });
    }
}
