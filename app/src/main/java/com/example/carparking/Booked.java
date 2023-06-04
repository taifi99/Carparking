package com.example.carparking;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Booked extends AppCompatActivity {


    TextView date, time;
    Button endParking;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booked);

        date = findViewById(R.id.reservationTimeID1);
        time = findViewById(R.id.reservationTime);


        DateFormat df1 = new SimpleDateFormat("EEE, MMM d, ''yy" );
        String date1 = df1.format(Calendar.getInstance().getTime());
        DateFormat df2 = new SimpleDateFormat("h:mm a");
        String date2 = df2.format(Calendar.getInstance().getTime());

//        Toast.makeText(this, ""+date, Toast.LENGTH_SHORT).show();

        date.setText(date1);
        time.setText(date2);


        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Are You sure to end?");
        builder1.setCancelable(false);
        endParking = findViewById(R.id.endparking);
        endParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder1.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
            }
        });
    }
}