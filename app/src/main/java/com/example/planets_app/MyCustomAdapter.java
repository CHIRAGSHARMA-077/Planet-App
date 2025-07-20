package com.example.planets_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planets> {
    private ArrayList<Planets> planetsArrayList;
    Context context;

    public MyCustomAdapter (ArrayList<Planets> planetsArrayList, Context context) {
        super(context, R.layout.item_list_layout,planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context; 
    }
    // ViewHolder class
    private static class MyViewHolder{
        // it requires references to the views to hold them
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;
        // getView(): it is used to create and return a  view for specific item in a list.

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the plannet object for current position
        // getItem is used to retrive the data from a specific position
        // position is the index of item for which u want to retrive the corresponding planet object , getItem method takes this index as an argument and return the object located in the position as the data list provided to the adapter

        Planets planets = getItem(position);
        // infalte layout
        MyViewHolder myViewHolder;
        final View result;
        if(convertView==null){
            myViewHolder= new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView= inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            ); // @NonNull ViewGroup parent) :- this parameter is satisfied
            // Finding views
            myViewHolder.planetName= (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount=(TextView) convertView.findViewById(R.id.moon_count);
            myViewHolder.planetImage=(ImageView) convertView.findViewById(R.id.imageView);
            result=convertView;
            convertView.setTag(myViewHolder);
        }else {
            // the view is recycled
            myViewHolder= (MyViewHolder) convertView.getTag();
            result=convertView;
        }
        myViewHolder.planetName.setText(planets.getPlanetName());
        myViewHolder.moonCount.setText(planets.getMoonCount());
        myViewHolder.planetImage.setImageResource(planets.getPlanetImage());
        return result;

    }


}
