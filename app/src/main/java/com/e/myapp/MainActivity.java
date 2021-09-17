package com.e.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.myapp.adapter.availableadapter;
import com.e.myapp.adapter.popularfoodadapter;
import com.e.myapp.model.availablefood;
import com.e.myapp.model.popularfood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView pr,ar;
    popularfoodadapter popularfoodadapter;
    availableadapter  Availableadapter;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // now we will bind data to the adapter class
        List<popularfood> pfl =new ArrayList<>();
        pfl.add(new popularfood ("chapati",R.drawable.pic1,"80"));
        pfl.add(new popularfood ("ugali ",R.drawable.pic2,"80"));
        pfl.add(new popularfood ("rice",R.drawable.pic3,"80"));
        pfl.add(new popularfood ("chapati",R.drawable.pic1,"80"));
        pfl.add(new popularfood ("ugali ",R.drawable.pic2,"80"));
        pfl.add(new popularfood ("rice",R.drawable.pic3,"80"));
        pfl.add(new popularfood ("chapati",R.drawable.pic1,"80"));
        pfl.add(new popularfood ("ugali ",R.drawable.pic2,"80"));
        pfl.add(new popularfood ("rice",R.drawable.pic3,"80"));
        setPopularrecycler(pfl);




        List<availablefood> afl =new ArrayList<>();
        afl.add(new availablefood ("chapati",R.drawable.pic1,"80"));
        afl.add(new availablefood ("ugali ",R.drawable.pic2,"80"));
        afl.add(new availablefood ("rice",R.drawable.pic3,"80"));
        afl.add(new availablefood ("chapati",R.drawable.pic1,"80"));
        afl.add(new availablefood ("ugali ",R.drawable.pic2,"80"));
        afl.add(new availablefood ("rice",R.drawable.pic3,"80"));
        afl.add(new availablefood ("chapati",R.drawable.pic1,"80"));
        afl.add(new availablefood ("ugali ",R.drawable.pic2,"80"));
        afl.add(new availablefood ("rice",R.drawable.pic3,"80"));
        setAvailablerecycler(afl);







    }


    //created a recyclerview
    // created a modal class and adapter class
    // recycleview row item layout for the food called popular_food_row.xml



    public void setPopularrecycler ( List<popularfood> popularrecycler ){
       pr=  findViewById(R.id.popularrec);

       RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
    pr.setLayoutManager(layoutManager);
    popularfoodadapter =new popularfoodadapter(this,popularrecycler);
    pr.setAdapter(popularfoodadapter);

    }

    public void setAvailablerecycler ( List<availablefood> popularrecycler ){
        ar=  findViewById(R.id.available);

        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        ar.setLayoutManager(layoutManager);
        Availableadapter =new availableadapter(this,popularrecycler);
        ar.setAdapter(Availableadapter);

    }
}
