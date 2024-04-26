package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.ingreso);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí validas las credenciales del usuario

                // Si las credenciales son válidas, inicias la SecondActivity
                Intent intent = new Intent(MainActivity.this, MediumActivity.class);
                startActivity(intent);
            }
        });
    }
}