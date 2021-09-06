package com.e.myapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.e.myapp.R;
import com.e.myapp.model.popularfood;

import java.util.List;

public class popularfoodadapter extends RecyclerView.Adapter<popularfoodadapter.PopularFoodViewholder>
{
    Context context;
    List<popularfood> foodlist;

    public popularfoodadapter ( Context context, List<popularfood> foodlist ) {
        this.context = context;
        this.foodlist = foodlist;
    }

         public static final class PopularFoodViewholder extends RecyclerView.ViewHolder{


            ImageView foodimage;
            TextView nme,pc;


        public PopularFoodViewholder ( @NonNull View itemView ) {
            super(itemView);

            foodimage=itemView.findViewById(R.id.foodpic);
            nme=itemView.findViewById(R.id.foodname);
            pc=itemView.findViewById(R.id.foodprice);

        }
    }
    @NonNull
    @Override
    public PopularFoodViewholder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
        View view= LayoutInflater.from(context).inflate(R.layout.popular_food_row,parent,false);
        return new PopularFoodViewholder(view);
    }

    @Override
    public void onBindViewHolder ( @NonNull PopularFoodViewholder holder, int position ) {
        holder.foodimage.setImageResource(foodlist.get(position).getImage());
        holder.nme.setText(foodlist.get(position).getName());
        holder.pc.setText(foodlist.get(position).getName());


    }

    @Override
    public int getItemCount () {
        return foodlist.size();
    }


}
