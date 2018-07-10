package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Black","Kola",R.drawable.color_black,R.raw.colours_black));
        colors.add(new Word("White","Boga",R.drawable.color_white,R.raw.colours_white));
        colors.add(new Word("Red","Ronga",R.drawable.color_red,R.raw.colours_red));
        colors.add(new Word("Green","Xeuzia",R.drawable.color_green,R.raw.colours_green));
        colors.add(new Word("Yellow","Halodhia",R.drawable.color_mustard_yellow,R.raw.colours_yellow));
        colors.add(new Word("Brown","Matiya",R.drawable.color_brown,R.raw.colours_brown));

        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = colors.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });



    }
}
