package com.example.carparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bashboard);
        TextView logout = (TextView) findViewById(R.id.logoutID);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LoginScreen.class);
                startActivity(i);
            }
        });
        TextView feedback = (TextView) findViewById(R.id.feedbackID);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),FeedBack.class);
                startActivity(i);
            }
        });
        TextView profile = (TextView) findViewById(R.id.profileID);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Profile.class);
                startActivity(i);
            }
        });
        TextView park = (TextView) findViewById(R.id.findLotID);
        park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ParkingLot.class);
                startActivity(i);
            }
        });

    }
}