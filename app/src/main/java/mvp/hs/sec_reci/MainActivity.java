package mvp.hs.sec_reci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import mvp.hs.sec_reci.Model.Music;
import mvp.hs.sec_reci.Adapters.*;
public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    Adapter adapter;
    ArrayList<Music> musics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        AddMusic();
        adapter=new Adapter(musics);
        recyclerView.setAdapter(adapter);

    }
    public void AddMusic(){
        musics= new ArrayList<>();
        for(int i=0;i<20;i++)
            musics.add(new Music("Tamer Hosny"+i,"عيش بشوقك",R.drawable.tamer));
    }
}
