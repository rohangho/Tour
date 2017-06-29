package com.example.android.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        ArrayList<tour> tours=new ArrayList<tour>();
        tours.add(new tour("Barbeque Nation",R.drawable.bbq));
        tours.add(new tour("Flame and Grills",R.drawable.fg));
        tours.add(new tour("MainLand China",R.drawable.mc));
        tours.add(new tour("Chili's",R.drawable.c));

        RestraurantAdapter itemAdapter= new RestraurantAdapter(this,tours);

        ListView listView=(ListView) findViewById(R.id.restraurant);

        listView.setAdapter((ListAdapter) itemAdapter);

    }
}
