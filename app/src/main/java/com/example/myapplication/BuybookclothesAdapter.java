package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class BuybookclothesAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final String[] mobnumber;
    private final Integer[] imgid;


    public BuybookclothesAdapter(Activity context, String[] maintitle, String[] subtitle,String[] mobnumber, Integer[] imgid
                               ) {
        super(context, R.layout.activity_buybookclothes, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.mobnumber=mobnumber;
        this.imgid=imgid;


    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_buybookclothes, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.fname);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.fplace);
        TextView mobNumberText=(TextView)rowView.findViewById(R.id.fmobileno);


        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        mobNumberText.setText(mobnumber[position]);


        return rowView;

    };
}
