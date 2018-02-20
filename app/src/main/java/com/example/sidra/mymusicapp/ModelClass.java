package com.example.sidra.mymusicapp;

import java.io.Serializable;

/**
 * Created by Sidra on 10/24/2017.
 */

public class ModelClass implements Serializable {
    private int image_id;
    private String song_id;
    private String singer_id;
    private int mSong_id;
    public ModelClass(int image_id, String song_id, String singer_id,int mSong_id) {

        this.image_id = image_id;
        this.song_id = song_id;
        this.singer_id = singer_id;
        this.mSong_id=mSong_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public void setSong_id(String song_id) {
        this.song_id = song_id;
    }

    public void setSinger_id(String singer_id) {
        this.singer_id = singer_id;
    }

    public void setmSong_id(int mSong_id) {
        this.mSong_id = mSong_id;
    }

    public int getmSong_id() {

        return mSong_id;
    }

    public int getImage_id() {

        return image_id;
    }

    public String getSong_id() {
        return song_id;
    }

    public String getSinger_id() {
        return singer_id;
    }


}
