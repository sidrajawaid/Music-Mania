package com.example.sidra.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView settingbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<ModelClass> arr_mod=new ArrayList<ModelClass>();
        arr_mod.add(new ModelClass(R.drawable.cheapthrills,"Cheap thrills","Sia",R.raw.sia));
        arr_mod.add(new ModelClass(R.drawable.despacito,"Despacito","Luis Fronsi",R.raw.despacito));
        arr_mod.add(new ModelClass(R.drawable.shapeofyou,"Shape of You","Ed Sheeran",R.raw.shapeofyou));
        arr_mod.add(new ModelClass(R.drawable.everyight,"Every Night","Celin Dion",R.raw.everynight));
        arr_mod.add(new ModelClass(R.drawable.rideit,"Ride it","Jay sean",R.raw.rideit));
        arr_mod.add(new ModelClass(R.drawable.down,"Down","Jay sean",R.raw.downdown));
        arr_mod.add(new ModelClass(R.drawable.forever,"forever","Chris Brown",R.raw.forever));
        arr_mod.add(new ModelClass(R.drawable.righnow,"Right now","Akon",R.raw.rightnow));
        arr_mod.add(new ModelClass(R.drawable.lovemelikeyoudo,"Love me like you do","Ellie Goulding",R.raw.lovemelikeyoudo));
        arr_mod.add(new ModelClass(R.drawable.smackthat,"Smack that","Akon",R.raw.smackthat));
        arr_mod.add(new ModelClass(R.drawable.temperature,"Temperature","Sean Paul",R.raw.temperature));
        arr_mod.add(new ModelClass(R.drawable.dynamite,"dynamite","Taio Cruz",R.raw.dynamite));
        arr_mod.add(new ModelClass(R.drawable.stereolove,"Stereo Love","Edward Maya",R.raw.stereolove));
        arr_mod.add(new ModelClass(R.drawable.gottoloveyou,"Got 2 Love you"," Sean Paul",R.raw.gottoloveyou));
        arr_mod.add(new ModelClass(R.drawable.djgotus,"DJ got us fallin in love","Usher",R.raw.djgotus));
        arr_mod.add(new ModelClass(R.drawable.saturdaynight,"Saturday Night","Whigfield",R.raw.saturdaynight));
        arr_mod.add(new ModelClass(R.drawable.hipdontlie,"Hips don't lie","Shakira",R.raw.hipsdontlie));
        arr_mod.add(new ModelClass(R.drawable.wakawaka,"Waka Waka","Shakira",R.raw.wakawaka));
        arr_mod.add(new ModelClass(R.drawable.rideit,"Ride it","Jay Sean",R.raw.rideit));
        arr_mod.add(new ModelClass(R.drawable.criminal,"criminal","Britney Spears",R.raw.criminal));
        arr_mod.add(new ModelClass(R.drawable.tilltheworldends,"Till the world ends","Britney Spears",R.raw.tilltheworldends));
        arr_mod.add(new ModelClass(R.drawable.superbass,"Super Bass","Nicki Minaj",R.raw.superbass));
        arr_mod.add(new ModelClass(R.drawable.yourlove,"Your Love","Nicki Minaj",R.raw.yourlove));
        arr_mod.add(new ModelClass(R.drawable.gypsy1,"Gypsy","Shakira",R.raw.gypsy));
        arr_mod.add(new ModelClass(R.drawable.gypsy1,"Hypnotise You","NERD",R.raw.hypnotize));
        CustomAdapter customAdapter=new CustomAdapter(this,arr_mod);
        final ListView list_view=(ListView)findViewById(R.id.customlistview);
        list_view.setAdapter(customAdapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item_clicked= position;
                /*int itemAtPosition= arr_mod.get(position).getImage_id();
                int songPosition=arr_mod.get(position).getmSong_id();
                String songName=arr_mod.get(position).getSong_id();
                *///Toast.makeText(MainActivity.this," here it is ",Toast.LENGTH_SHORT).show();
                Intent play_screen=new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle=new Bundle();
                bundle.putInt("item clicked",item_clicked);
                /*bundle.putInt("song",songPosition);
                bundle.putInt("itemposition",itemPosition);
                bundle.putString("songName",songName);*/
                bundle.putSerializable("array_list",arr_mod);
                 play_screen.putExtras(bundle);
                //play_screen.putExtra("array_list",arr_mod);
                startActivity(play_screen);


            }
        });


    }
    }
