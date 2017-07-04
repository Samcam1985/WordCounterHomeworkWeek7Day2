package com.example.user.wordcounterhomework;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 04/07/2017.
 */

public class Words{
    private ArrayList<String> words;

    public Words() {
        words = new ArrayList<String>();
        setUpWords();
    }

    public Words(ArrayList<String> newWords) {
        words = newWords;
    }

    public ArrayList<String> getWords() {
        return new ArrayList<String>(words);
    }

    public int getCount() {
        return words.size();
    }

    private void setUpWords() {
        String[] wordsToAdd = {
                "Yes",
                "That",
                "is",
                "fine",
                "now"
        };

        for (String word : wordsToAdd) {
            words.add(word);
        }
    }

    public void add(String word) {
        words.add(word);
    }
}
