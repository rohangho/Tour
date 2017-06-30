package com.example.android.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.guide.R.drawable.s;

public class Restraurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraurant);
        ArrayList<tour> tours=new ArrayList<tour>();
        tours.add(new tour(getString(R.string.bbq),R.drawable.bbq));
        tours.add(new tour(getString(R.string.fg),R.drawable.fg));
        tours.add(new tour(getString(R.string.main),R.drawable.mc));
        tours.add(new tour(getString(R.string.chili),R.drawable.c));
        RestraurantAdapter itemAdapter= new RestraurantAdapter(this,tours);
        ListView listView=(ListView) findViewById(R.id.restraurant);
        listView.setAdapter(itemAdapter);
    }
 }
