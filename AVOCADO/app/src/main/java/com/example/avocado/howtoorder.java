package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class howtoorder extends AppCompatActivity {
    Button button3, button7, button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtoorder);

        button3 = (Button) findViewById(R.id.button3);
        button7 = (Button) findViewById(R.id.button7);
        button14 = (Button) findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(howtoorder.this, home.class);
                startActivity(a);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(howtoorder.this, indonesia.class);
                startActivity(a);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(howtoorder.this, english.class);
                startActivity(a);
            }
        });
    }
}
