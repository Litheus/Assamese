package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Deuta","Father",R.drawable.family_father,R.raw.family_father));
        family.add(new Word("Ma","Mother",R.drawable.family_mother,R.raw.family_mother));
        family.add(new Word("Koka","Grandfather",R.drawable.family_grandfather,
                R.raw.family_grandfather));
        family.add(new Word("Aita","Grandmother",R.drawable.family_grandmother,
                R.raw.family_grandmother));
        family.add(new Word("Dada","Older Brother",R.drawable.family_older_brother,
                R.raw.family_elder_brother));
        family.add(new Word("Ba","Older Sister",R.drawable.family_older_sister,
                R.raw.family_elder_sister));
        family.add(new Word("Bhaiti","Younger Brother",R.drawable.family_younger_brother,
                R.raw.family_younger_brother));
        family.add(new Word("Bhonti","Younger Sister",R.drawable.family_younger_sister,
                R.raw.family_younger_sister));
        family.add(new Word("Lora","Son",R.drawable.family_son,R.raw.family_son));
        family.add(new Word("Suwali","Daughter",R.drawable.family_daughter,
                R.raw.family_daughter));

        WordAdapter adapter = new WordAdapter(this,family, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = family.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
