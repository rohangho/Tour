package com.example.android.guide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.guide.R.drawable.c;
import static java.security.AccessController.getContext;

public class RestraurantAdapter extends ArrayAdapter<tour> {

    public RestraurantAdapter(Activity context, ArrayList<tour>tours ){
        super(context,0,tours);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        tour current = getItem(position);
        TextView nameTextView = (TextView) listView.findViewById(R.id.name_of_restraurant);
        nameTextView.setText(current.getresname());
        ImageView image=(ImageView) listView.findViewById(R.id.image);
        image.setImageResource(current.getimg());
        return listView;
    }
}


