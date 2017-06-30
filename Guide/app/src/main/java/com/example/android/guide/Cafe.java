package com.example.android.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Cafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        ArrayList<tour> tours=new ArrayList<tour>();
        tours.add(new tour(getString(R.string.flu),R.drawable.flu));
        tours.add(new tour(getString(R.string.ccd),R.drawable.ccd));
        tours.add(new tour(getString(R.string.bon),R.drawable.ba));
        tours.add(new tour(getString(R.string.owl),R.drawable.wo));
        RestraurantAdapter itemAdapter= new RestraurantAdapter(this,tours);
        ListView listView=(ListView) findViewById(R.id.cafe);
        listView.setAdapter(itemAdapter);
    }
}