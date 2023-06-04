package com.example.carparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.carparking.databinding.ActivityCarParkingBinding;

public class CarParking extends AppCompatActivity {
    private  String userName;
    GridView grid;

    int icons[]=
            {
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location,
                    R.drawable.self_location
            };
    String name[]={"Free","Not","Free","Free","Not","Free","Free","Free","Not"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_parking);
        Intent intent = getIntent();
        userName = intent.getStringExtra("name");
//        Toast.makeText(CarParking.this,"You are "+ userName, Toast.LENGTH_SHORT).show();

        grid=(GridView)findViewById(R.id.datagrid);

        gridAdapter obj=new gridAdapter(this,name,icons);
        grid.setAdapter(obj);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(CarParking.this, "Name", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Booked.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}