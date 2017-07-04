package com.example.user.wordcounterhomework;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;
/**
 * Created by user on 04/07/2017.
 */

public class WordsTest {
    Words words;
    ArrayList<String> testwords;

    @Before
    public void before() {
        words = new Words();
        testwords = new ArrayList<String>();
        testwords.add("This");
        testwords.add("We");
        testwords.add("can");
    }

    @Test
    public void getWordsTest() {
        assertNotNull(words.getWords());
    }

    @Test
    public void testSetUpWords() {
        assertEquals(5, words.getCount());
    }

    @Test
    public void createWordsWithList() {
        words = new Words(testwords);
        assertEquals(3, words.getCount());
    }

    @Test
    public void addTest() {
        int originalNumberOfWords = words.getCount();
        words.add("Hello");
        assertEquals(originalNumberOfWords + 1, words.getCount());
    }
}