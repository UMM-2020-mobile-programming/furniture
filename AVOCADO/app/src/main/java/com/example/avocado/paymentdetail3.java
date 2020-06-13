package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class paymentdetail3 extends AppCompatActivity {
    Button button6, button14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentdetail3);

        button6 = (Button) findViewById(R.id.button6);
        button14 = (Button) findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(paymentdetail3.this, home.class);
                startActivity(a);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(paymentdetail3.this, paymentfinal.class);
                startActivity(a);
            }
        });
    }
}
