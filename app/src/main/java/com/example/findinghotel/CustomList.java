package com.example.findinghotel;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] mess;
    private final Integer[] imageId;


    public CustomList(Activity context,String [] mess,Integer [] imageId) {
        super(context,R.layout.custom_list,mess);
        this.context=context;
        this.mess=mess;
        this.imageId=imageId;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_list,null,true);
        TextView txtTitle=rowView.findViewById(R.id.txt);
        ImageView imageView=rowView.findViewById(R.id.img);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,DetailActivity.class);
                intent.putExtra("key",mess[position]);
                context.startActivity(intent);
            }
        });
        txtTitle.setText(mess[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
