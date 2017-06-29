package com.example.android.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        ArrayList<tour> tours=new ArrayList<tour>();
        tours.add(new tour("Hoppipola",R.drawable.hop));
        tours.add(new tour("Opium",R.drawable.op));
        tours.add(new tour("Xrong Place",R.drawable.xp));
        tours.add(new tour("10 Downing Street",R.drawable.down));

        RestraurantAdapter itemAdapter= new RestraurantAdapter(this,tours);

        ListView listView=(ListView) findViewById(R.id.bar);

        listView.setAdapter(itemAdapter);


    }
}