package com.gaurav.listexample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class myAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] titles;

    public myAdapter(Activity context, String[] titles) {
        super(context, R.layout.list_item_layout, titles);
        this.context = context;
        this.titles = titles;
    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.list_item_layout, null,true);

        TextView titleText = rowView.findViewById(R.id.title);

        titleText.setText(titles[position]);

        return rowView;

    };
}