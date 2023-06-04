package com.example.carparking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    List<ParkingHotels> items;

    public MyAdapter(Context context, List<ParkingHotels> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {

//        final ParkingHotels getMyhotelparkings = items.get(position);
        holder.nameView.setText(items.get(position).getName());
        holder.emailView.setText(items.get(position).getEmail());
        holder.imageView1.setImageResource(items.get(position).getImage());

//        holder.nameView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(context, getMyhotelparkings.getName(), Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(context, CarParking.class);
////                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
////                intent.putExtra("name",getMyhotelparkings.getName());
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imageView1;
        TextView emailView;
        TextView nameView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.imageview);
            emailView = itemView.findViewById(R.id.email);
            nameView = itemView.findViewById(R.id.name);
            imageView1.setOnClickListener( this);
        }

        @Override
        public void onClick(View v) {
            int postion = getAdapterPosition();
//            Toast.makeText(context, "postion"+postion, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context, CarParking.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("name" , items.get(postion).getName());
            context.startActivity(intent);
        }
    }
}