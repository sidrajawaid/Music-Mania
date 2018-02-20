package com.example.sidra.mymusicapp;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ImageView song_dp;
    SeekBar seekbar;
    Button play_btn;
    Button pause_btn;
    Button stop_btn;
    Button previous_btn;
    Button next_btn;
    MediaPlayer mediaPlayer=new MediaPlayer();
    TextView song_duration;
    TextView song_Name;
    /*public void SavePreferences()
    {
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("state", play_btn.isSelected());
        editor.commit();
    }
    private void LoadPreferences(){
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        Boolean  state = sharedPreferences.getBoolean("state", false);
        //play_btn.isSelected(state);
    }
    public void onBackPressed()
    {
        System.out.println("backbutton");
        SavePreferences();
        super.onBackPressed();
    }
*/

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //LoadPreferences();

        Bundle bundle = getIntent().getExtras();
        final int  item_clicked  = bundle.getInt("item clicked");
        /*final int song_position=bundle.getInt("song");
        final int postion_item=bundle.getInt("itemposition");
        final String song_name=bundle.getString("songName");*/
        final ArrayList<ModelClass> rendered_list=(ArrayList<ModelClass>)getIntent().getSerializableExtra("array_list");
        song_dp=(ImageView) findViewById(R.id.seconddp);
        seekbar=(SeekBar)findViewById(R.id.seekBar);
        play_btn=(Button)findViewById(R.id.playbtn);
        previous_btn=(Button)findViewById(R.id.previousbtn);
        next_btn=(Button)findViewById(R.id.nextbtn);
        song_duration=(TextView)findViewById(R.id.songduration);
        song_Name=(TextView)findViewById(R.id.songname);
        rendered_list.get(item_clicked).getmSong_id();
        String temp ;
        song_Name.setText(String.valueOf(rendered_list.get(item_clicked).getSong_id()));
        if(item_clicked==0)
        {
            previous_btn.setEnabled(false);
            previous_btn.setBackgroundResource(R.drawable.disbaleprevious);
        }
        else if(item_clicked==rendered_list.size()-1)
        {
            next_btn.setEnabled(false);
            next_btn.setBackgroundResource(R.drawable.disablenext);

        }
        else{
            previous_btn.setEnabled(true);
            next_btn.setEnabled(true);
        }
        song_dp.setImageResource(rendered_list.get(item_clicked).getImage_id());
        //song_duration.setText(mediaPlayer.getDuration());

        play_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                play_btn.setSelected(!play_btn.isSelected());
                if(play_btn.isSelected())
                {
                    play_btn.setBackgroundResource(R.drawable.pausebtn);
                    mediaPlayer.create(Main2Activity.this,rendered_list.get(item_clicked).getmSong_id());
                    try {
                        mediaPlayer.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //song_duration.setText(mediaPlayer.getDuration());
                    mediaPlayer.start();


                    /*if(mediaPlayer.isPlaying()==true)
                    {
                        mediaPlayer.release();
                        mediaPlayer.create(Main2Activity.this,song_position);
                        mediaPlayer.start();
                    }
                    else if(mediaPlayer.isPlaying()==false)
                    {
                        mediaPlayer.create(Main2Activity.this,song_position);
                        mediaPlayer.start();

                    }*/
                }
                else if(!play_btn.isSelected())
                {
                    play_btn.setBackgroundResource(R.drawable.playbtn );
                    mediaPlayer.pause();
                   //int asrar= mediaPlayer.getCurrentPosition();
                   //Toast.makeText(Main2Activity.this,asrar,Toast.LENGTH_SHORT).show();
                }
                previous_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //mediaPlayer.setNextMediaPlayer();
                    }
                });
            }
        });

        /*seekbar.setMax(mediaPlayer.getDuration());
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });*/
        /*float duration=mediaPlayer.getDuration();
        song_duration.setText((int) duration);*/

    }
}
