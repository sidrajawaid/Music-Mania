package com.example.sidra.mymusicapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by Sidra on 10/10/2017.
 */

public class CustomAdapter extends ArrayAdapter<ModelClass> {
    Button settingbtn;
    PopupMenu popupMenu;
    public CustomAdapter(@NonNull Context context, ArrayList<ModelClass> modelClasses) {
        super(context, 0,modelClasses);
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layout_inflater=(LayoutInflater.from(getContext()));
        View custom_view=layout_inflater.inflate(R.layout.customlayout,parent,false);
        ModelClass model_class=getItem(position);
        ImageView image_view=(ImageView)custom_view.findViewById(R.id.image);
        TextView tv_1=(TextView)custom_view.findViewById(R.id.song_name);
        TextView tv_2=(TextView)custom_view.findViewById(R.id.singer_name);
        image_view.setImageResource(model_class.getImage_id());
        tv_1.setText(model_class.getSong_id());
        tv_2.setText(model_class.getSinger_id());





        return custom_view ;
    }
}
