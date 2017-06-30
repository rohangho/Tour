package com.example.android.guide;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.android.guide.R.string.Sort;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView res = (TextView) findViewById(R.id.restaura);
        res.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent resintent = new Intent(MainActivity.this, Restraurant.class);
                startActivity(resintent);
                Toast.makeText(MainActivity.this,getString(R.string.Sort), Toast.LENGTH_LONG).show();
            }
        });
        TextView hot = (TextView) findViewById(R.id.hot);
        hot.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent resintent = new Intent(MainActivity.this, Hotel.class);
                startActivity(resintent);
                Toast.makeText(MainActivity.this, getString(R.string.Sort), Toast.LENGTH_LONG).show();
            }
        });
        TextView cafe = (TextView) findViewById(R.id.cafe);
        cafe.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent resintent = new Intent(MainActivity.this, Cafe.class);
                startActivity(resintent);
                Toast.makeText(MainActivity.this,getString(R.string.Sort) , Toast.LENGTH_LONG).show();
            }
        });
        TextView bar = (TextView) findViewById(R.id.bar);
        bar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent resintent = new Intent(MainActivity.this, Bar.class);
                startActivity(resintent);
                Toast.makeText(MainActivity.this,getString(R.string.Sort), Toast.LENGTH_LONG).show();
            }
        });
    }
}
