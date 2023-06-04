package com.example.carparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginScreen extends AppCompatActivity {
    EditText userEmail, userPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        ImageButton imageButton = (ImageButton) findViewById(R.id.adminSigninID);

        userEmail = findViewById(R.id.adminLoginEmailID);
        userEmail = findViewById(R.id.adminLoginEmailID);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(i);
            }
        });
    }
}