package com.example.rentalbike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    Context context;
    String listFruit[];
    int listImages[];
    LayoutInflater inflater;

    public Adapter(Context ctx, String [] fruitList, int [] images){
        this.context = ctx;
        this.listFruit = fruitList;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }



    @Override
    public int getCount() {
        return listFruit.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position , View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_city_list, null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView friutImg = (ImageView) convertView.findViewById(R.id.imageIcon);
        textView.setText(listFruit[position]);
        friutImg.setImageResource(listImages[position]);
        return convertView;
    }
}
