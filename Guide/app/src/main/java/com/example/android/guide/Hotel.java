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
        tours.add(new tour("J W Marriot",R.drawable.jw));
        tours.add(new tour("Sonarbangla",R.drawable.s));
        tours.add(new tour("Novotel",R.drawable.novo));
        tours.add(new tour("Taj Bengal",R.drawable.tb));

        RestraurantAdapter itemAdapter= new RestraurantAdapter(this,tours);

        ListView listView=(ListView) findViewById(R.id.hotel);

        listView.setAdapter(itemAdapter);


    }
}