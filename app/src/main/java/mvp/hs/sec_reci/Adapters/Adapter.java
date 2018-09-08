package mvp.hs.sec_reci.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import mvp.hs.sec_reci.Model.Music;
import mvp.hs.sec_reci.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<Music>music_List;
    public Adapter(ArrayList<Music>music_List)
    {
        this.music_List=music_List;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View myView=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.music_view,viewGroup,false);
        // Return a new holder instance
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Music my_music = music_List.get(i);

        viewHolder.singer_image.setImageResource(my_music.getSinger_image());

        viewHolder.singer_name.setText(my_music.getSinger_name());

        viewHolder.singer_song.setText(my_music.getSinger_song());
    }

    @Override
    public int getItemCount() {
        return music_List.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public final ImageView singer_image;
        public final TextView singer_name,singer_song;
        ViewHolder(View v)
        {
            super(v);
            singer_image = v.findViewById(R.id.singer_image);
            singer_name = v.findViewById(R.id.singer_name);
            singer_song = v.findViewById(R.id.singer_song);
        }

    }

}
