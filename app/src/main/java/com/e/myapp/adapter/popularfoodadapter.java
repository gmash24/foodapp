package com.e.myapp.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

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

    public static final class PopularFoodViewholder extends ViewHolder{

        public PopularFoodViewholder ( @NonNull View itemView ) {
            super(itemView);
        }
    }
    @NonNull
    @Override
    public PopularFoodViewholder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
        return null;
    }

    @Override
    public void onBindViewHolder ( @NonNull PopularFoodViewholder holder, int position ) {

    }

    @Override
    public int getItemCount () {
        return foodlist.size();
    }


}
