package com.example.user.wordcounterhomework;

import java.util.ArrayList;

/**
 * Created by user on 04/07/2017.
 */

public class Words {
    private ArrayList<String> words;

    public Words() {
        words = new ArrayList<String>();
    }

    public ArrayList<String> getWords() {
        return new ArrayList<String>(words);
    }

    public int count() {
        return words.size();
    }

}
