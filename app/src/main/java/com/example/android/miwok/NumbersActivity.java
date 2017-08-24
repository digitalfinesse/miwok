package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "ottiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyasa"));
        words.add(new Word("five", "massoka"));
        words.add(new Word("six", "temmoka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo'e"));
        words.add(new Word("ten", "na'acha"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list_item);
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
//        GridView listView = (GridView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
