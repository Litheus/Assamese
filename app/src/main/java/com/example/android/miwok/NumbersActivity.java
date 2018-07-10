package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Ek", R.drawable.number_one,R.raw.numbers_one));
        words.add(new Word("Two", "Dui", R.drawable.number_two,R.raw.numbers_two));
        words.add(new Word("Three", "Tini", R.drawable.number_three,R.raw.numbers_three));
        words.add(new Word("Four", "Sari", R.drawable.number_four,R.raw.numbers_four));
        words.add(new Word("Five", "Paas", R.drawable.number_five,R.raw.numbers_five));
        words.add(new Word("Six", "Soi", R.drawable.number_six,R.raw.numbers_six));
        words.add(new Word("Seven", "Xath", R.drawable.number_seven,R.raw.numbers_seven));
        words.add(new Word("Eight", "Aath", R.drawable.number_eight,R.raw.numbers_eight));
        words.add(new Word("Nine", "Na", R.drawable.number_nine,R.raw.numbers_nine));
        words.add(new Word("Ten", "Dos", R.drawable.number_ten,R.raw.numbers_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}
