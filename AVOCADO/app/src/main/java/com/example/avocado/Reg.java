package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {
    Button button3;
    EditText editText;
    EditText editText3;
    EditText editText5;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        button3 = (Button) findViewById(R.id.button3);
        editText = findViewById(R.id.editText);
        editText3 = findViewById(R.id.editText3);
        editText5 = findViewById(R.id.editText5);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if(editText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter username",Toast.LENGTH_SHORT).show();
                }else {
                    if (editText3.getText().toString().trim().matches(emailPattern)) {

                    }
                }

                if(editText3.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
                }else {
                    if (editText3.getText().toString().trim().matches(emailPattern)) {

                    } else {
                        Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
                    }
                }

                if(editText5.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter Password",Toast.LENGTH_SHORT).show();
                }else {
                    Intent a = new Intent(Reg.this, home.class);
                    startActivity(a);
                }

            }
        });
    }

}
