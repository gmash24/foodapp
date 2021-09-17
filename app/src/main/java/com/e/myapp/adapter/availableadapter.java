package com.e.myapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.e.myapp.R;
import com.e.myapp.model.availablefood;

import java.util.List;

public class availableadapter extends RecyclerView.Adapter<availableadapter.PopularFoodViewholder>
{
    Context context;
    List<availablefood> foodlist;

    public availableadapter ( Context context, List<availablefood> foodlist ) {
        this.context = context;
        this.foodlist = foodlist;
    }

         public static final class PopularFoodViewholder extends ViewHolder{


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
        View view= LayoutInflater.from(context).inflate(R.layout.available_food_row,parent,false);
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
