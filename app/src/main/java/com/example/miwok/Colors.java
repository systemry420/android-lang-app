package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "weṭeṭṭi"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}