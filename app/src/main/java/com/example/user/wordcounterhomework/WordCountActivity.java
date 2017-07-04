package com.example.user.wordcounterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {
    EditText text_text;
    TextView answer_text;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");

        text_text = (EditText) findViewById(R.id.text_text); //element to type words into
        answer_text = (TextView) findViewById(R.id.answer_text); //count after button pressed
        countButton = (Button) findViewById(R.id.countButton); //button to press
    }

    public void onCountButtonClicked(View button) {
        String text = text_text.getText().toString();
        Log.d(getClass().toString(), "onCountButtonClicked was called");
        Log.d(getClass().toString(), "The text entered was '" + text + "'");

        //Researched from StackOverFlow for how to count words in a string
        //\s+ is for whitespace
        String[] wordsToAdd = text.split("\\s+");

        Words words = new Words();
        for (String word : wordsToAdd) {
            words.add(word);
        }
        answer_text.setText(Integer.toString(words.getCount()));
    }
}
