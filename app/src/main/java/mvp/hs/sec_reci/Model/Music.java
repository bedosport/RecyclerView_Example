package mvp.hs.sec_reci.Model;

import android.app.Activity;
import android.os.Bundle;

import mvp.hs.sec_reci.R;

public class Music{
    String singer_name;
    String singer_song;
    int singer_image;


    public Music(String singer_name, String singer_song, int singer_image) {
        this.singer_name = singer_name;
        this.singer_song = singer_song;
        this.singer_image = singer_image;
    }

    public void setSinger_name(String singer_name) {

        this.singer_name = singer_name;
    }

    public void setSinger_song(String singer_song) {
        this.singer_song = singer_song;
    }

    public void setSinger_image(int singer_image) {
        this.singer_image = singer_image;
    }

    public String getSinger_name() {
        return singer_name;
    }

    public String getSinger_song() {
        return singer_song;
    }

    public int getSinger_image() {
        return singer_image;
    }
}
