package com.codeclan.example.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by graemebrown on 22/01/2018.
 */

public class WordCountTest {

    String textBlock;
    WordCount counter;
    String textBlock2;

    @Before
    public void before(){
        textBlock = "two words";
        counter = new WordCount();
        textBlock2 = " there are three";
    }


    @Test
    public void canCountNumberOfWordsInAString(){
        assertEquals(new Integer(2), counter.countWords(textBlock));
    }

    @Test
    public void canCountWordsCorrectlyInStringWithLeadingSpace(){
        assertEquals(new Integer(3), counter.countWords(textBlock2));
    }
}
