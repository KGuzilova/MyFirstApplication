package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_form);

        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText phone = findViewById(R.id.phone);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        Button butSave = findViewById(R.id.but_save);

        TextView textEnter = findViewById(R.id.text_about_enter);

        butSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().length() == 0) {
                        name.setError("заполните поле");
                    }
                else if (age.getText().toString().length() == 0) {
                    age.setError("заполните поле");
                }
                else if (phone.getText().toString().length() == 0) {
                    phone.setError("заполните поле");
                }
                else if (email.getText().toString().length() == 0) {
                    email.setError("заполните поле");
                }
                else if (password.getText().toString().length() == 0) {
                    password.setError("заполните поле");
                }
                else {textEnter.setText("спасибо");}
            }
        });
    }
}