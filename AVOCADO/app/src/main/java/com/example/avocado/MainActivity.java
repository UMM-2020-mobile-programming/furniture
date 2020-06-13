package com.example.avocado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Button button, button2;
    EditText editText2;
    EditText Password;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Password = findViewById(R.id.Password);
        editText2 = findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                if(editText2.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
                }else {
                    if (editText2.getText().toString().trim().matches(emailPattern)) {

                    } else {
                        Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
                    }
                }

                if(Password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),"enter Password",Toast.LENGTH_SHORT).show();
                }else {
                    if (Password.getText().length() > 4) {
                        Intent a = new Intent(MainActivity.this, home.class);
                        startActivity(a);
                    } else {
                        Toast.makeText(getApplicationContext(),"Invalid Password", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(MainActivity.this, Reg.class);
                startActivity(a);

            }
        });
    }



}
