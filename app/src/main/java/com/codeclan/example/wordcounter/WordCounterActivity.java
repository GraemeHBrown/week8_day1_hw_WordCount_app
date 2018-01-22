package com.codeclan.example.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText textBlockEditText;
    Button countButton;
    TextView wordCount;
    WordCount counter;
    TextView magicNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_count_activity_main);
        textBlockEditText = findViewById(R.id.textBlock);
        countButton = findViewById(R.id.get_word_count_button);
        wordCount = findViewById(R.id.word_count);
        magicNumber = findViewById(R.id.magicNumber);
    }

    public void onCountButtonClick(View button) {
        String block = String.valueOf(textBlockEditText.getText());
        counter = new WordCount();
        Integer count = counter.countWords(block);
        wordCount.setText(count.toString());
        magicNumber.setText("... is the magic number!!");
    }
}
