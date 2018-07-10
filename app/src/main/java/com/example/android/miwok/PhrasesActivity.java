package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word("Tumar naam ki?","What is your name?",
                R.raw.phrases_what_is_your_name));
        phrases.add(new Word("Mur naam Android","My name is Android",R.raw.phrases_name_answer));
        phrases.add(new Word("Ki Khobor?","How are you?",R.raw.phrases_how_are_you));
        phrases.add(new Word("Mur bhal","I am good",R.raw.phrases_i_am_good));
        phrases.add(new Word("Ki kori asa?","What are you doing",R.raw.phrases_what_are_you_doing));
        phrases.add(new Word("Moi football kheli asu","I am playing football",R.raw.phrases_i_am_going_home));
        phrases.add(new Word("Moi ghor jau","I'm going home",R.raw.phrases_i_am_going_home));
        phrases.add(new Word("Mur ga beya lagise","I'm not feeling well",R.raw.phrases_feeling_well));
        phrases.add(new Word("Muk chips lage","I want chips",R.raw.phrases_i_want_chips));

        WordAdapter adapter = new WordAdapter(this,phrases,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = phrases.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });

    }
}
