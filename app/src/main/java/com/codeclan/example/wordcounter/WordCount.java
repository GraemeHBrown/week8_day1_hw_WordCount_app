package com.codeclan.example.wordcounter;

/**
 * Created by graemebrown on 22/01/2018.
 */

public class WordCount {

    public Integer countWords(String textBlock){
        String[] words = textBlock.trim().split("\\s+");
        return words.length;
    }
}
