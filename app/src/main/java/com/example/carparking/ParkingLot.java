package com.example.carparking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ParkingHotels> recyclerDataArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_lot);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<ParkingHotels> items = new ArrayList<ParkingHotels>();
        items.add(new ParkingHotels("Muscat mall","muscat@email.com",R.drawable.baseline_house_24));
        items.add(new ParkingHotels("Oman mall","oman.mall@email.com",R.drawable.baseline_house_24));
        items.add(new ParkingHotels("Grand mall","grand.m@email.com",R.drawable.baseline_house_24));
        items.add(new ParkingHotels("Oman avenues mall","oman.ave@email.com",R.drawable.baseline_house_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}